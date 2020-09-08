package com.story.jvm.basic06_cms;

import java.util.ArrayList;
//-XX:+PrintGCDetails -XX:+UseConcMarkSweepGC -Xmx10m -Xms10m -Xmn10m
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0;i<6000_000;i++){
            list.add(new Student("test "+i,i));
        }

        try {
            Thread.sleep(10000000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
* [GC (Allocation Failure) [ParNew (promotion failed): 8256K->9216K(9216K), 0.0053628 secs][CMS: 58K->63K(64K), 0.0086129 secs] 8256K->4016K(9280K), [Metaspace: 3197K->3197K(1056768K)], 0.0140202 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[Full GC (Allocation Failure) [CMS: 63K->63K(64K), 0.0112090 secs] 9279K->6823K(9280K), [Metaspace: 3215K->3215K(1056768K)], 0.0112577 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 63K(64K)] 6964K(9280K), 0.0025212 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 7763 K (9216 K)][Rescan (parallel) , 0.0040879 secs][weak refs processing, 0.0000078 secs][class unloading, 0.0002710 secs][scrub symbol table, 0.0003374 secs][scrub string table, 0.0000922 secs][1 CMS-remark: 63K(64K)] 7827K(9280K), 0.0048943 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 9216K->9216K(9216K), 0.0000120 secs][CMS: 63K->63K(64K), 0.0103584 secs] 9279K->7993K(9280K), [Metaspace: 3215K->3215K(1056768K)], 0.0104188 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 63K(64K)] 8101K(9280K), 0.0028557 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 8270 K (9216 K)][Rescan (parallel) , 0.0046774 secs][weak refs processing, 0.0000075 secs][class unloading, 0.0002323 secs][scrub symbol table, 0.0003254 secs][scrub string table, 0.0001031 secs][1 CMS-remark: 63K(64K)] 8334K(9280K), 0.0054184 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
* */
