package com.anujbrandy;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 1) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j += 1) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
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
                9,2,8,6,4,3
        };
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
}
