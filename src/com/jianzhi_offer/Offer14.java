package com.jianzhi_offer;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-09-0715:08
 */
public class Offer14 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eiddaoooba";
        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] mark = new int[26];
        for(char i : s1.toCharArray()){
            int index = (int)(i - 'a');
            mark[index] += 1;
        }
        for(int i = 0;i < s1.length();i ++){
            int index = (int)(s2.charAt(i) - 'a');
            mark[index] -= 1;
        }

        int left = 0,right = s1.length() - 1;
        while(right < s2.length() - 1){
            if(zeros(mark)) return true;
            mark[(int)(s2.charAt(left++) - 'a')] += 1;
            mark[(int)(s2.charAt(++right) - 'a')] -= 1;
        }
        if(zeros(mark)) return true;
        return false;
    }
    static boolean zeros(int[] arr){
        for(int i : arr){
            if(i != 0) return false;
        }
        return true;
    }
}
