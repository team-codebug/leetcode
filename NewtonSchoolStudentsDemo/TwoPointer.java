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

    public static void swap(char[] cArr, int i, int j) {
        // [1,2,3,4,5]
        //  0,1,2,3,4
        // after swapping at indexes 1 and 4
        // [1,5,3,4,2]

        // temp -> 2
        // cArr[1] = 5
        // [1,5,3,4,2]
        // cArr[4] = temp
        char temp = cArr[i];
        cArr[i] = cArr[j];
        cArr[j] = temp;
    }

    public static void reverse(char[] cArr) {
        int n = cArr.length;
        int half = n / 2;
        // abcd
        // i = 0, 3
        // dcba
        // i = 1, 2
        for (int i = 0; i < half; i += 1) {
            swap(cArr, i, n - i - 1);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int k = nums.length - 1;

        int i = 0,
                j = nums.length - 1;

        while (i <= j) {
            // Math.abs(-3) -> 3
            // Math.abs(10) -> 10
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k] = nums[i] * nums[i];

                i += 1;
            } else {
                result[k] = nums[j] * nums[j];

                j -= 1;
            }

            k -= 1;
        }

        return result;
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0,
                j = 0;
        // 4
        // i = 1
        // 0, 1, 1, 1
        // j = 2
        // i = 4
        while (i < nums.length) {
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i += 1;
            }

            nums[j] = nums[i];
            i += 1;
            j += 1;
        }

        return j;
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0,
                right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] {
                        left + 1,
                        right + 1
                };
            } else if (sum > target) {
                right -= 1;
            } else {
                left += 1;
            }
        }

        return new int[] {
                -1, -1
        };
    }

    public static void reverse2(char[] cArr) {
        int i = 0,
                j = cArr.length - 1;

        while (i < j) {
            swap(cArr, i, j);
            i += 1;
            j -= 1;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
//        System.out.println(fibIter(5));
//        System.out.println(fibRec(5));
//        System.out.println(sumOfN(5));
//        System.out.println(sumOfNRecursion(5));
//        System.out.println(multiplyUsingRecursion(8, 20));
//        String s = "madan";
//        System.out.println(isPalindrome(s));
//        System.out.println(isPalindromeRecursive(s, 0, s.length() - 1));
//        towerOfHanoi(2, "A", "C", "B");

        char[] cArr = new char[] {
                'a', 'e', 'i', 'o', 'u'
        };
        System.out.println(cArr);
        reverse2(cArr);
        System.out.println(cArr);

        int[] nums = new int[] {
                0,0,1,1
        };
        System.out.println("First");
        printArr(nums);
        System.out.println("----------");
        System.out.println(removeDuplicates(nums));
        System.out.println("----------");
        System.out.println("Second");
        printArr(nums);





    }
}
