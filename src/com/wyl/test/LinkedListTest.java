package com.wyl.test;

import org.junit.Test;

import java.util.LinkedList;
public class LinkedListTest {
    @Test
    public void testOfLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(2);
        int len = list.size();
        for(int i = 0;i < len;i ++){
            System.out.println(list.pop());
        }
    }
    @Test
    public void test(){
        String a = "0123456789";
        String b = a.substring(1,a.length()-1);
        String[] aa = a.split("456");
        String aaa = aa[aa.length-1];
        System.out.println(b);//左闭右开
    }
}
