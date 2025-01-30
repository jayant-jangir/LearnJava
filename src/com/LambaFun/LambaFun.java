package com.LambaFun;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambaFun {
    ArrayList<Integer> list = new ArrayList<>();


    public static void main(String[] args) {
        LambaFun obj = new LambaFun();
        // Using Lambda function to print the list
        for(int i = 0; i < 10; i++) {
            obj.list.add(i);
        }
        Consumer<Number> printFun = n -> System.out.print(n + " ");
        obj.list.forEach(printFun);
    }

}
