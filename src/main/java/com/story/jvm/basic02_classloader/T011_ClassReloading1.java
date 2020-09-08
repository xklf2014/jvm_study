package com.story.jvm.basic02_classloader;

public class T011_ClassReloading1 {
    public static void main(String[] args) throws ClassNotFoundException {
        T006_ClassLoader classLoader = new T006_ClassLoader();
        Class<?> aClass = classLoader.loadClass("com.story.jvm.basic02_classloader.Hello");

        classLoader = null;
        System.out.println(aClass.hashCode());

        classLoader = null;
        classLoader = new T006_ClassLoader();
        Class clazz = classLoader.loadClass("com.story.jvm.basic02_classloader.Hello");
        System.out.println(clazz.hashCode());

        System.out.println(clazz == aClass);

    }
}
