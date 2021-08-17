package com.recursion;

import sun.util.resources.cldr.ms.CalendarData_ms_BN;

import java.util.ArrayList;
import java.util.List;

/**
 * 39.组合总和
 * 给定一个无重复元素的正整数数组 candidates 和一个正整数 target ，找出 candidates 中所有可以使数字和为目标数 target 的唯一组合。
 *
 * candidates 中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。 
 *
 * 对于给定的输入，保证和为 target 的唯一组合数少于 150 个。
 * 输入: candidates = [2,3,6,7], target = 7
 * 输出: [[7],[2,2,3]]
 */
public class LeetCode39 {
    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        List<List<Integer>> ans = combinationSum(candidates,7);
        System.out.println();
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,target,result,new ArrayList<>(),0);
        return result;
    }
    public static void backtrack(int[] candidates,int target,List<List<Integer>> result,List<Integer> curr,int index){
        if(target < 0){
            return;
        }
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index;i < candidates.length;i ++){
            curr.add(candidates[i]);
            backtrack(candidates,target - candidates[i],result,curr,i);
            curr.remove(curr.size() - 1);
        }
    }
}
