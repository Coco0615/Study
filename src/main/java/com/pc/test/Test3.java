package com.pc.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<? extends Father> list = new ArrayList<Father>();
        //list.add(null);//这种类型的list不能add
        list = getSon();//可以用于获取
        System.out.println("sons = " + list);
        String s = "111";
        Integer.valueOf(s);
        System.out.println("s = " + s);
                

    }
    public static List<Father> getSon(){
        List list = new ArrayList<>();
        for (int i = 0;i<10;i++){
            list.add(new Father());
        }
        return list;
    }

}
class Father{}
class Son extends Father{}
