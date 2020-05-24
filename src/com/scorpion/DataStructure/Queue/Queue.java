package com.scorpion.DataStructure.Queue;

public interface Queue<E> {

    int size();

    /**
     * 添加data至队列
     * @param data
     * @return
     */
    boolean add (E data);

    /**
     * offer 方法
     * @param data
     * @return
     */
    boolean offer (E data);


    /**
     * 出队,执行删除操作,若队列为空,抛出异常:NoSuchElementException
     * @return
     */
    E remove();

    /**
     * 出队,执行删除操作,返回队头元素,若队列为空,返回null
     * @return
     */
    E poll();

    /**
     * 返回队头元素,不执行删除操作,若队列为空,抛出异常:NoSuchElementException
     * @return
     */
    E element();

    /**
     * 返回队头元素,不执行删除操作,若队列为空,返回null
     * @return
     */
    E peek();

    void clearQueue();

    boolean isEmpty();
}
