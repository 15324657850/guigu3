package com.example.spring;

/**
 * @author wxl
 */


public class B {
    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }


    public B() {
        System.out.println("---B created success");

    }
}


