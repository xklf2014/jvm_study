package com.story.jvm.basic07_oom;

public class StackOverFlow {
    //Exception in thread "main" java.lang.StackOverflowError
    //	at com.story.jvm.oom.StackOverFlow.m(StackOverFlow.java:9)
    public static void main(String[] args) {
        m();
    }

    static void m() {
        m();
    }
}
