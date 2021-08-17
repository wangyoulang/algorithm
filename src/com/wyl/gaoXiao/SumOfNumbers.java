package com.wyl.gaoXiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,0,0,0};
        List<List<Integer>> list = threeSum(nums);
        System.out.println();
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3){
            return result;
        }
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i ++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = 0 - nums[i];
            for(int j = i + 1;j < nums.length;j ++){
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int right = nums.length - 1;
                while(j < right){
                    if(nums[j] + nums[right] == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[right]));
                        break;
                    }else if(nums[j] + nums[right] > target){
                        right --;
                    }else break;
                }
            }

        }
        return result;
    }
}
