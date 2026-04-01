package com.day11.demo27;

import javax.swing.*;
import java.awt.*;

public class BalancingCar extends JFrame {

    private double pitch = 0.05;
    private double pitchVel = 0;
    private double torque = 0;

    private final double Kp = 25;
    private final double Kd = 8;
    private double lastError = 0;

    private final double dt = 1.0 / 60;
    private final double gravity = 9.81;
    private final double damping = 0.05;
    private final double torqueLimit = 20;

    public BalancingCar() {
        setTitle("2D单轮自平衡小车");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new DrawPanel());
        setLocationRelativeTo(null);
    }

    public void start() {
        new Timer(16, e -> {
            double error = -pitch;
            double P = Kp * error;
            double D = Kd * (error - lastError) / dt;
            torque = P + D;

            torque = Math.max(-torqueLimit, Math.min(torqueLimit, torque));
            lastError = error;

            double pitchAcc = -torque * 0.2 - gravity * Math.sin(pitch) - damping * pitchVel;
            pitchVel += pitchAcc * dt;
            pitch += pitchVel * dt;

            repaint();
        }).start();
    }

    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(new Color(20, 20, 30));

            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // 字体修复 → 显示正常中文，不是问号
            g2d.setFont(new Font("微软雅黑", Font.PLAIN, 18));

            int cx = getWidth() / 2;
            int groundY = 450;    // 地面高度
            int wheelR = 25;      // 轮子半径
            int cy = groundY - wheelR; // 车轮圆心位置（贴地面）
            int rodLength = 140;  // 杆子长度

            // 画地面
            g2d.setColor(Color.GRAY);
            g2d.setStroke(new BasicStroke(2));
            g2d.drawLine(0, groundY, getWidth(), groundY);

            // 画杆子（从轮子圆心向上画，不会穿地面）
            g2d.setColor(Color.CYAN);
            g2d.setStroke(new BasicStroke(5));
            double x = cx + rodLength * Math.sin(-pitch);
            double y = cy - rodLength * Math.cos(pitch);
            g2d.drawLine(cx, cy, (int) x, (int) y);

            // 画车轮
            g2d.setColor(Color.GREEN);
            g2d.fillOval(cx - wheelR, cy - wheelR, wheelR * 2, wheelR * 2);

            // 显示数据（文字正常）
            g2d.setColor(Color.WHITE);
            g2d.drawString(String.format("倾角: %.2f °", Math.toDegrees(pitch)), 30, 40);
            g2d.drawString(String.format("力矩: %.2f", torque), 30, 70);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BalancingCar car = new BalancingCar();
            car.setVisible(true);
            car.start();
        });
    }
}