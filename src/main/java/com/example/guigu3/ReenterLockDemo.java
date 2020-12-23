package com.example.guigu3;

/**
 * @author wxl
 */
public class ReenterLockDemo {
    static Object object = new Object();

    public static void main(String[] args) {
        m1();
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
