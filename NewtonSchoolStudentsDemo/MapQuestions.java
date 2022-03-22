package com.anujbrandy;

import java.util.*;

public class MapQuestions {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i += 1) {
            int remain = target - arr[i];

            if (map.containsKey(remain)) {
                return new int[] {
                        i,
                        map.get(remain)
                };
            }

            map.put(arr[i], i);
        }

        return new int[] {
                -1,
                -1
        };
    }

    public static boolean isIsomorphic(String r, String s) {
        if (r.length() != s.length()) {
            return false;
        }

        Map<Character, Character> rToS = new HashMap();
        Map<Character, Character> sToR = new HashMap();

        for (int i = 0; i < s.length(); i += 1) {
            char cR = r.charAt(i);
            char cS = s.charAt(i);

            // rToS - a->b
            // sToR - b->a
            if (!rToS.containsKey(cR) && !sToR.containsKey(cS)) {
                rToS.put(cR, cS);
                sToR.put(cS, cR);
            }
        }
    }

    // aaaaddbcaaa mSToT -> a->b,
    // bbbbxxxzbbb mTToS -> b->a
    // abc
    // ab
    // true? false?
    // a
    // b

    public static void main(String[] args) {
        int[] arr = new int[] {
                1,2,3,4,5,2,0
        };
        int[] result = twoSum(arr, 1000);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
