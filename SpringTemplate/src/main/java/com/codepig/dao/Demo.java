package com.codepig.dao;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        Field[] fields = Account.class.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

    }
}
