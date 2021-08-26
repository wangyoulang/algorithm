package com.dp;

/**
 * @author shkstart
 * @create 2021-08-2611:10
 * https://leetcode-cn.com/problems/climbing-stairs/
 *
 * https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 */
public class PalouQuestion {
    public static void main(String[] args) {
        int[] cost = new int[]{10, 15, 20};
        System.out.println(palouCost(cost));
    }
    public static int palou(int n){
        if(n < 2) return n;
        int[] dp = new int[n];
        dp[0] = 1;dp[1] = 2;
        for(int i = 2;i < n;i ++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }

    static int palouCost(int[] cost){
        int n = cost.length;
        if(n < 1){
            return cost[n - 1];
        }
        int[] dp = new int[n];
        dp[0] = cost[0];dp[1] = cost[1];
        for(int i = 2;i < n;i ++){
            dp[i] = Math.min(dp[i - 1],dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n - 1],dp[n - 2]);
    }
}
