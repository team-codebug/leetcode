package com.anujbrandy;

public class BubbleSort2 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        // 5
        // 4
        // 3
        // 1
        // i = 0
        // i = 1
        // i = 2
        // Time complexity for bubble sort - O(n^2)
        // 1     2    3    1000
        // 1000  999  998 ....
        // 1 + 2 + ... + 1000
        // 1000 * (1000 + 1) / 2
        // 1000^2
        // T - O(n^2), S - O(1)
        for (int i = 0; i < arr.length - 1; i += 1) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j += 1) {
                if (arr[j] > arr[j + 1]) {
                    // they are not in order
                    swapped = true;
                    swap(arr, j, j + 1);
                }
            }

            if (!swapped) {
                break;
            }
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
            8, 2, 6, 9, 4
        };

        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
}
