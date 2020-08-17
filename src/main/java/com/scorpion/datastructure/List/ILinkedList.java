package com.scorpion.datastructure.List;

/**
 * 链表顶级接口
 * @param <E>
 */
public interface ILinkedList<E> {
    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    int length();

    E get(int index);

    /**
     * 设置某个元素的值
     * @param index
     * @param data
     * @return
     */
    E set(int index, E data);

    /**
     * 根据index添加元素
     * @param index
     * @param data
     * @return
     */
    boolean add(int index, E data);

    /**
     * 添加元素
     * @param data
     * @return
     */
    boolean add(E data);

    E remove(int index);


    boolean removeAll(E data);

    void clear();

    boolean contains(E data);

    String toString();
}
