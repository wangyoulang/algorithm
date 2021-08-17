package com.wyl;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
public class LeetCode03 {

    public static void main(String[] args) {
        String s = "";
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);
    }
    //时间复杂度O(n)
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> ans = new HashSet<>();
        int result = 0;
        int n = s.length();
        int left = -1,right = 0;
        for(int i = 0;i < n;i ++){
            if(i != 0){
                ans.remove(s.charAt(i - 1));
            }
            while(right < n && !ans.contains(s.charAt(right))){
                ans.add(s.charAt(right));
                right ++;
            }
            result = result > ans.size() ? result:ans.size();
        }
        return result;
    }
}
