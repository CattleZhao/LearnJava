package com.scorpion.datastructure.List.singleList;

import com.scorpion.datastructure.List.ILinkedList;

public class SingleILinkedList<E> implements ILinkedList<E> {

    protected Node<E> head;

    public SingleILinkedList(Node<E> head) {
        this.head = head;
    }

    public SingleILinkedList() {

    }

    public SingleILinkedList(E[] array) {
        this.head = null;
        if (array != null && array.length > 0) {
            this.head = new Node<>(array[0]);
            Node<E> rear = this.head;
            int i = 1;
            while (i < array.length) {
                rear.next = new Node<>(array[i]);
                rear = rear.next;
            }
        }
    }

    public SingleILinkedList(SingleILinkedList<E> list) {
        this.head = null;
        if (list != null && list.head != null) {
            this.head = new Node<>(list.head.data);
            Node<E> rear = this.head;
            Node<E> p = list.head.next;
            while (p != null) {
                rear.next = new Node<>(p.data);
                rear = rear.next;
                p = p.next;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public int length() {
        int length = 0;
        Node<E> p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        return length;
    }

    @Override
    public E get(int index) {
        if (this.head != null && index >= 0) {
            int count = 0;
            Node<E> p = this.head;
            while (p != null && count < index) {
                p = p.next;
                count++;
            }

            if (p != null)
                return p.data;
        }
        return null;
    }

    @Override
    public E set(int index, E data) {
        if (this.head!=null&&index>=0&&data!=null){
            Node<E> pre = this.head;
            int count = 0;
            while (pre!=null&&count<index){
                pre = pre.next;
                count++;
            }
            if (pre!=null){
                E oldData = pre.data;
                pre.data = data;
                return oldData;
            }
        }
        return null;
    }


    @Override
    public boolean add(int index, E data) {
        if (data==null)
            return false;

        if (this.head==null||index<=1){
            this.head = new Node<>(data, this.head);
        }else {
            int count = 0;
            Node<E> front = this.head;
            while (front.next!=null&&count<index-1){
                front = front.next;
                count++;
            }
            front.next = new Node<>(data, front.next);
        }
        return true;
    }

    @Override
    public boolean add(E data) {
        return add(Integer.MAX_VALUE, data);
    }

    @Override
    public E remove(int index) {
        E old = null;

        if(this.head!=null&&index>=0){
            if (index == 0){
                old = this.head.data;
                this.head = this.head.next;
            }else {
                Node<E> front = this.head;
                int count = 0;
                while (front.next!=null&&count<index-1){
                    front = front.next;
                    count++;
                }
                if (front.next!=null){
                    old = front.next.data;
                    front.next = front.next.next;
                }
            }
        }
        return old;
    }


    @Override
    public boolean removeAll(E data) {
        boolean isRemove = false;
        if (this.head!=null&&data!=null){
            if (data.equals(this.head.data)){
                this.head = this.head.next;
                isRemove = true;
            }else {
                Node<E> front = this.head;
                Node<E> pre = front.next;
                while (pre!=null){
                    if (data.equals(pre.data)){
                        front.next = pre.next;
                        pre = front.next;
                        isRemove = true;
                    }else {
                        front = pre;
                        pre = pre.next;
                    }
                }
            }
        }else {
            isRemove = false;
        }
        return isRemove;
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public boolean contains(E data) {
        if (this.head!=null&&data!=null){
            Node<E> pre = this.head;
            while (pre!=null){
                if (data.equals(pre.data)){
                    return  true;
                }
                pre = pre.next;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str="(";
        Node<E> pre = this.head;
        while (pre!=null)
        {
            str += pre.data;
            pre = pre.next;
            if (pre!=null)
                str += ", ";
        }
        return str+")";
    }


}
