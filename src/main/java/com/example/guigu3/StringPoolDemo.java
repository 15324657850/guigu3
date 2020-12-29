package com.example.guigu3;

/**
 * @author wxl
 */
public class StringPoolDemo {
    public static void main(String[] args) {
        String s1=new StringBuffer("ali").append("baba").toString();

        System.out.println(s1);
        System.out.println(s1.intern());
        System.out.println(s1==s1.intern());


        System.out.println();
        System.out.println();
        System.out.println();


        String s2=new StringBuffer("ja").append("va").toString();

        System.out.println(s2);
        System.out.println(s2.intern());
        System.out.println(s2==s2.intern());


    }
}
