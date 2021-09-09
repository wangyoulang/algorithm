package com.jianzhi_offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-09-0716:34
 */
public class Offer16 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        char a = '\0';
        System.out.println(a == '\0');
//        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println((char)('A' + 32));

    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        for(int i = 0;i < s.length();i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            ans = Math.max(ans,i - left + 1);
        }
        return ans;
    }
}
