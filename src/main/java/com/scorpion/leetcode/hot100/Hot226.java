package com.scorpion.leetcode.hot100;

import com.scorpion.datastructure.BinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hot226 {

    public TreeNode invertTree(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if(root==null) {
            return null;
        }
        //下面三句是将当前节点的左右子树交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的 左子树
        invertTree(root.left);
        //递归交换当前节点的 右子树
        invertTree(root.right);
        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }
    public TreeNode invertTree2(TreeNode root) {
        if (root == null)
            return null;
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode tmp = current.right;
            current.right =current.left;
            current.left = tmp;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return root;
    }

}
