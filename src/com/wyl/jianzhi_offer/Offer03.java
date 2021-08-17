package com.wyl.jianzhi_offer;
/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * */
public class Offer03 {
    public static int findRepeatNumber(int[] nums) {
        //第一种方法：时间复杂度O(n^2)
//        int len = nums.length;
//        for(int i = 0;i < len - 1;i ++){
//            int left = i + 1;
//            int right = len - 1;
//            while(left <= right){
//                if(nums[left] == nums[i] || nums[right] == nums[i]){
//                    return nums[i];
//                }
//                left ++;
//                right --;
//            }
//        }
//        return -1;
        //第二种方法：
        int[] array = new int[nums.length];

        for(int i = 0;i < nums.length;i ++){
            array[nums[i]]++;
        }
        for(int i = 0;i < nums.length;i ++){
            if(array[i] > 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(findRepeatNumber(nums));
    }
}
