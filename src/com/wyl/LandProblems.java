package com.wyl;
import java.util.*;
/**
 * @discribtion 岛屿问题1234
 * */
public class LandProblems{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String ms = scan.nextLine();
        String ns = scan.nextLine();
        int m = Integer.parseInt(ms);
        int n = Integer.parseInt(ns);
        char[][] hiveGrid = new char[m][n];
        int index = 0;
        //     List<String> hiveList = new ArrayList<>();
        while(scan.hasNextLine()){
            hiveGrid[index++] = scan.nextLine().toCharArray();
        }
        Solution solution = new Solution();
        int result = solution.numIslands(hiveGrid);
        System.out.println(result);

    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length,n = grid[0].length,ans = 0;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 'C'){
                    dfs(grid,i,j,m,n);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] grid,int i,int j,int m,int n){
        if(i >= m || i < 0 || j >= n || j < 0){
            return;
        }
        if(grid[i][j] == 'P' || grid[i][j] == 'X'){
            return;
        }
        if(grid[i][j] == 'C'){
            grid[i][j] = 'X';
        }
        dfs(grid,i + 1,j,m,n);
        dfs(grid,i - 1,j,m,n);
        dfs(grid,i,j + 1,m,n);
        dfs(grid,i,j - 1,m,n);
    }
}
