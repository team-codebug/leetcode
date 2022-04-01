package com.anujbrandy;

public class BinaryGuessNumber {
    public static int guess(int num) {
        // target
        int target = 90;

        if (num == target) {
            return 0;
        } else if (num > target) {
            return -1;
        } else {
            return 1;
        }
    }

    // 1...n
    public static int guessNumber(int n) {
        int left = 1,
                right = n;
        int count = 0;
        while (left <= right) {
            count += 1;
            int mid = left + (right - left) / 2;
            int result = guess(mid);
            if (result == 0) {
                System.out.println(count);
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        guessNumber(100);
    }
}
