package com.scorpion.DesignPattern.Strategy;

public class Sorter<T> {

    public void sort(T[] a, Comparator comparator){
        for(int i = 0; i < a.length-1; i++){
            int min = i;
            for(int j = i+1; j <a.length ;j++){
                if(comparator.compare(a[j], a[min]) < 0){
                    min = j;
                }
            }
            if(min!=i){
                swap(a, i, min);
            }
        }
    }

    public void swap(T[] arr,int a,int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
