package com.scorpion.datastructure.List.SeqList;

import com.scorpion.datastructure.List.ISeqList;

public class SeqList<E> implements ISeqList<E> {

    private Object[] table;
    private int length;

    public SeqList(int capacity) {
        this.table = new Object[Math.abs(capacity)];
        this.length = 0;
    }

    public SeqList() {
        this(64);
    }

    /**
     * 传入一个数组初始化顺序表
     *
     * @param array
     */
    public SeqList(E[] array) {

        if (array == null) {
            throw new NullPointerException("array can\'t be empty!");
        }

        this.table = new Object[array.length];

        for (int i = 0; i < array.length; i++)
            this.table[i] = array[i];

        this.length = array.length;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < this.length)
            return (E) this.table[index];
        return null;
    }

    @Override
    public E set(int index, E data) {
        if (index >= 0 && index < this.length && data != null) {
            E old = (E) this.table[index];
            this.table[index] = data;
            return old;
        }
        return null;
    }

    @Override
    public boolean add(int index, E data) {
        if (data == null)
            return false;
        if (index < 0)
            index = 0;
        if (index > this.length)
            index = length;
        if (this.length == table.length) {
            Object[] temp = this.table;

            this.table = new Object[temp.length * 2];

            for (int i = 0; i < length; i++)
                this.table[i] = temp[i];
        }

        for (int j = this.length - 1; j >= index; j--)
            this.table[j + 1] = this.table[j];

        this.table[index] = data;
        this.length++;
        return true;
    }

    @Override
    public boolean add(E data) {
        return add(this.length, data);
    }

    @Override
    public E remove(int index) {
        if (this.length != 0 && index >= 0 && index < this.length) {
            //记录删除元素的值并返回
            E old = (E) this.table[index];

            //从被删除的元素位置开,其后的元素都依次往前移动
            for (int j = index; j < this.length - 1; j++) {
                this.table[j] = this.table[j + 1];
            }
            //设置数组元素对象为空
            this.table[this.length - 1] = null;
            //顺序表长度减1
            this.length--;
            return old;
        }
        return null;
    }

    @Override
    public boolean remove(E data) {
        if (this.length != 0 && data != null)
            return this.remove(this.indexOf(data)) != null;
        return false;
    }

    @Override
    public boolean removeAll(E data) {
        boolean done = false;
        if (this.length != 0 && data != null) {
            int i = 0;
            while (i < this.length) {
                if (data.equals(this.table[i])) {
                    this.remove((E)this.table[i]);
                    done = true;
                } else
                    i++;
            }
        }
        return done;
    }

    @Override
    public int indexOf(E data) {
        if (data != null)
            for (int i = 0; i < this.length; i++) {
                //相当则返回下标
                if (this.table[i].equals(data))
                    return i;
            }
        return -1;
    }

    @Override
    public void clear() {
        this.length = 0;
    }

    @Override
    public int lastIndexOf(E data) {
        if (data != null)
            for (int i = this.length - 1; i >= 0; i--)
                if (data.equals(this.table[i]))
                    return i;
        return -1;
    }

    @Override
    public boolean contains(E data) {
        return this.indexOf(data) >= 0;
    }

    @Override
    public String toString() {
        String str="(";
        if (this.length!=0)
        {
            for (int i=0; i<this.length-1; i++)
                str += this.table[i].toString()+", ";
            str += this.table[this.length-1].toString();
        }
        return str+") ";
    }

    public static void main(String[] args) {
        ISeqList<Integer> list = new SeqList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAll(1);
        System.out.println(list.toString());
    }
}
