package com;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2021-08-2719:23
 */
public class Main {
    static int count,res;

    @Test
    public void test() {
        int[] arr = new int[3];
//        dfs();
    }
    public static void dfs(TreeNode root){
        if(root==null||count==0) return;
        dfs(root.left);
        if(--count==0){
            res = root.val;
            return;
        }
        dfs(root.right);
    }
}
