package com.scorpion.DataStructure.List;

/**
 * 顺序表顶级接口
 */
public interface ISeqList<E> {

    /**
     * 判断链表是否为空
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

    boolean remove(E data);

    boolean removeAll(E data);

    void clear();

    boolean contains(E data);

    int indexOf(E data);

    int lastIndexOf(E data);

    String toString();
}
