package com.dp;

/**
 * @author shkstart
 * @create 2021-08-2715:59
 */
public class Packet {
    private static Packet packet;
    public static void main(String[] args) {
        int[][] dp = new int[3][4];
        System.out.println();
    }
    static int packet(int n,int w,int[] value,int[] weight){
        int[][] dp = new int[n][w];
        for(int i = 0;i < w;i ++){
            dp[0][i] = 0;
        }
        dp[0][weight[0]] = value[0];
        for(int i = 1;i < n;i ++){
            for(int j = 1;j < w;j ++){
                dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - weight[j]]);
            }
        }
        return dp[n - 1][w - 1];
    }
}
