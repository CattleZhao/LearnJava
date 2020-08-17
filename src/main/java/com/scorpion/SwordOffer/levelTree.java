package com.scorpion.SwordOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class levelTree {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null)
            return list;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = ((LinkedList<TreeNode>) queue).pollFirst();
            if (temp.left!=null)
                ((LinkedList<TreeNode>) queue).add(temp.left);
            if (temp.right!=null)
                ((LinkedList<TreeNode>) queue).add(temp.right);
            list.add(temp.val);
        }
        return list;
    }


}
