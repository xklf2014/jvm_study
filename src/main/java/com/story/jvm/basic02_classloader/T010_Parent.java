package com.story.jvm.basic02_classloader;

public class T010_Parent {
    private static T006_ClassLoader parent = new T006_ClassLoader();

    private static class MyLoader extends ClassLoader{
        public MyLoader() {
            super(parent);
        }
    }
}
