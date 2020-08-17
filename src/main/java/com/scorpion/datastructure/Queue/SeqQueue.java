package com.scorpion.datastructure.Queue;

import java.io.Serializable;
import java.util.NoSuchElementException;

public class SeqQueue<E> implements Queue<E>, Serializable {

    private static final long serialVersionUID = -1664818681270068094L;
    private static final int DEFAULT_SIZE = 10;

    private E elementData[];

    private int front, rear;
    private int size;

    public SeqQueue() {
        elementData = (E[]) new Object[DEFAULT_SIZE];
        front = rear = 0;
    }

    public SeqQueue(int capacity) {
        elementData = (E[]) new Object[capacity];
        front = rear = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E data) {
        //判断是否满队
        if (this.front == (this.rear + 1) % this.elementData.length) {
            //扩容
            ensureCapacity(elementData.length * 2 + 1);
        }

        //添加data
        elementData[this.rear] = data;
        this.rear = (this.rear + 1) % elementData.length;
        size++;

        return true;
    }

    @Override
    public boolean offer(E data) {
        if (data == null)
            throw new NullPointerException("The data can\\'t be null");

        //队满抛出异常
        if (this.front == (this.rear + 1) % elementData.length) {
            throw new IllegalArgumentException("The capacity of SeqQueue has reached its maximum");
        }

        //添加data
        elementData[this.rear] = data;
        this.rear = (this.rear + 1) % elementData.length;
        size++;

        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("The SeqQueue is empty");
        }
        return poll();
    }

    @Override
    public E poll() {
        E temp = this.elementData[this.front];
        this.front = (this.front + 1) % elementData.length;
        size--;
        return temp;
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("The SeqQueue is empty");
        }
        return peek();
    }

    @Override
    public E peek() {
        return elementData[front];
    }

    @Override
    public void clearQueue() {
        for (int i = this.front; i != this.rear; i = (i + 1) % elementData.length) {
            elementData[i] = null;
        }
        //复位
        this.front = this.rear = 0;
        size = 0;
    }

    public void ensureCapacity(int capacity) {
        if (capacity < size)
            return;

        E[] old = elementData;
        elementData = (E[]) new Object[capacity];
        int j = 0;

        for (int i = this.front; i != this.rear; i = (i + 1) % old.length) {
            elementData[j++] = old[i];
        }

        this.front = 0;
        this.rear = j;
    }

    @Override
    public boolean isEmpty() {
        return rear == front;
    }
}

