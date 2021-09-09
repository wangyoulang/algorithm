package com;

import java.util.*;

/**
 * @author shkstart
 * @create 2021-08-2719:16
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length <= 2) return new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < n;i ++){
            List<Integer> curr = twoSum(nums,0 - nums[i],i);
            if(curr.size() != 0){
                curr.add(nums[i]);
                Collections.sort(curr);
                ans.add(curr);
            }
        }
        return ans;
    }
    static List twoSum(int[] nums,int target,int index){
        int left = index + 1,right = nums.length - 1;
        List<Integer> ans = new ArrayList<>();
        while(left < right){
            if(nums[left] + nums[right] == target){
                ans.add(nums[left]);ans.add(nums[right]);
                return ans;
            }else if(nums[left] + nums[right] < target) left ++;
            else right --;
        }
        return ans;
    }

 }
