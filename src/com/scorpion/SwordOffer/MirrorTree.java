package com.scorpion.SwordOffer;

public class MirrorTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void Mirror(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        if (root.left != null)
            Mirror(root.left);
        if (root.right != null)
            Mirror(root.right);
    }

    boolean isSymmetrical(TreeNode pRoot)
    {
        return isSymmetrical(pRoot, pRoot);
    }
    boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2){
        if (pRoot1.left==null&&pRoot2.right==null)
            return true;
        if (pRoot1==null||pRoot2==null)
            return false;
        if (pRoot1.val!=pRoot2.val)
            return false;
        return isSymmetrical(pRoot1.left,pRoot2.right)&&isSymmetrical(pRoot1.right,pRoot2.left);
    }

}
