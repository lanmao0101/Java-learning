package com.day12.demo03;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * 魔法数独 - Java Swing桌面版
 * 包含数字剩余计数、难度选择、错误提示等完整功能
 */
public class MagicSudoku extends JFrame {
    // 颜色配置（魔法主题）
    private static final Color GOLD = new Color(212, 175, 55);
    private static final Color GOLD_LIGHT = new Color(240, 230, 140);
    private static final Color PARCHMENT = new Color(245, 241, 226);
    private static final Color DARK_MAGIC = new Color(26, 20, 9);
    private static final Color ERROR_BG = new Color(255, 238, 238);
    private static final Color SUCCESS_BG = new Color(230, 255, 238);

    // 游戏核心数据
    private int[][] board = new int[9][9];       // 当前棋盘
    private int[][] solution = new int[9][9];    // 答案
    private int[][] original = new int[9][9];    // 初始棋盘
    private int selectedRow = -1, selectedCol = -1;
    private String difficulty = "easy";
    private boolean gameStarted = false;

    // UI组件
    private SudokuCell[][] cells = new SudokuCell[9][9];
    private JLabel[] numberCountLabels = new JLabel[10];
    private JLabel statusLabel;
    private javax.swing.Timer gameTimer;
    private int elapsedTime = 0;

