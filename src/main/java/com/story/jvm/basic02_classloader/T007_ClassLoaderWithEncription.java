package com.story.jvm.basic02_classloader;

import java.io.*;

public class T007_ClassLoaderWithEncription extends ClassLoader{
    public static int seed = 0B10110110;

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File("c:/test/", name.replace(".", "/").concat(".class"));
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b = 0;

            while ((b = fis.read()) != 0) {
                baos.write(b);
            }

            byte[] bytes = baos.toByteArray();
            baos.close();
            fis.close();
            return defineClass(name,bytes,0,bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    private static void encFile(String name) throws IOException {
        File file = new File("E:\\javase_study\\jvm_study\\target\\classes",name.replace('.','/').concat(".class"));
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(new File("E:\\javase_study\\jvm_study\\target\\classes", name.replaceAll(".", "/").concat(".class")));
        int b =0;
        while ((b = fis.read()) != -1){
            fos.write(b ^ seed);
        }

        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        encFile("com.story.jvm.basic02_classloader.Hello");
        ClassLoader l = new T007_ClassLoaderWithEncription();
        Class clazz = l.loadClass("com.story.jvm.basic02_classloader.Hello");
        Hello h = (Hello)clazz.newInstance();
        h.m();

        System.out.println(l.getClass().getClassLoader());
        System.out.println(l.getParent());
    }
}
