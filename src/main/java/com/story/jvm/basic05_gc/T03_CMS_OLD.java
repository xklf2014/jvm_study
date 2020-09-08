package com.story.jvm.basic05_gc;

public class T03_CMS_OLD {
    public static void main(String[] args) {
        byte[] b1 = new byte[4*1024*1024];
        //b1 = null;
        System.out.println("----------------------");
        byte[] b2 = new byte[4*1024*1024];
    }
}
