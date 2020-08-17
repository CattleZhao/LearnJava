package com.scorpion.SwordOffer;

public class BalanceTree {

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1) {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        } else {
            return false;
        }
    }

    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return (left > right ? left : right) + 1;
    }

    private boolean isBalance = false;

    public boolean IsBalanced_solution2(TreeNode root) {
        getDepth2(root);
        return isBalance;
    }

    public int getDepth2(TreeNode root) {
        if (root == null) {
            isBalance = true;
            return 0;
        }
        int left = getDepth2(root.left);
        int right = getDepth2(root.right);
        int depth = (left > right ? left : right) + 1;
        if (Math.abs(left - right) <= 1) {
            isBalance = true;
        } else {
            isBalance = false;
        }
        return depth;
    }

}
