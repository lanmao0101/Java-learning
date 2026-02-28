package com.day11.demo13;

public class LocalExpress extends  Express{
    public LocalExpress() {
    }

    public LocalExpress(String orderId, int weight, String receiver) {
        super(orderId, weight, receiver);
    }
    //重写配送方法,最后加10元
    @Override
    public double calculateFee() {
        return super.calculateFee()+10;
    }
}
