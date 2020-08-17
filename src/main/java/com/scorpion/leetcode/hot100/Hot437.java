package com.scorpion.leetcode.hot100;

import com.scorpion.leetcode.TreeNode;

public class Hot437 {

    //递归
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return countPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int countPath(TreeNode node, int sum) {
        if (node == null) return 0;
        sum = sum - node.val;
        int result = sum == 0 ? 1 : 0;
        return result + countPath(node.left, sum) + countPath(node.right, sum);
    }

}
