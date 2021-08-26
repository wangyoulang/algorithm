package com.daily;

import java.util.Arrays;

public class Day8_4 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,4};
        int a = triangleNumber(nums);
        System.out.println();
    }
    public static int triangleNumber(int[] nums) {
        //排序
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0;i < nums.length;i ++){
            for(int j = i + 1;j < nums.length;j ++){
                if(nums[i] != 0){
                    int left = j + 1,right = nums.length - 1;
                    while(left <= right){
                        int mid = (right - left)/2 + left;
                        if(nums[i] + nums[j] > nums[mid]){
                            left = mid + 1;
                        }else{
                            right = mid - 1;
                        }
                    }
                    result += left - (j + 1);
                }

            }
        }
        return result;
    }
}
