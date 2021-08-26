package com.daily;

import java.util.*;

/**
* 给你一个大小为m* n的矩阵mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。
 *
 * 请你返回矩阵中战斗力最弱的k行的索引，按从最弱到最强排序。
 *
 * 如果第i行的军人数量少于第j行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 *
 * 军人总是排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 *输入：mat =
 * [[1,1,0,0,0],
 *  [1,1,1,1,0],
 *  [1,0,0,0,0],
 *  [1,1,0,0,0],
 *  [1,1,1,1,1]],
 * k = 3
 * 输出：[2,0,3]
 * 解释：
 * 每行中的军人数目：
 * 行 0 -> 2
 * 行 1 -> 4
 * 行 2 -> 1
 * 行 3 -> 2
 * 行 4 -> 5
 * 从最弱到最强对这些行排序后得到 [2,0,3,1,4]
* */
public class Day8_1 {
    public static void main(String[] args) {
        int[][] mat ={
                {1,1,1,1,1,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1}};
        System.out.println(kWeakestRows(mat,3));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer,Integer> armiesMap = new HashMap<>();
        for(int i = 0;i < n;i ++){
            if(!armiesMap.containsKey(i)){
                for(int j = 0;j < m;j ++){
                    if(mat[i][j] == 0 && j < m){
                        armiesMap.put(i,j);
                        break;
                    }else armiesMap.put(i,m);
                }
            }
        }
        int index = 0;
        int[] result = new int[k];
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(armiesMap.entrySet());
        Collections.sort(list,(o1,o2) -> {
            return o1.getValue().compareTo(o2.getValue());
        });
        for(Map.Entry<Integer,Integer> iterator:list){
            if(index < k){
                result[index] = iterator.getKey();
                index ++;
            }else break;
        }
        return result;
    }
}
