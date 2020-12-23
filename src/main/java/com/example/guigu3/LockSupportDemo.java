package com.example.guigu3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wxl
 */
public class LockSupportDemo {
    static Object objectLock = new Object();
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();


    public static void main(String[] args) {

        Thread a = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) {e.printStackTrace(); }
            System.out.println(Thread.currentThread().getName() + "\t come in");
            LockSupport.park();
            System.out.println(Thread.currentThread().getName() + "\t 被唤醒");

        }, "A");
        a.start();
        Thread b = new Thread(() -> {
            LockSupport.unpark(a);
            System.out.println(Thread.currentThread().getName() + "\t 通知了");

        }, "B");
        b.start();
    }

    private static void lockDemo() {
        new Thread(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) {e.printStackTrace(); }
            lock.lock();
            try {

                System.out.println(Thread.currentThread().getName() + "\t -----come in");
                condition.await();

                System.out.println(Thread.currentThread().getName() + "\t  ---被唤醒");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "A").start();

        new Thread(() -> {
            lock.lock();
            try {

                condition.signal();

                System.out.println(Thread.currentThread().getName() + "\t  ---通知");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "B").start();
    }


    public void sync() {
        synchronized (objectLock) {

        }
    }
}
