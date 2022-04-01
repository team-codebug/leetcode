package com.anujbrandy;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int i, j , k; // i -> start to mid, j -> mid + 1 to end, k -> start -> end

        int sizeOfAux1 = mid - start + 1; // start ... mid (0 ... 3)
        int sizeOfAux2 = end - mid; // mid + 1... end ... 3... 5 (4...5)

        int[] aux1 = new int[sizeOfAux1];
        int[] aux2 = new int[sizeOfAux2];
        // 0  1  2  3 4  5
        // 14 20 23
        // start - 0
        // mid - 2
        // mid + 1 - 3
        // end - 5
        // aux1 -> 3 [14, 20, 23]
        // aux2 -> [3, 20, 30]
















        // f(a, 0, 7)
        // 10 14 27 33 19 21 24 35
        // start = 0
        // mid = 3
        // end = 7
        // aux1 -> 4,
        // aux2 -> 4,
        // arr -> 10 14 27 33 19 21 24 35
        // start = 0
        // mid = 3
        // end = 7
        // aux1 -> 10 14 27 33?
        // aux2 -> 19 21 24 35?


        // we have to fill this auxiliary array from our original array
        for (int idx = 0; idx < sizeOfAux1; idx += 1) {
            aux1[idx] = arr[start + idx];
        }

        for (int idx = 0; idx < sizeOfAux2; idx += 1) {
            aux2[idx] = arr[mid + 1 + idx];
        }

        i = 0;
        j = 0;
        k = start;

        // 1 4 6
        //       i
        // 2 3
        //     j
        // 1 2 3 4 6
        //           k
        while (i < sizeOfAux1 && j < sizeOfAux2) {
            if (aux1[i] <= aux2[j]) {
                arr[k] = aux1[i];
                i += 1;
            } else {
                arr[k] = aux2[j];
                j += 1;
            }
            k += 1;
        }

        while (i < sizeOfAux1) {
            arr[k] = aux1[i];
            i += 1;
            k += 1;
        }

        while (j < sizeOfAux2) {
            arr[k] = aux2[j];
            j += 1;
            k += 1;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid); // divide
        mergeSort(arr, mid + 1, end); // divide
        merge(arr, start, mid, end); // conquer
    }

    public static void main(String[] args) {
        int[] arr = new int[] {
                14, 33, 27, 10, 35, 19, 42, 44
        };
        mergeSort(arr, 0, arr.length - 1);
        for (int val: arr) {
            System.out.println(val);
        }
    }
}
