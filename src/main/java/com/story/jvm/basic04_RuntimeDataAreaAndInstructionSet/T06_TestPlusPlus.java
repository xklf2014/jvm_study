package com.story.jvm.basic04_RuntimeDataAreaAndInstructionSet;

public class T06_TestPlusPlus {
    public static void main(String[] args) {
        int i = 8;
        //i = i++;
        i= ++i;
        System.out.println(i);
    }
}

/*
*  下面为 i = i++;指令
*  计算前将8压入工作栈，然后从localvariable进行计算，然后出栈将i值覆盖，所以i=8
 0 bipush 8
 2 istore_1
 3 iload_1
 4 iinc 1 by 1
 7 istore_1
 8 getstatic #2 <java/lang/System.out>
11 iload_1
12 invokevirtual #3 <java/io/PrintStream.println>
15 return
*
*
* */

/*
* 下面为 i = ++i;指令
*  将计算后的结果压入工作栈
 0 bipush 8
 2 istore_1
 3 iinc 1 by 1
 6 iload_1
 7 istore_1
 8 getstatic #2 <java/lang/System.out>
11 iload_1
12 invokevirtual #3 <java/io/PrintStream.println>
15 return
*
*
* */


