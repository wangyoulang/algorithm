package com.wyl.daily;

/**
 * 413.等差数列划分
 * 如果一个数列 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 *
 * 例如，[1,3,5,7,9]、[7,7,7,7] 和 [3,-1,-5,-9] 都是等差数列。
 * 给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。
 *
 * 子数组 是数组中的一个连续序列。
 */
public class Day8_10 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(numberOfArithmeticSlices(nums));
    }
    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int INF = 0x3f3f3f3f;
        int[] temp = new int[n];
        temp[n - 1] = INF;
        int left = 0,winLen = 0,result = 0;
        for(int i = 0;i < n - 1;i ++){
            temp[i] = nums[i + 1] - nums[i];
        }
        for(int i = 1;i < n;i ++){
            if(temp[i] == temp[left]){
                continue;
            }
            if(temp[i] != temp[i - 1]){
                left ++;
            }
            result += jieJia(i - left - 1);
            left = i;
        }
        return result;
    }
    public static int jieJia(int n){
        int result = 0;
        for(int i = 1;i <= n;i ++){
            result += i;
        }
        return result;
    }
}
