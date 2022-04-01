package com.anujbrandy;

public class SelectionSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 4, 2, 3
    // i = 0
    // minIndex = 1
    // T - O(n2)
    // S - O(1)
    // strategy -
    // i  is the position where the minimum element will go
    // minIndex is something that should hold the minimum value's index
    // swap(i, minIndex)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j += 1) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            swap(arr, minIndex, i);
        }
    }
    public static void printArr(int[] arr) {
        System.out.println("----------");
        for (int val: arr) {
            System.out.println(val);
        }
        System.out.println("----------");
    }
    public static void main(String[] args) {
        int[] arr = new int[] {
                14, 33, 27, 10, 35, 19, 42, 44
        };
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
