package com.story.jvm.basic02_classloader;

import java.io.*;

public class T012_ClassReloading2 {
    private static class MyLoader extends ClassLoader{
        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            File f =new File("E:\\javase_study\\jvm_study\\target\\classes\\com\\story\\jvm" + name.replace(".","/").concat(".class"));

            if (!f.exists()) return super.loadClass(name);

            try{
                InputStream is = new FileInputStream(f);
                byte[] b = new byte[is.available()];
                is.read(b);
                return defineClass(name,b,0,b.length);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return super.loadClass(name);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        MyLoader m = new MyLoader();
        Class<?> aClass = m.loadClass("com.story.jvm.basic02_classloader.Hello");

        m = new MyLoader();
        Class newClazz = m.loadClass("com.story.jvm.basic02_classloader.Hello");
        System.out.println(aClass == newClazz);
    }
}
