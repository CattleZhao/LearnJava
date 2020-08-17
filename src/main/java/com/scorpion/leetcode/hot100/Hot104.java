package com.scorpion.leetcode.hot100;

import com.scorpion.datastructure.BinaryTree.TreeNode;
import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hot104 {

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return 0;
        Deque<Pair<TreeNode, Integer>> queue = new ArrayDeque();
        queue.add(new Pair<>(root, 1));
        while (!queue.isEmpty()){
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int current_depth = pair.getValue();
            if (node != null){
                depth = Math.max(depth, current_depth);
                queue.add(new Pair<>(node.left, current_depth + 1));
                queue.add(new Pair<>(node.right, current_depth + 1));
            }
        }
        return depth;
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        int left  = maxDepth2(root.left);
        int right  = maxDepth2(root.left);
        return Math.max(left, right) + 1;
    }

}
