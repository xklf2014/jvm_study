package com.story.jvm.basic03_jmm;


import com.story.agent.ObjectSizeAgent;

public class T03_SizeOfAnObject {
    public static void main(String[] args) {
        System.out.println(ObjectSizeAgent.sizeOf(new Object()));
        System.out.println(ObjectSizeAgent.sizeOf(new int[]{}));
        System.out.println(ObjectSizeAgent.sizeOf(new P()));
    }

    /*
    *   1. 对象头：markword 8
        2. ClassPointer指针：-XX:+UseCompressedClassPointers 为4字节 不开启为8字节
        3. 引用类型：-XX:+UseCompressedOops 为4字节 不开启为8字节
        4. Padding对齐，8的倍数 (Oops: Ordinary Object Pointers)
    *
    * */

    private static class P {
                        // 8 _markword
                        // 4 class pointer
        int id;         // 4
        String name;    // 4 oop指针
        int age;        // 4
        byte b1;        // 1
        byte b2;        // 1
        Object o;       // 4 oop指针
        byte b3;        // 1
                        // padding 1
    }

}
