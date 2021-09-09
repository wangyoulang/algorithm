package com.bishi.meituan;

import java.util.Scanner;

/**图书馆放书(动态规划）
 * @author shkstart
 * @create 2021-08-2911:12
 */
public class Meituan02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n],b = new int[n];
        for(int i = 0;i < n;i ++){
            a[i] = scan.nextInt();
        }
        for(int i = 0;i < n;i ++){
            b[i] = scan.nextInt();
        }
        System.out.println(placeMethod(a,b,n));

    }
    static int placeMethod(int[] a,int[] b,int n){
        if(n < 2) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1;i < n;i ++){
            if(a[i] <= b[i]){
                dp[i] = 1;
                for(int j = 0;j < i;j ++){
                    dp[i] += dp[j];
                }

            }else dp[i] = dp[i - 1];
        }
        return dp[n - 1] % (int)(Math.pow(10,9) + 7);
    }
}
