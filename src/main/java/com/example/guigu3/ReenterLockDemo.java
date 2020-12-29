package com.example.guigu3;

import java.util.Arrays;
import java.util.List;

/**
 * @author wxl
 */
public class ReenterLockDemo {
    static Object object = new Object();

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 12, 13, 231);
        boolean contains = list.contains(4);
        System.out.println(contains);
    }

    public static void m1() {
        new Thread(() -> {
            synchronized (object) {
                System.out.println(Thread.currentThread().getName() + "\t外层调用");
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + "\t中层调用");
                    synchronized (object) {
                        System.out.println(Thread.currentThread().getName() + "\t内层调用");
                    }
                }
            }
        }, "A").start();
    }
}
