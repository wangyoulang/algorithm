package com.bishi.wangyi;

import java.util.Scanner;

public class wy_02 {
   public static void main(String[] args) {
      /*Scanner scan = new Scanner(System.in);
        String ms = scan.nextLine();
        String[] mes = ms.split(",");
        int n = Integer.valueOf(mes[0]);
        int k = Integer.valueOf(mes[1]);

        char[] L = new char[26];
        for(int i = 0;i < L.length;i ++){
            L[i] = (char)(i + 97);
        }
        String result = recursion(L,n);*//*
        System.out.println(result.charAt(k - 1));*/
       System.out.println(Math.pow(2,31));
    }
    public static String recursion(char[] L,int n){
        if(n <= 1){
            return String.valueOf(L[0]);
        }
        return recursion(L,n - 1) + String.valueOf(L[n - 1]) + reverse(invert(recursion(L,n - 1).toCharArray()));
    }
    public static char[] invert(char[] s){
        for(int i = 0;i < s.length;i ++){
            char xBar = (char)( 97 + 122 - s[i]);
            s[i] = xBar;
        }
        return s;
    }
    public static String reverse(char[] s){
        int left = 0,right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
        return String.valueOf(s);
    }
}
