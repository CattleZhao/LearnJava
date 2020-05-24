package com.scorpion.SwordOffer;

public class HasSubtree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean HashSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;
        boolean result = false;
        if (root1.val == root2.val)
            result = DoesHasSubtree(root1, root2);
        if (!result)
            result = HashSubtree(root1.left, root2);
        if (!result)
            result = HashSubtree(root1.right, root2);
        return result;
    }

    public static boolean DoesHasSubtree(TreeNode root1, TreeNode root2) {

        if (root2 == null) return true;
        if (root1 == null) return true;
        if (!(root1.val == root2.val)) return false;
        return DoesHasSubtree(root1.left, root2.left) && DoesHasSubtree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        HashSubtree(null,null);
    }
}
