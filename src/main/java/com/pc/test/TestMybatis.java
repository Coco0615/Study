package com.pc.test;

import org.apache.ibatis.executor.Executor;

public class TestMybatis {
    public static void main(String[] args) {
        A a = new A();
        a.m();
        System.out.println("a = " + a);
        Executor s;
    }

}
class A{
    public void m(){
        System.out.println("ma() = " + ma());
    }
    public Object ma(){
        return this;
    }
}