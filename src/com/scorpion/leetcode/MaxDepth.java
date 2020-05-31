package com.scorpion.leetcode;

public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left_depth = maxDepth(root.left);
        int rioght_depth = maxDepth(root.right);
        return Math.max(left_depth, rioght_depth) + 1;
    }

}
