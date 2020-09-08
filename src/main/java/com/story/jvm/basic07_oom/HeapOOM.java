package com.story.jvm.basic07_oom;

import java.util.LinkedList;
import java.util.List;

/**
 * test heap out of memory
 * <p>
 * Options: -verbose:c5_gc -Xms20M -Xmx20M -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    public static void main(String[] args) {
        List<Object> objects = new LinkedList<>();
        for (; ; ) {
            objects.add(new Object());
        }
    }
}

/*
*
[Full GC (Ergonomics) [PSYoungGen: 5631K->5631K(6144K)] [ParOldGen: 13564K->13564K(13824K)] 19196K->19196K(19968K), [Metaspace: 3223K->3223K(1056768K)], 0.0700086 secs] [Times: user=0.50 sys=0.00, real=0.07 secs]
[Full GC (Ergonomics) [PSYoungGen: 5631K->5631K(6144K)] [ParOldGen: 13565K->13565K(13824K)] 19197K->19197K(19968K), [Metaspace: 3223K->3223K(1056768K)], 0.0650698 secs] [Times: user=0.47 sys=0.00, real=0.07 secs]
[Full GC (Ergonomics) [PSYoungGen: 5631K->5631K(6144K)] [ParOldGen: 13570K->13566K(13824K)] 19202K->19198K(19968K), [Metaspace: 3227K->3227K(1056768K)], 0.0657753 secs] [Times: user=0.47 sys=0.00, real=0.07 secs]
java.lang.OutOfMemoryError: GC overhead limit exceeded
Dumping heap to java_pid203156.hprof ...
Heap dump file created [36668990 bytes in 0.100 secs]
[Full GC (Ergonomics) [PSYoungGen: 5631K->0K(6144K)] [ParOldGen: 13622K->629K(13824K)] 19254K->629K(19968K), [Metaspace: 3274K->3274K(1056768K)], 0.0047101 secs] [Times: user=0.13 sys=0.00, real=0.00 secs]
Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
	at java.util.LinkedList.linkLast(LinkedList.java:142)
	at java.util.LinkedList.add(LinkedList.java:338)
	at com.story.jvm.oom.HeapOOM.main(HeapOOM.java:15)
Heap
 PSYoungGen      total 6144K, used 154K [0x00000000ff980000, 0x0000000100000000, 0x0000000100000000)
  eden space 5632K, 2% used [0x00000000ff980000,0x00000000ff9a69e8,0x00000000fff00000)
  from space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
  to   space 512K, 0% used [0x00000000fff00000,0x00000000fff00000,0x00000000fff80000)
 ParOldGen       total 13824K, used 629K [0x00000000fec00000, 0x00000000ff980000, 0x00000000ff980000)
  object space 13824K, 4% used [0x00000000fec00000,0x00000000fec9d7f8,0x00000000ff980000)
 Metaspace       used 3360K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 361K, capacity 388K, committed 512K, reserved 1048576K

*
* */
