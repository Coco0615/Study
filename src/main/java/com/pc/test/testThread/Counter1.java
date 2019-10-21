package com.pc.test.testThread;

public class Counter1 implements Runnable {
    private static int index = 1;
    private final static int MAX = 100;

    @Override
    public void run() {
        while (index < MAX){
            System.out.println(Thread.currentThread()+"index = " + index++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
