package com.pc.test;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        TestSort test1 = new T();
        String m = ((T) test1).m(1);
        Integer[] a ={6,3,23,5,65,4,53,42,9};
        Arrays.sort(a);
        for (int i=0;i<a.length;i++){
            System.out.println("a[i] = " + a[i]);
        }
    }
    public void m(){
        System.out.println("mmmm");
    }
}

class T extends TestSort{
    protected String m(Integer i){
        return "22222222222";
    }

}
