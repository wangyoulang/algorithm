package com.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 78.子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */

public class LeetCode78 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> result = subsets(nums);
        System.out.println();
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i <= nums.length;i ++){
            backtrack(nums,result,new ArrayList<>(),0,i);
        }
        return result;
    }
    public static void backtrack(int[] nums,List<List<Integer>> result,List<Integer> curr,int index,int len){
        if(curr.size() == len){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index;i < nums.length;i ++){
            curr.add(nums[i]);
            backtrack(nums,result,curr,i + 1,len);
            curr.remove(curr.size() - 1);
        }
    }
}
