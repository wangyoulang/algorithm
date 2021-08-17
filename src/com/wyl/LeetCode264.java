package com.wyl;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 264.丑数
 * 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
 *
 * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 */
public class LeetCode264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(5));
    }
    public static int nthUglyNumber(int n) {
        int[] factor = new int[]{2,3,5};
        PriorityQueue<Long> heep = new PriorityQueue<Long>();
        Set<Long> set = new HashSet<>();
        set.add(1L);
        heep.offer(1L);
        int ugly = 1;
        for(int i = 0;i < n;i ++){
            long curr = heep.poll();
            ugly = (int) curr;
            for(int x:factor){
                long next = x * curr;
                if(set.add(next)){
                    heep.offer(next);
                }
            }
        }
        return ugly;
    }
}
