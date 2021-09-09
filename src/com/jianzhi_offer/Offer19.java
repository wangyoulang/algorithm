package com.jianzhi_offer;

/**
 * @author shkstart
 * @create 2021-09-0815:08
 */
public class Offer19 {
    public static void main(String[] args) {
        
        String s = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int left = 0,right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left ++;right --;
            }else{
                if(check(s,left + 1,right)) return true;
                else if(check(s,left,right - 1)) return true;
                else return false;
            }
        }
        return true;
    }
    static boolean check(String s,int left,int right){
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left ++;right --;
            }else return false;
        }
        return true;
    }
}
