package com.story.jvm.basic02_classloader;

public class T001_ClassLoadingProcedure {
    public static void main(String[] args) {
        System.out.println(T.count);
    }

}

class T {
    public static T t = new T();
    public static int count = 2;

    private T() {
        count++;
        //System.out.println("--"+count);
    }
}