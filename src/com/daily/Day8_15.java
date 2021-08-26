package com.daily;

/**
 * 576.出界的数路径
 * 给你一个大小为 m x n 的网格和一个球。球的起始坐标为 [startRow, startColumn] 。你可以将球移到在四个方向上相邻的单元格内（可以穿过网格边界到达网格之外）。你 最多 可以移动 maxMove 次球。
 *
 * 给你五个整数 m、n、maxMove、startRow 以及 startColumn ，找出并返回可以将球移出边界的路径数量。因为答案可能非常大，返回对 109 + 7 取余 后的结果。
 */
public class Day8_15 {
    public static void main(String[] args) {
        int result = findPaths(2,2,2,0,0);
        System.out.println();
    }
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int result = 0;
        recursion(maxMove,startRow,startColumn,result,n,m);
        return result;
    }
    public static void recursion(int maxMove,int startRow,int startColumn,int result,int n,int m){
        if(startRow < 0 || startColumn < 0 || startRow > n || startColumn > m){
            result ++;
            return;
        }
        if(maxMove == 0){
            return;
        }
        recursion(maxMove - 1,startRow - 1,startColumn,result,n,m);
        recursion(maxMove - 1,startRow + 1,startColumn,result,n,m);
        recursion(maxMove - 1,startRow,startColumn - 1,result,n,m);
        recursion(maxMove - 1,startRow,startColumn + 1,result,n,m);
    }
}
