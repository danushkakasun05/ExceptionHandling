package com.array_add;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];
        int[] arr3 = new int[2];
        arr1[0] = 1;
        arr1[1] = 2;
        arr2[0] = 10;
        arr2[1] = 11;
        arr3[0] = 21;
        arr3[1] = 22;
        Merge mer = new Merge(arr1,arr2,arr3);
        Sort sor = new Sort();
        System.out.println("hi"+mer.getAll()[2]);;

    }
}
