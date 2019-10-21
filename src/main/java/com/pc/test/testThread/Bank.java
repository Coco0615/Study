package com.pc.test.testThread;

public class Bank {
    public static void main(String[] args) {
        /*Counter counter1 = new Counter("1");
        counter1.start();
        Counter counter2 = new Counter("2");
        counter2.start();
        Counter counter3 = new Counter("3");
        counter3.start();*/
        final Counter1 counter1 = new Counter1();
        Thread thread1 = new Thread(counter1, "一");
        Thread thread2 = new Thread(counter1, "二");
        Thread thread3 = new Thread(counter1, "三");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
