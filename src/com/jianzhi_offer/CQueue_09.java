package com.jianzhi_offer;

import java.util.LinkedList;

/**
 * 剑指offer 09
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 */
class CQueue_09 {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public CQueue_09() {
        stack1 = new LinkedList<>();//头
        stack2 = new LinkedList<>();//尾
    }

    public void appendTail(int value) {//在尾部添加
        stack2.push(value);
    }

    public int deleteHead() {//删除头部
        int result = -1;
        if(!stack2.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            result = stack1.pop();
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return result;
    }
}
