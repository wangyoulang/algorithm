package com.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 17.电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class LeetCode17 {
    public static void main(String[] args){
        System.out.printf("1");
    }

    public static List<String> letterCombinations(String digits) {
        int n = digits.length();
        if(n == 0){
            return Arrays.asList("");
        }
        int[] digit = new int[n];
        for(int i = 0;i < n;i ++){
            digit[i] = digits.charAt(i) - 48;
            List<String> repository = new ArrayList<>();
            switch (digit[i]){
                case 2: repository.add("abc"); break;
                case 3: repository.add("def"); break;
                case 4: repository.add("ghi"); break;
                case 5: repository.add("jkl"); break;
                case 6: repository.add("mno"); break;
                case 7: repository.add("pqrs"); break;
                case 8: repository.add("tuv"); break;
                case 9: repository.add("wxyz"); break;
            }
        }

        return null;
    }
//    public void dfs(List<String> list, List<String> dumpList)
}
