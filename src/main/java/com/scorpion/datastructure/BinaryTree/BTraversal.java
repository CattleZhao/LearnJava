package com.scorpion.datastructure.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class BTraversal {
    //递归二叉树的前序遍历
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //非递归实现二叉树的前序遍历
    public static ArrayList<TreeNode> preOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                list.add(p);
                stack.push(p);
                p = p.left;
            } else {
                TreeNode temp = stack.pop();
                p = temp.right;
            }
        }
        return list;
    }

    //递归中序遍历
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    //非递归中序遍历
    public static ArrayList<TreeNode> inOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode temp = stack.pop();
                list.add(temp);
                p = temp.right;
            }
        }
        return list;
    }

    //递归后序
    public static void posOrder(TreeNode root) {
        if (root != null) {
            posOrder(root.left);
            posOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    //非递归后序遍历
    public static ArrayList<TreeNode> posOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode cur = null;
        TreeNode pre = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            cur = stack.peek();
            /*
            因此对于任一结点P，先将其入栈。如果P不存在左孩子和右孩子，则可以直接访问它；
            或者P存在左孩子或者右孩子，但是其左孩子和右孩子都已被访问过了，则同样可以直接访问该结点。
            若非上述两种情况，则将P的右孩子和左孩子依次入栈，这样就保证了每次取栈顶元素的时候，
            左孩子在右孩子前面被访问，左孩子和右孩子都在根结点前面被访问。
             */
            if ((cur.left == null && cur.right == null) || (pre != null && (cur.right == pre || cur.left == pre))) {
                TreeNode temp = stack.pop();
                list.add(temp);
                pre = temp;
            } else {
                if (cur.right != null)
                    stack.push(cur.right);
                if (cur.left != null)
                    stack.push(cur.left);

            }
        }
        return list;
    }

    //简单创建一个简单的二叉树
    public static TreeNode createBT() {
        TreeNode i = new TreeNode("I");
        TreeNode h = new TreeNode("H");
        TreeNode g = new TreeNode("G");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F", h, i);
        TreeNode d = new TreeNode("D", null, g);
        TreeNode c = new TreeNode("C", f, null);
        TreeNode b = new TreeNode("B", d, e);
        TreeNode root = new TreeNode("A", b, c);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = createBT();
        //递归实现前序遍历
        preOrder(root);
        System.out.println();
        //非递归实现前序遍历
        for (TreeNode o : preOrder1(root)) {
            System.out.print(o.val + " ");
        }
        System.out.println();
        System.out.println("********************************");
        inOrder(root);
        System.out.println();
        for (TreeNode o : inOrder1(root)) {
            System.out.print(o.val + " ");
        }
        System.out.println();
        System.out.println("********************************");

        posOrder(root);
        System.out.println();
        for (TreeNode o : posOrder1(root)) {
            System.out.print(o.val + " ");
        }
        System.out.println();
        System.out.println("********************************");

    }
}
