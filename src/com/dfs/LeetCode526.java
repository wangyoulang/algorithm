package com.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class LeetCode526 {

    private static int result = 0;
    public static void main(String[] args) {
        countArrangement(3);
        System.out.println();
    }
    public static int countArrangement(int n) {
        int[] source = new int[n];
        boolean vis[] = new boolean[n + 1];
        for(int i = 1;i <= n;i ++){
            source[i - 1] = i;
        }
//        int result = 0;
//        List<List<Integer>> result = new ArrayList<>();
        dfs3(n,0,source,vis,1);
        return result;
    }
    public static void dfs1(int n,List<List<Integer>> result,List<Integer> curr,int index,int[] source){//允许重复的搜索
        if(curr.size() == n){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(index == n){
            return;
        }
        for(int i = 0;i < n;i ++){
            curr.add(source[i]);
            dfs1(n,result,curr,i,source);
            curr.remove(curr.size() - 1);
        }
    }
    public static void dfs2(int n,List<List<Integer>> result,List<Integer> curr,int index,int[] source,boolean[] vis){//无重复搜索
        if(curr.size() == n){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(index == n){
            return;
        }
        for(int i = 0;i < n;i ++){
            if(!vis[i]){
                vis[i] = true;
                curr.add(source[i]);
                dfs2(n,result,curr,i,source,vis);
                curr.remove(curr.size() - 1);
                vis[i] = false;
            }
        }
    }
    public static void dfs(int n,List<Integer> curr,int index,int[] source,boolean[] vis,int subscript){
        if(curr.size() == n){
            result ++;
            return;
        }
        if(index == n){
            return;
        }
        for(int i = 0;i < n;i ++){
            if(!vis[i] && ((subscript % source[i] == 0 || source[i] % subscript == 0))){
                subscript ++;
                vis[i] = true;
                curr.add(source[i]);
                dfs(n,curr,i,source,vis,subscript);
                curr.remove(curr.size() - 1);
                vis[i] = false;
                subscript --;
            }
        }
    }
//优化
    public static void dfs3(int n,int index,int[] source,boolean[] vis,int subscript){
        if(subscript > n){
            result ++;
            return;
        }
        if(index == n){
            return;
        }
        for(int i = 0;i < n;i ++){
            if(!vis[i] && ((subscript % source[i] == 0 || source[i] % subscript == 0))){
                subscript ++;
                vis[i] = true;
                dfs3(n,i,source,vis,subscript);
                vis[i] = false;
                subscript --;
            }
        }
    }
}
