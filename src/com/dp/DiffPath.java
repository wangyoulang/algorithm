package com.dp;

/**
 * @author shkstart
 * @create 2021-08-2614:29
 */
public class DiffPath {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,1},{0,0}};
        System.out.println(diffPath2(grid));
//        System.out.println(diffPath(3,2));
    }
    static int diffPath(int m,int n){
        if(n < 2 || m < 2){
            return 1;
        }
        int[][] dp = new int[m][n];
        for(int i = 1;i < m;i ++){
            dp[i][0] = 1;
        }
        for(int i = 1;i < n;i ++){
            dp[0][i] = 1;
        }

        dp[0][1] = 1;dp[1][0] = 1;
        for(int i = 1;i < m;i ++){
            for(int j = 1;j < n;j ++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
    static int diffPath2(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(n < 2 || m < 2){
            return 1;
        }
        int[][] dp = new int[m][n];
        for(int i = 1;i < m;i ++){
            if(obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
            }else dp[i][0] = 1;
        }
        for(int i = 1;i < n;i ++){
            if(obstacleGrid[0][i] == 1){
                dp[0][i] = 0;
            }else dp[0][i] = 1;
        }
        for(int i = 1;i < m;i ++){
            for(int j = 1;j < n;j ++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
