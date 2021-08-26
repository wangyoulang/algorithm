package com.daily;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-08-2614:43
 * https://leetcode-cn.com/problems/boats-to-save-people/
 * 881救生艇
 */
public class Day8_26 {
    public static void main(String[] args) {
        int[] people = new int[]{3,2,2,1};
        System.out.println(numRescueBoats(people,3));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;
        int left = 0,right = people.length - 1;
        while (left <= right){
            if(people[left] + people[right] <= limit){
                ans ++;
                left ++;
                right --;
            }else {
                ans ++;
                right --;
            }
        }
        return ans;
    }

}
