package com.wyl.daily;

import javax.sound.midi.Soundbank;

/**
 * 743.网络延迟问题
 * 有 n 个网络节点，标记为 1 到 n。
 *
 * 给你一个列表 times，表示信号经过 有向 边的传递时间。 times[i] = (ui, vi, wi)，其中 ui 是源节点，vi 是目标节点， wi 是一个信号从源节点传递到目标节点的时间。
 *
 * 现在，从某个节点 K 发出一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回 -1 。
 */
public class Day8_2 {
    public static void main(String[] args) {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4, k = 2;
        int ans = networkDelayTime(times,n,k);
        System.out.println(ans);
    }
    /**
     * Floyd算法求最短路径
     */
    public static int networkDelayTime(int[][] _ts,int _n,int _k){
        //初始化邻接矩阵
        int[][] w = new int[_n][_n];
        int INF = 0x3f3f3f3f;
        for(int i = 0;i < _n;i ++){
            for(int j = 0;j < _n;j ++){
                w[i][j] = w[j][i] = i == j ? 0:INF;
            }
        }
        //存图
        for(int[] ts : _ts){
            int u = ts[0] - 1,v = ts[1] - 1,c = ts[2];
            w[u][v] = c;
        }
        w = Floyd(w);
        int ans = 0;
        for(int i = 0;i < _n; i ++){
            ans = ans > w[_k - 1][i] ? ans:w[_k - 1][i];
        }
        return ans >= INF/2 ? -1:ans;
    }
    public static int[][] Floyd(int[][] w){
        int n = w.length;
        for(int p = 0;p < n;p ++){
            for(int i = 0;i < n;i ++){
                for(int j = 0;j < n;j ++){
                    w[i][j] = w[i][j] < (w[i][p] + w[p][j]) ? w[i][j]:(w[i][p] + w[p][j]);
                }
            }
        }
        return w;
    }
}
