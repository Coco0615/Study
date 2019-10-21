package com.pc.test.testThread;

public class Counter extends Thread {
    private String name1;
    private static int index = 1;
    private final static int MAX = 100;


    public Counter(String name1) {
        this.name1 = name1;
    }

    @Override
    public void run() {
        while (index < MAX){
            System.out.println("柜台："+name1+"出的票号是  " + index++);

        }
    }
}
