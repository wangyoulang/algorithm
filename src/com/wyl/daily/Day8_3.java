package com.wyl.daily;

import java.util.Arrays;

public class Day8_3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5,4};
        int result = findUnsortedSubarray(nums);
        System.out.println();
    }
    public static int findUnsortedSubarray(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int left = 0,right = nums.length - 1;
        while(left < nums.length){
            if(temp[left] == nums[left]){
                left ++;
            }else break;
        }
        while(right > left){
            if(temp[right] == nums[right]){
                right --;
            }else break;
        }
        if(left == right){
            return 0;
        }else return right - left + 1;
    }
}
