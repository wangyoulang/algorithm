package com.jianzhi_offer;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 0 <= 数组长度 <= 50000
 * */
public class Dichotomy_53 {
    public int search(int[] nums, int target) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        int mind = 0;
        while(left <= right){
            mind = left + (right - left)/2;
            if(nums[mind] < target){
                left = mind + 1;
            }
            if(nums[mind] >= target){
                right = mind;
            }
        }
        while(left < nums.length && nums[left++] == target){
            result ++;
        }
        return result;
    }
}
