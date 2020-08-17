package com.scorpion.leetcode.binarytree;

import com.scorpion.leetcode.TreeNode;

public class BalancedBinaryTree {
    private int height(TreeNode node){
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(height(root.left) - height(root.right)) < 2
                && isBalanced(root.left)&&isBalanced(root.right);
    }
}
