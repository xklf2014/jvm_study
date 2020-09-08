package com.story.jvm.basic04_RuntimeDataAreaAndInstructionSet;

public class T03_InvokeSpecial {
    public static void main(String[] args) {
        T03_InvokeSpecial t = new T03_InvokeSpecial();
        t.m();
        t.n();
    }

    public final void m(){}

    public void n(){}
}
