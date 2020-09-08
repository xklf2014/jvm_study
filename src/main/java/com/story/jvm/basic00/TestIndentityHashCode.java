package com.story.jvm.basic00;

public class TestIndentityHashCode {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.hashCode());
        System.out.println(System.identityHashCode(obj));
        System.out.println("------------------");

        T t = new T();
        System.out.println(t.hashCode());
        System.out.println(t.superHashCode());
        System.out.println(System.identityHashCode(t));

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(System.identityHashCode(s1) == System.identityHashCode(s2));
    }

    private static final class T{

        @Override
        public int hashCode() {
            return 1;
        }

        public int superHashCode(){
            return super.hashCode();
        }
    }
}
