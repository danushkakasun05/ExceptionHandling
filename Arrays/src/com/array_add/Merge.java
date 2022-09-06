package com.array_add;

public class Merge {

    public int[] getAll() {
        return all;
    }

    public void setAll(int[] all) {
        this.all = all;
    }

    private int[] all;
    public  Merge(int[] arr1, int[] arr2, int[] arr3) {
        int[] all = new int[arr1.length + arr2.length + arr3.length];
        for (int i = 0; i < all.length; i++) {

            if (i < arr1.length) {
                all[i] = arr1[i];
            } else if (i < arr1.length + arr2.length) {
                all[i] = arr2[i - arr1.length];
            } else {
                all[i] = arr3[i - arr1.length - arr2.length];
            }


        }

        this.all = all;

    }
}
