package com.story.jvm.basic03_jmm;

public class T02_TestPrintMemoryInfo {
    public static void main(String[] args) {
        printMemoryInfo();
        byte[] bytes = new byte[1024 * 1024];
        System.out.println("====================");
        printMemoryInfo();
    }

public static void printMemoryInfo(){
    System.out.println("total："+ Runtime.getRuntime().totalMemory());
    System.out.println("free:"+Runtime.getRuntime().freeMemory());
}
}
