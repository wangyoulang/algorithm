package com.jianzhi_offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-2915:59
 */
public class FourSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,-1,0,-2,2};
        System.out.println(fourSum(nums,0));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < n - 3;i ++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) continue;
            if(nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            for(int j = i + 1;j < n - 2;j ++){
                if(nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target) continue;
                if(nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                int goal = target - nums[i] - nums[j];
                int left = j + 1,right = nums.length - 1;
                while(left < right){
                    if(nums[left] + nums[right] == goal){
                        List<Integer> curr = new ArrayList<>();
                        curr.add(i);
                        curr.add(j);
                        curr.add(left);
                        curr.add(right);
                        if(!ans.contains(curr)) ans.add(curr);
                        left ++;
                        right --;
                    }else if(nums[left] + nums[right] < goal) left ++;
                    else right --;
                }
            }
        }
        return ans;
    }
}
