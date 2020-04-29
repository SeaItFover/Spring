package com.codepig.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        Producer producer = new Producer();

        IProducer proxyProducer= (IProducer)Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Float money = (Float)args[0];
                        method.invoke(producer, money * 0.8f);
                        return null;
                    }
                });
        proxyProducer.saleProduce(1000f);
    }
}
