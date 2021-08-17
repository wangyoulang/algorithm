package com.wyl.daily;

import java.util.ArrayList;
import java.util.List;

public class Day8_5 {
    public static void main(String[] args) {
        int[][] graph = new int[][]{{1,2},{2,3},{5},{0},{5},{},{}};
        List<Integer> ans = eventualSafeNodes(graph);
        System.out.println();
    }
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        int[] color = new int[graph.length];
        for(int i = 0;i < graph.length;i ++){
            if(safe(graph,color,i)){
                result.add(i);
            }
        }
        return result;
    }
    public static boolean safe(int[][] graph,int[] color,int x){
        if(color[x] > 0){
            return color[x] == 2;
        }
        color[x] = 1;
        for(int y:graph[x]){
            if(!safe(graph,color,y)){
                return false;
            }
        }
        color[x] = 2;
        return true;
    }
}
