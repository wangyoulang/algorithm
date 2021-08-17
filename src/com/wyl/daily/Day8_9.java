package com.wyl.daily;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 313.超级丑数
 * 超级丑数 是一个正整数，并满足其所有质因数都出现在质数数组 primes 中。
 *
 * 给你一个整数 n 和一个整数数组 primes ，返回第 n 个 超级丑数 。
 *
 * 题目数据保证第 n 个 超级丑数 在 32-bit 带符号整数范围内。
 */
public class Day8_9 {
    public static void main(String[] args) {
        int[] primes = new int[]{2,7,13,19};
        System.out.println(nthSuperUglyNumber(12,primes));
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> heep = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        int supperUgly = 0;
        set.add(1L);
        heep.offer(1L);
        for(int i = 0;i < n;i ++){
            long curr = heep.poll();
            supperUgly = (int)curr;
            for(int prime:primes){
                long next = prime * curr;
                if(set.add(next)){
                    heep.offer(next);
                }
            }
        }
        return supperUgly;
    }
}
