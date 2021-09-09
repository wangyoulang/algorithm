package com.bishi.zijie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-08-2911:42
 */
public class Zijie03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] q = new char[n][n];
        int index = 0;
        while(scan.hasNextLine()){
            q[index++] = scan.nextLine().toCharArray();
        }
        List<int[]> anses = new ArrayList<>();
        for(int i = 0;i < n;i ++){
            for(int j = 0;j < n;j ++){
                if(isOk(q,i,j)) anses.add(new int[]{i + 1,j + 1});
            }
        }
        for(int[] ans :anses){
            System.out.println(ans);
        }
    }
    static boolean isOk(char[][] q,int r,int c){
        for(int i = 1;i <= 5;i ++){
            if(q[i+r][i+c] != '1') return false;
        }
        return true;
    }
}
