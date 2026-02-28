package com.day11.demo13;

public class AirExpress extends  Express{
    public AirExpress() {
    }

    public AirExpress(String orderId, int weight, String receiver) {
        super(orderId, weight, receiver);
    }

    // 重写计算运费：在基础运费上+15元
    @Override
    public double calculateFee() {
        return super.calculateFee() + 15;
    }
}
