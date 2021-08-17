package com.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 22.括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 */
public class LeetCode22 {

    public static void main(String[] args) {
        List<String> result = generateParenthesis(3);
        System.out.println();
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String curr = "";
        backtrack(n,result,curr,0,0);
        return result;
    }
    public static void backtrack(int n,List<String> result,String curr,int left,int right) {
//        if (right > left) {
//            return;
//        }
        if (left == n && left == right) {
            result.add(curr);
            return;
        }
        if (left < n) {
            backtrack(n, result, curr + "(", left + 1, right);
        }
        if (right < left) {
            backtrack(n, result, curr + ")", left, right + 1);
        }
    }
}
