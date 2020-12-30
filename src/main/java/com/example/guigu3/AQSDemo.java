package com.example.guigu3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wxl
 */
public class AQSDemo {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        //第一个顾客
        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("---a thread come in ");
                try {
                    TimeUnit.SECONDS.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "A").start();
        //第二个顾客
        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("---b thread come in ");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "B").start();


        //第三个顾客
        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("---c thread come in ");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "C").start();


    }
}
