package com.codepig.proxy;

public class Producer implements IProducer{

    @Override
    public void saleProduce(float money) {
        System.out.println("sale success && get money :" + money);
    }

    @Override
    public void afterSale(float money) {
        System.out.println("after sale service + cost: " + money);
    }
}
