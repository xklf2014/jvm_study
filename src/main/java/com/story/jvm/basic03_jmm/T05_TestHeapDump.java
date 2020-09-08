package com.story.jvm.basic03_jmm;

import java.util.ArrayList;
import java.util.List;
/**
 * 内存溢出
 * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath="c:/tmp/jvm.dump -XX:PrintGCDetails -Xms10M -Xmx10M
 */
public class T05_TestHeapDump {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 1_0000_0000; i++) {
            list.add(new byte[1024 * 1024]);
        }
    }
}

/*
* Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at com.story.jvm.basic03_jmm.T05_TestHeapDump.main(T05_TestHeapDump.java:13)
*
*
* */