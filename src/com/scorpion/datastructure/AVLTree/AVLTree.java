package com.scorpion.datastructure.AVLTree;

public class AVLTree<T extends Comparable> {

    public AVLNode<T> root;

    public int height(AVLNode<T> p) {
        return p == null ? -1 : p.height;
    }


    /**
     * 左左单旋转，w变为x的根节点，x变为w的右子树
     * w原来是x的左节点
     *
     * @param x
     * @return
     */
    private AVLNode<T> singleRotateLeft(AVLNode<T> x) {
        //把w节点旋转为根节点
        AVLNode<T> w = x.left;
        x.left = w.right;
        w.right = x;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        w.height = Math.max(height(w.left), x.height) + 1;
        return w;
    }

    private AVLNode<T> singleRotateRight(AVLNode<T> x) {
        AVLNode<T> w = x.right;
        x.right = w.left;
        w.left = x;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        w.height = Math.max(height(w.right), height(x)) + 1;
        return w;
    }

    private AVLNode<T> doubleRotateWithLeft(AVLNode<T> x) {
        x.left = singleRotateRight(x.left);
        return singleRotateLeft(x);
    }

    private AVLNode<T> doubleRotateWithRight(AVLNode<T> x) {
        x.right = singleRotateLeft(x.right);
        return singleRotateRight(x);
    }

    /**
     * 平衡二叉树插入操作的实现
     */
    public void insert(T data) {
        this.root = insert(data, root);
    }

    private AVLNode<T> insert(T data, AVLNode<T> p) {
        if (p == null) {
            p = new AVLNode<T>(data);
        } else if (data.compareTo(p.data) < 0) {
            p.left = insert(data, p.left);
            if (height(p.left) - height(p.right) == 2) {
                if (data.compareTo(p.left) < 0) {
                    p = singleRotateLeft(p);
                } else {
                    p = doubleRotateWithLeft(p);
                }
            }
        } else if (data.compareTo(p.data) > 0) {
            p.right = insert(data, p.right);

            if (height(p.right) - height(p.left) == 2) {
                if (data.compareTo(p.left) < 0) {
                    p = doubleRotateWithRight(p);
                } else {
                    p = singleRotateRight(p);
                }
            }
        }
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        return p;
    }

    public void remove(T data){
        this.root = remove(data, root);
    }

    private AVLNode<T> remove(T data, AVLNode<T> p){
        if (p == null)
            return null;
        int result = data.compareTo(p.data);
        //从左子树查找需要删除的元素
        if (result < 0) {
            p.left = remove(data, p.left);
            if (height(p.left) - height(p.right) == 2) {
                if (data.compareTo(p.left) < 0) {
                    p = singleRotateLeft(p);
                } else {
                    p = doubleRotateWithLeft(p);
                }
            }
        }else if (result>0){
            p.right = remove(data, p.right);
            if (height(p.right) - height(p.left) == 2) {
                if (data.compareTo(p.left) < 0) {
                    p = doubleRotateWithRight(p);
                } else {
                    p = singleRotateRight(p);
                }
            }
        }else if(p.left!=null&&p.right!=null){

        }
        return p;
    }

}
