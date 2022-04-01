package com.anujbrandy;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0,
                right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {
                10, 14, 19, 27, 33, 35, 42, 44
        };
        System.out.println(binarySearch(arr, 14));
        // 1
        System.out.println(binarySearch(arr, 43));
        // -1
        System.out.println(binarySearch(arr, 33));
        // 4

    }
}
