package com.story.jvm.basic00;

import java.util.ArrayList;
import java.util.List;

public class T {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();
        long l1 = runtime.freeMemory();
        for (int i =0;i<10_0000;i++){
            list.add(new Object());
        }
        long l2 = runtime.freeMemory();
        System.out.println((l1 - l2)/100_0000);
    }
}
