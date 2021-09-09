package com.jianzhi_offer;

/**
 * @author shkstart
 * @create 2021-08-2914:43
 */
public class Offer08 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0;i < n;i ++){
            int sum = nums[i];
            for(int j = i + 1;j < n;j ++){
                sum += nums[j];
                if(sum >= target){
                    if(i == 0) ans = j - i + 1;
                    else ans = Math.min(ans,j - i + 1);
                    break;
                }
            }
        }
        return ans;
    }
}
