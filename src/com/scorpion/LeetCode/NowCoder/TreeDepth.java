package com.scorpion.LeetCode.NowCoder;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeDepth {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        int depth = 0;
        TreeNode p = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(p);
        TreeNode last = p;
        while (!q.isEmpty()){
            TreeNode node = q.poll();
            if (node.left!=null) q.offer(node.left);
            if (node.right!=null) q.offer(node.right);
            if (node==last){
                depth++;
                last = ((LinkedList<TreeNode>) q).peekLast();
            }
        }
        return depth;
    }
}
