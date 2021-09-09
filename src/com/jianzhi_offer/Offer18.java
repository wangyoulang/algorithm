package com.jianzhi_offer;

/**
 * @author shkstart
 * @create 2021-09-0812:12
 */
public class Offer18 {
    public static void main(String[] args) {
        String s = "OP";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s.length() == 0) return false;
        if(s.length() == 1) return true;
        int left = 0,right = s.length() - 1;
        while(left < right){
            if(toChar(s.charAt(left)) == '\0'){
                left ++;
                continue;
            }
            if(toChar(s.charAt(right)) == '\0'){
                right --;
                continue;
            }
            if(toChar(s.charAt(left)) == toChar(s.charAt(right))) {
                left ++;right --;
            }
            else return false;
        }
        return true;
    }
    static char toChar(char a){
        if(a <= 90 && a >= 65) return (char)(a + 32);
        if(a >= 97 && a <= 122) return a;
        return '\0';
    }
}
