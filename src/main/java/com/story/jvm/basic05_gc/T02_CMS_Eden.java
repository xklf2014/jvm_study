package com.story.jvm.basic05_gc;

public class T02_CMS_Eden {
    public static void main(String[] args) {
        byte[] bytes = new byte[4 * 1024 * 1024];
        bytes = null;
        System.out.println("-----------------");
        byte[] bytes2 = new byte[4 * 1024 * 1024];
    }
}
