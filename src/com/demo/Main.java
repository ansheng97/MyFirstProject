package com.demo;


import java.util.ArrayList;

public class Main {
    public  static void main(String[] args){
        int a =10;
        int b = 20;
        System.out.println(a+b);
        System.out.println("Hello World");
        for (int i = 0; i < 5; i++) {
            System.out.println("次数："+i);
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("IDEA");
        System.out.print(list);
    }
}
