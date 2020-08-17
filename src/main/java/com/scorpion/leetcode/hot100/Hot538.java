package com.scorpion.leetcode.hot100;


import com.scorpion.leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hot538 {

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        TreeNode node = root;
        Deque<TreeNode> stack = new ArrayDeque<>();
        int sum = 0;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.right;
            }

            node = stack.pop();
            sum += node.val;
            node.val = sum;

            node = node.left;
        }
        return root;
    }

}
