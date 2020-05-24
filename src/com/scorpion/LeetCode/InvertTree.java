package com.scorpion.LeetCode;

public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null )
            return root;

        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left!=null)
            invertTree(root.left);
        if (root.right != null)
            invertTree(root.right);
        return root;
    }

}
