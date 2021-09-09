package com.dp;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-08-2713:50
 */
public class IntegerBreak {
    public static void main(String[] args) {

        System.out.println(integerBreak(10));
    }
    static int integerBreak(int n){
        if(n < 2) return 0;
        if(n == 2) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 0;dp[2] = 1;
        for(int i = 3;i <= n;i ++){
            for(int j = 1;j < i - 1;j ++){
                dp[i] = Math.max(Math.max(dp[i],j * (i - j)),j * dp[i - j]);
            }
        }
        return dp[n];
    }
}
