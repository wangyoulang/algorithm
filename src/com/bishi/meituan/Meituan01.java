package com.bishi.meituan;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-08-2910:07
 */
public class Meituan01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i ++){
            a[i] = scan.nextInt();
        }
        System.out.println(satisfaction(a,n));
    }
    static int satisfaction(int[] a,int n){
        if(n < 1) return 0;
        int addX = 0;
        int ans = 0;
        for(int i = 1;i < n;i ++){
            if(i > 1 && a[i] == a[i - 1]){
                ans += addX;
                continue;
            }else addX = 0;
            for(int j = 0;j < i;j ++){
                if(j > 0 && a[j] == a[j - 1]) continue;
                if(a[j] < a[i]) addX ++;
            }
            ans += addX;
        }
        return ans;
    }

}
