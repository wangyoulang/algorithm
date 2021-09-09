package com.daily;

/**
 * @author shkstart
 * @create 2021-08-299:53
 */
public class Day8_29 {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1}));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
//        if(arr.length < 3) return arr[0] + arr[1];
        for(int i = 0;i < arr.length;i++){
            for(int w = 1;w <= arr.length;w += 2){
                if(i + w> arr.length) continue;
                int j = 0;
                while(i + j < arr.length && j < w){
                    ans += arr[i + j ++];
                }
            }
        }
        return ans;
    }
}
