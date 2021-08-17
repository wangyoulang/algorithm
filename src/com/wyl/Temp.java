package com.wyl;

public class Temp {
    public static void main(String[] args) {
        int[] ans = printTran(4);
        System.out.println();
    }
    public static int[] printTran(int n){
        int count = 0;
        for(int i = 1;i <= n;i ++){
            count += i;
        }
        int[] result = new int[count];
        int[][] ans = new int[n][n];
        int x = -1,y = 0,index = 1;
        int high = n -2;
        while(index <= count){
            if(y > 0){
                x --;
                y ++;
            }
            if(x < 0 && y > 0){
                y = 1;
                x = high --;
                if(ans[x][y] != 0){
                    x --;
                }
            }
            if(y == 0){
                if(x == n -1){
                    x --;
                    y ++;
                }else x ++;
            }
            ans[x][y] = index;
            index ++;
        }
        int idx = 0;
        for(int i = 0;i < n;i ++){
            for(int j =0;j < n;j ++){
                if(ans[i][j] != 0){
                    result[idx ++] = ans[i][j];
                }
            }
        }
        return result;
    }
}