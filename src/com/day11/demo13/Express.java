package com.day11.demo13;

public class Express {
    // 私有化成员变量：单号、重量(kg)、收件人
    private String orderId;
    private int weight;
    private String receiver;

    public Express() {
    }

    public Express(String orderId, int weight, String receiver) {
        this.orderId = orderId;
        this.weight = weight;
        this.receiver = receiver;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    //计算运费：每公斤10元
    public double calculateFee() {
        return weight * 10;
    }
}
