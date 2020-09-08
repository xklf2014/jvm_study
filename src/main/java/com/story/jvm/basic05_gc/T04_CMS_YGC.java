package com.story.jvm.basic05_gc;

import java.util.concurrent.TimeUnit;

public class T04_CMS_YGC {
    public static void main(String[] args) {
        for (int i = 0; i < 10_0000; i++) {
            Object o = new Object();
            o=null;
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
