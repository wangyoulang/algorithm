package com.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-259:36
 */
public class LeetCode797 {
    /**
     * 797.所有可能路径
     * 给你一个有 n 个节点的 有向无环图（DAG），请你找出所有从节点 0 到节点 n-1 的路径并输出（不要求按特定顺序）
     *
     * 二维数组的第 i 个数组中的单元都表示有向图中 i 号节点所能到达的下一些节点，空就是没有下一个结点了。
     *
     */
    public static void main(String[] args) {
        int[][] graph = {{1,2},{3},{3},{}};
        List<List<Integer>> ans = allPathsSourceTarget(graph);
        System.out.println();
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = graph.length;
        dfs(graph,new ArrayList<>(Arrays.asList(0)),ans,0,n);
        return ans;
    }
    static void dfs(int[][] graph,List<Integer> curr,List<List<Integer>> result,int x,int n){
        if(x == n - 1){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int y:graph[x]){
            curr.add(y);
            dfs(graph,curr,result,y,n);
            curr.remove(curr.size() - 1);
        }
    }
}
