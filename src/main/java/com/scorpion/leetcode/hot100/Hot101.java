package com.scorpion.leetcode.hot100;

import com.scorpion.datastructure.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Hot101 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);

    }

    public boolean check(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }

    public boolean isSymmetricInterator(TreeNode root) {
        return check2(root, root);
    }

    public boolean check2(TreeNode left, TreeNode right){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(left);
        queue.offer(right);
        while (!queue.isEmpty()){
            left = queue.poll();
            right = queue.poll();
            if (left == null && right == null) continue;
            if ((left == null || right == null) || (left.val != right.val)) return false;

            queue.offer(left.left);
            queue.offer(right.right);

            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }

}
