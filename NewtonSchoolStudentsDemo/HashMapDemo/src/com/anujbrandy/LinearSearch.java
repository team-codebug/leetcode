package com.anujbrandy;

public class LinearSearch {
    // Linear search
    // T - O(n)
    // S - O(1)
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {
                14, 33, 27, 10, 35, 19, 42, 44
        };
        int target = 42;
        System.out.println(search(arr, target));
        target = 100;
        System.out.println(search(arr, target));
    }
}
