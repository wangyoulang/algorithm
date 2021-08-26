package com.daily;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。
 *
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */
public class Day8_20 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        for(Integer i = 0;i < 100;i ++){
            s.add(i);
            s.remove(i-1L);
        }
        System.out.println(s.size());
//        String s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
//        String result = reverseStr(s,39);
//        System.out.println("5"+ 2);
    }
    public static String reverseStr(String s, int k) {
        if(s.length() == 0 || s == null){
            return "";
        }
        if(s.length() <= k){
            return revert(s.toCharArray(),0,s.length() - 1);
        }
        int left = 0,right = 1;
        String result = s;
        while(right < s.length()){
            if(right - left == (k - 1)){
                String subStr = s.substring(left,right);
                if((right + 1) % k == 0 && (right + 1)/k % 2 != 0){
                    result = revert(result.toCharArray(),left,right);
                }
                left = right;
                right ++;
            }else right ++;
        }
        return result;
    }
    public static String revert(char[] s,int l,int r){
        int left = l,right = r;
        while(left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
        return new String(s);
    }
}
