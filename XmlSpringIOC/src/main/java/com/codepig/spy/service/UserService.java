package com.codepig.spy.service;

import java.util.*;

/**
 * 测试复杂类型的bean注入
 */
public class UserService {
    String[] strings;
    List<String> myList;
    Map<String,String> myMap;
    Set<String> mySet;
    Properties myProps;

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public Properties getMyProps() {
        return myProps;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void print(){
        System.out.println(Arrays.toString(strings));
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(myProps);
        System.out.println(mySet);
    }
}
