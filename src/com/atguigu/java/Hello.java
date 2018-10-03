package com.atguigu.java;

import java.util.ArrayList;

/**
 * @Auther: Guqiancheng
 * @Date: 2018-10-03 15:40
 * @Description: 这是个无聊的类
 */
public class Hello
{
    public static void main(String[] args){
        //soutp/soutv/soutm
        Hello.run();
    }

    static void run() {

        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+ j*i+"\t");
            }
        }
    }

    static void list() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
