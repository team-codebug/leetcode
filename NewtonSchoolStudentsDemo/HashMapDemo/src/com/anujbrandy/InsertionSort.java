package com.anujbrandy;

public class InsertionSort {
    // if we have a single element, it is already sorted
    // 0, 2, 3
    // i = 2
    // position = 1
    // valueToInsert = 0
    // arr[1] -> 2
    // position -> 0
    // 4, 6, 7, 9
    // 7
    // 2, 3 | 0
    // 0, 1   2
    // i->2
    // position->2
    // valueToInsert->0
    // T - O(n2)
    // S - O(1)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i += 1) {
            int position = i;
            int valueToInsert = arr[i];

            while (position > 0 && arr[position - 1] > valueToInsert) {
                arr[position] = arr[position - 1];
                position -= 1;
            }

            arr[position] = valueToInsert;
        }
    }

    public static void printArr(int[] arr) {
        System.out.println("----------");
        for (int i = 0; i < arr.length; i += 1) {
            System.out.println(arr[i]);
        }
        System.out.println("----------");
    }

    public static void main(String[] args) {
        int[] arr = new int[] {
            14, 33, 27, 10, 35, 19, 42, 44
        };

        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
