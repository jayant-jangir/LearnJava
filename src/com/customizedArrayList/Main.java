package com.customizedArrayList;

public class Main {
    public static void main(String[] args) {
        CustGenArrList<Integer> list = new CustGenArrList<>();
        list.add(15);
        System.out.println(list.size());
        System.out.println("Is List Empty: " + list.isEmpty());
        Number ele = list.get(0);
        System.out.println(ele);
        list.set(0, 10);
        list.add(20);
        System.out.println(list);
    }
}
