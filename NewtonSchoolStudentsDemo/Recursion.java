package com.anujbrandy;

import java.util.*;

public class Main {
    // iterative way to find the nth fibonacci number
    public static int fibIter(int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        int first = 0,
            second = 1,
            third = 1;
        // 0 1 1 2 3
        for (int num = 3; num <= n; num += 1) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }

    // recursive way to find the nth fibonacci number
    public static int fibRec(int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }

    // sum of n numbers using iterative approach
    public static int sumOfN(int n) {
        int sum = 0;

        for (int num = 1; num <= n; num += 1) {
            sum += num;
        }

        return sum;
    }
    // f(2) -> 2 + f(1)
    // sum of n numbers using recursion
    public static int sumOfNRecursion(int n) {
        // base condition
        if (n == 1) {
            return 1;
        }

        return n + sumOfNRecursion(n - 1);
    }

    public static int multiplyUsingRecursion(int M, int N) {
        if (M == 1) {
            return N;
        }

        return N + multiplyUsingRecursion(M - 1, N);
    }

    // iterative approach to check if string is palindrome or not
    public static boolean isPalindrome(String s) {
        int left = 0,
                right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left += 1;
            right -= 1;
        }

        return true;
    }

    // checking if the string is palindrome using recursion
    public static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    // Tower Of Hanoi
    public static void towerOfHanoi(int n, String fromTower, String toTower, String extraTower) {
        if (n == 0) {
            return;
        }
        // n - 1... 1 2
        towerOfHanoi(n - 1, fromTower, extraTower, toTower);
        System.out.println(n + ":" + fromTower + "->" + toTower);
        towerOfHanoi(n - 1, extraTower, toTower, fromTower);
    }

    public static void main(String[] args) {
        System.out.println(fibIter(5));
        System.out.println(fibRec(5));
        System.out.println(sumOfN(5));
        System.out.println(sumOfNRecursion(5));
        System.out.println(multiplyUsingRecursion(8, 20));
        String s = "madan";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeRecursive(s, 0, s.length() - 1));
        towerOfHanoi(2, "A", "C", "B");
    }
}
