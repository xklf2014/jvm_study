package com.story.jvm.basic02_classloader;

public class T008_LazyLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.story.jvm.basic02_classloader.T008_LazyLoading$P");
    }

    public static class P{
        final static  int i =8;
        static int j = 9;
        static {
            System.out.println("P");
        }
    }

    public static class X extends P{
        static{
            System.out.println("X");
        }
    }
}
