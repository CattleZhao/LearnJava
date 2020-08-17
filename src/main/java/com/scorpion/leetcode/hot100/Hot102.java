package com.scorpion.leetcode.hot100;

import com.scorpion.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Hot102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        while (!level.isEmpty()) {
            int levelSize = level.size();
            List<Integer> eachLevel = new ArrayList<>();
            while (levelSize > 0) {
                TreeNode node = level.poll();
                if (node != null) {
                    eachLevel.add(node.val);
                    level.add(node.left);
                    level.add(node.right);
                }
                levelSize--;
            }
            if (eachLevel.size() > 0) {
                result.add(eachLevel);
            }
        }
        return result;
    }

}
