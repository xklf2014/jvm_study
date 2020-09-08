package com.story.jvm.basic05_gc;

public class T01_HelloGC {

    //-XX:+PrintGCDetails -XX:+UseConcMarkSweepGC -XX:+PrintFlagsFinal -XX:+PrintVMOptions
    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            byte[] bytes = new byte[1024 * 1024];
        }
    }
}

/*
* (Allocation Failure) [ParNew: 7329K->0K(9216K), 0.0002082 secs] 8340K->1010K(10904K), 0.0002232 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 7329K->0K(9216K), 0.0001836 secs] 8340K->1010K(10904K), 0.0001971 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 7329K->0K(9216K), 0.0001893 secs] 8340K->1010K(10904K), 0.0002025 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
*
*
*
* */
