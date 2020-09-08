package com.story.jvm.basic03_jmm;

public class T06_TestSync {
    //access flags : synchronized
    synchronized void m(){

    }
    //   monitorenter...monitorexit
    void n(){
        synchronized (this){

        }
    }
}
