package com.dfs;

import com.common.TreeNode;

/**
 * 938. 二叉搜索树的范围和
 * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
 *
 */
public class LeetCode938 {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int sumLeft = rangeSumBST(root.left, low, high);
        int sumRight = rangeSumBST(root.right, low, high);
        int result = sumLeft + sumRight;
        if(root.val >= low && root.val <= high){
            result += root.val;
        }
        return result;
    }
}
