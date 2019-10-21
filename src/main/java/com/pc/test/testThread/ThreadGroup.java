package com.pc.test.testThread;

public class ThreadGroup {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        //线程t所在的线程组，创建线程的时候若没有指定线程组，则使用父线程的线程组
        System.out.println("t.getThreadGroup() = " + t.getThreadGroup());
        //当前线程所在线程组
        System.out.println("Thread.currentThread().getThreadGroup() = " + Thread.currentThread().getThreadGroup());
        //线程t所在的线程组中有几个线程
        System.out.println("t = " + t.getThreadGroup().activeCount());
        Thread[] ts = new Thread[3];
        //把线程t所在的线程组中的线程枚举放入ts中
        t.getThreadGroup().enumerate(ts);
        //遍历ts
        for (Thread thread : ts) {
            System.out.println("thread = " + thread);
            
        }
        
    }
}