    public MagicSudoku() {
        // 窗口基础设置
        setTitle("魔法数独");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));
        getContentPane().setBackground(DARK_MAGIC);

        // 创建UI
        createTitlePanel();
        createGamePanel();
        createControlPanel();

        // 初始化游戏
        initializeBoard();
        generateSudoku();

        // 窗口自适应
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    // ====================== UI创建 ======================
    private void createTitlePanel() {
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(DARK_MAGIC);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));

        JLabel title = new JLabel("魔法数独");
        title.setFont(new Font("Garamond", Font.BOLD, 36));
        title.setForeground(GOLD);

        JLabel subtitle = new JLabel("解开古老羊皮纸上的数字谜题");
        subtitle.setFont(new Font("Garamond", Font.PLAIN, 16));
        subtitle.setForeground(PARCHMENT);

        titlePanel.add(title);
        titlePanel.add(subtitle);
        add(titlePanel, BorderLayout.NORTH);
    }

    private void createGamePanel() {
        JPanel boardPanel = new JPanel(new GridLayout(9, 9, 0, 0));
        boardPanel.setBackground(PARCHMENT);
        boardPanel.setBorder(BorderFactory.createLineBorder(GOLD, 2));

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                cells[row][col] = new SudokuCell(row, col);
                final int r = row, c = col;

                cells[row][col].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        selectCell(r, c);
                    }
                });

                Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
                if (row % 3 == 0 && row != 0) {
                    border = BorderFactory.createMatteBorder(2, 1, 1, 1, GOLD);
                }
                if (col % 3 == 0 && col != 0) {
                    Color topColor = (row % 3 == 0 && row != 0) ? GOLD : Color.GRAY;
                    int topWidth = (row % 3 == 0 && row != 0) ? 2 : 1;
                    border = BorderFactory.createMatteBorder(topWidth, 2, 1, 1, GOLD);
                }
                cells[row][col].setBorder(border);

                boardPanel.add(cells[row][col]);
            }
        }

        JPanel wrapper = new JPanel();
        wrapper.setBackground(DARK_MAGIC);
        wrapper.add(boardPanel);
        add(wrapper, BorderLayout.CENTER);
    }

    private void createControlPanel() {
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.setBackground(PARCHMENT);
        controlPanel.setBorder(BorderFactory.createLineBorder(GOLD, 1));
        controlPanel.setPreferredSize(new Dimension(220, 0));

        // 难度
        JPanel difficultyPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        difficultyPanel.setBackground(PARCHMENT);
        String[] diffs = {"简单", "中等", "困难"};
        for (String diff : diffs) {
            JButton btn = new JButton(diff);
            btn.setBackground(GOLD_LIGHT);
            btn.setFocusPainted(false);
            btn.addActionListener(e -> {
                difficulty = diff.equals("简单") ? "easy" : diff.equals("中等") ? "medium" : "hard";
                newGame();
            });
            difficultyPanel.add(btn);
        }

        // 状态
        statusLabel = new JLabel("准备开始新游戏");
        statusLabel.setFont(new Font("Garamond", Font.PLAIN, 14));

        // 数字剩余计数（核心功能）
        JPanel numberCounterPanel = new JPanel(new GridLayout(2, 9, 3, 3));
        numberCounterPanel.setBackground(PARCHMENT);
        numberCounterPanel.setBorder(BorderFactory.createTitledBorder("数字剩余"));

        for (int i = 1; i <= 9; i++) {
            JLabel numLabel = new JLabel(String.valueOf(i));
            numLabel.setHorizontalAlignment(SwingConstants.CENTER);
            numLabel.setForeground(GOLD);
            numLabel.setFont(new Font("Arial", Font.BOLD, 12));

            numberCountLabels[i] = new JLabel("9");
            numberCountLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            numberCountLabels[i].setFont(new Font("Arial", Font.BOLD, 12));

            numberCounterPanel.add(numLabel);
            numberCounterPanel.add(numberCountLabels[i]);
        }

        // 按钮
        JButton newGameBtn = createButton("新游戏");
        JButton checkBtn = createButton("检查答案");
        JButton rulesBtn = createButton("数独规则");

        newGameBtn.addActionListener(e -> newGame());
        checkBtn.addActionListener(e -> checkSolution());
        rulesBtn.addActionListener(e -> showRules());

        // 组装
        controlPanel.add(createSpacing(10));
        controlPanel.add(difficultyPanel);
        controlPanel.add(createSpacing(10));
        controlPanel.add(statusLabel);
        controlPanel.add(createSpacing(10));
        controlPanel.add(numberCounterPanel);
        controlPanel.add(createSpacing(10));
        controlPanel.add(newGameBtn);
        controlPanel.add(createSpacing(5));
        controlPanel.add(checkBtn);
        controlPanel.add(createSpacing(5));
        controlPanel.add(rulesBtn);

        add(controlPanel, BorderLayout.EAST);

        // 键盘监听
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyInput(e.getKeyCode());
            }
        });
        setFocusable(true);
    }

    // ====================== 游戏核心逻辑 ======================
    private void initializeBoard() {
        for (int row = 0; row < 9; row++) {
            Arrays.fill(board[row], 0);
            Arrays.fill(solution[row], 0);
            Arrays.fill(original[row], 0);
        }
    }

    private void generateSudoku() {
        // 生成答案
        createSolution();

        // 复制
        for (int i = 0; i < 9; i++) {
            System.arraycopy(solution[i], 0, original[i], 0, 9);
            System.arraycopy(solution[i], 0, board[i], 0, 9);
        }

        // 根据难度挖空
        int removeCount = difficulty.equals("easy") ? 30 : difficulty.equals("medium") ? 40 : 50;
        Random rand = new Random();

        for (int i = 0; i < removeCount; i++) {
            int r = rand.nextInt(9);
            int c = rand.nextInt(9);
            if (original[r][c] != 0) {
                original[r][c] = 0;
                board[r][c] = 0;
            } else {
                i--;
            }
        }

        updateBoardUI();
        updateNumberCounter();
    }

    private boolean createSolution() {
        return fillBoard(0, 0);
    }

    private boolean fillBoard(int row, int col) {
        if (row == 9) return true;
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col == 8) ? 0 : col + 1;

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Collections.shuffle(nums);

        for (int num : nums) {
            if (isValidMove(row, col, num)) {
                solution[row][col] = num;
                if (fillBoard(nextRow, nextCol)) return true;
                solution[row][col] = 0;
            }
        }
        return false;
    }

    private boolean isValidMove(int row, int col, int num) {
        // 检查行/列
        for (int i = 0; i < 9; i++) {
            if (solution[row][i] == num || solution[i][col] == num) return false;
        }

        // 检查3x3宫格
        int boxR = row / 3 * 3;
        int boxC = col / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (solution[boxR + i][boxC + j] == num) return false;
            }
        }
        return true;
    }

    // ====================== UI更新 ======================
    private void updateBoardUI() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                cells[row][col].setValue(board[row][col]);
                cells[row][col].setBackground(PARCHMENT);

                if (original[row][col] != 0) {
                    cells[row][col].setForeground(DARK_MAGIC);
                    cells[row][col].setFont(new Font("Arial", Font.BOLD, 18));
                } else if (board[row][col] != 0) {
                    cells[row][col].setForeground(GOLD);
                    cells[row][col].setFont(new Font("Arial", Font.BOLD, 18));
                }
            }
        }
    }

    // 更新数字剩余计数
    private void updateNumberCounter() {
        int[] count = new int[10];
        Arrays.fill(count, 9);

        // 统计已填数字
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int num = board[row][col];
                if (num != 0) count[num]--;
            }
        }

        // 更新显示
        for (int i = 1; i <= 9; i++) {
            numberCountLabels[i].setText(String.valueOf(count[i]));

            // 颜色提示
            if (count[i] == 0) {
                numberCountLabels[i].setForeground(Color.GREEN.darker());
            } else if (count[i] <= 3) {
                numberCountLabels[i].setForeground(GOLD);
            } else if (count[i] >= 7) {
                numberCountLabels[i].setForeground(Color.RED);
            } else {
                numberCountLabels[i].setForeground(DARK_MAGIC);
            }
        }
    }

    private void selectCell(int row, int col) {
        if (original[row][col] != 0) return;

        // 清除之前选中
        if (selectedRow != -1) {
            cells[selectedRow][selectedCol].setBorderColor(Color.GRAY);
        }

        // 设置新选中
        selectedRow = row;
        selectedCol = col;
        cells[row][col].setBorderColor(GOLD);

        if (!gameStarted) startGame();
    }

    // ====================== 游戏控制 ======================
    private void newGame() {
        stopTimer();
        gameStarted = false;
        elapsedTime = 0;
        selectedRow = selectedCol = -1;
        initializeBoard();
        generateSudoku();
        statusLabel.setText("请开始填充数字");
    }

    private void startGame() {
        gameStarted = true;
        startTimer();
        statusLabel.setText("游戏进行中...");
    }

    private void checkSolution() {
        if (!gameStarted) return;

        boolean complete = true;
        boolean hasError = false;

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int val = board[row][col];
                if (val == 0) {
                    complete = false;
                    continue;
                }

                if (val != solution[row][col]) {
                    cells[row][col].setBackground(ERROR_BG);
                    hasError = true;
                } else {
                    cells[row][col].setBackground(SUCCESS_BG);
                }
            }
        }

        if (!complete) {
            statusLabel.setText("谜题尚未完成");
        } else if (hasError) {
            statusLabel.setText("发现错误，请检查标红单元格");
        } else {
            winGame();
        }
    }

    private void winGame() {
        stopTimer();
        statusLabel.setText("恭喜你！成功完成魔法数独！");
        JOptionPane.showMessageDialog(this, "🎉 恭喜你完成数独！", "胜利", JOptionPane.INFORMATION_MESSAGE);
    }

    // ====================== 键盘输入 ======================
    private void handleKeyInput(int keyCode) {
        if (selectedRow == -1) return;

        if (keyCode >= KeyEvent.VK_1 && keyCode <= KeyEvent.VK_9) {
            int num = keyCode - KeyEvent.VK_0;
            board[selectedRow][selectedCol] = num;
            updateBoardUI();
            updateNumberCounter();
        } else if (keyCode == KeyEvent.VK_BACK_SPACE || keyCode == KeyEvent.VK_DELETE) {
            board[selectedRow][selectedCol] = 0;
            updateBoardUI();
            updateNumberCounter();
        }
    }

    // ====================== 辅助方法 ======================
    private JButton createButton(String text) {
        JButton btn = new JButton(text);
        btn.setBackground(GOLD);
        btn.setForeground(DARK_MAGIC);
        btn.setFocusPainted(false);
        btn.setPreferredSize(new Dimension(180, 40));
        return btn;
    }

    private Component createSpacing(int height) {
        return Box.createRigidArea(new Dimension(0, height));
    }

    private void showRules() {
        String rules = "数独规则：\n" +
                "1. 每一行必须包含1-9，不重复\n" +
                "2. 每一列必须包含1-9，不重复\n" +
                "3. 每个3x3小九宫格必须包含1-9，不重复\n" +
                "操作：点击单元格，按数字键输入，删除键清空";
        JOptionPane.showMessageDialog(this, rules, "数独规则", JOptionPane.INFORMATION_MESSAGE);
    }

    private void startTimer() {
        if (gameTimer != null) gameTimer.stop();
        gameTimer = new Timer(1000, e -> elapsedTime++);
        gameTimer.start();
    }

    private void stopTimer() {
        if (gameTimer != null) gameTimer.stop();
    }

    // ====================== 单元格自定义组件 ======================
    private static class SudokuCell extends JLabel {
        public SudokuCell(int row, int col) {
            setHorizontalAlignment(SwingConstants.CENTER);
            setPreferredSize(new Dimension(40, 40));
            setBorder(BorderFactory.createLineBorder(Color.GRAY));
            setOpaque(true);
            setBackground(PARCHMENT);
        }

        public void setValue(int value) {
            setText(value == 0 ? "" : String.valueOf(value));
        }

        public void setBorderColor(Color color) {
            setBorder(BorderFactory.createLineBorder(color, 2));
        }
    }

    // 主方法
    public static void main(String[] args) {
        // Swing UI在事件线程中运行
        SwingUtilities.invokeLater(() -> {
            new MagicSudoku().setVisible(true);
        });
    }
}