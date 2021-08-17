package com.recursion;

/**
 * 反转字符串
 */
public class LeetCode344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println();
    }
    public static void reverseString(char[] s) {
        int n = s.length;
        if(n == 0 || n == 1){
            return;
        }
        char[] result = new char[n];
//        recursion1(s,n - 1,0,result);
        recursion2(s,0,n - 1);
        System.out.println();
    }
    public static void recursion1(char[] s,int n,int index,char[] result){
        if(index == n){
            result[n - index] = s[index];
            return;
        }
        recursion1(s,n,index + 1,result);
        result[n - index] = s[index];
        return;
    }

    public static void recursion2(char[] s,int left,int right){
        if(left >= right){
            return;
        }
        recursion2(s,left + 1,right - 1);
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
