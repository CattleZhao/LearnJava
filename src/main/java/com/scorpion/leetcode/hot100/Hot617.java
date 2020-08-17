package com.scorpion.leetcode.hot100;

import com.scorpion.datastructure.BinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Hot617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if ((t1 == null && t2 != null)) {
            return t2;
        }
        if ((t1 != null && t2 == null)) {
            return t1;
        }
        if (t1 != null && t2 != null) {
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
        }
        return t1;
    }

    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        Deque<TreeNode[]> stack = new ArrayDeque<TreeNode[]>();
        if (t1 == null)
            return t2;
        stack.push(new TreeNode[]{t1, t2});
        while (!stack.isEmpty()){
            TreeNode[] treeNodes = stack.pop();
            if (treeNodes[0] == null || treeNodes[1] == null)
                continue;
            treeNodes[0].val += treeNodes[1].val;
            if (treeNodes[0].left == null){
                treeNodes[0].left = treeNodes[1].left;
            }else {
                stack.push(new TreeNode[]{treeNodes[0].left, treeNodes[1].left});
            }
            if (treeNodes[0].right == null){
                treeNodes[0].right = treeNodes[1].right;
            }else {
                stack.push(new TreeNode[]{treeNodes[0].right, treeNodes[1].right});
            }
        }
        return t1;
    }

}
