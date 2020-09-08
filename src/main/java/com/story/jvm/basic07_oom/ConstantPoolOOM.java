package com.story.jvm.basic07_oom;

import java.util.LinkedList;
import java.util.List;

public class ConstantPoolOOM {
    static long i = 0;

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        for (;;){
            strings.add(""+ i++);
        }
    }
}
/*
    jdk1.8常量池放在堆中
* Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
	at com.story.jvm.oom.ConstantPoolOOM.main(ConstantPoolOOM.java:12)
Java HotSpot(TM) 64-Bit Server VM warning: MaxNewSize (10240k) is equal to or greater than the entire heap (10240k).  A new max generation size of 9728k will be used.
*
*
*
* */
