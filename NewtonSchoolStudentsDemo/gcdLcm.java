package com.anujbrandy;

import java.util.*;

public class Main {
    public static int gcd1(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a == b) {
            return a;
        }

        if (a > b) {
            return gcd1(a - b, b);
        }

        return gcd1(a, b - a);
    }

    public static int gcd2(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcd2(b % a, a);
    }

    public static int lcm(int a, int b) {
        int prodAB = a * b;
        int gcdAB = gcd1(a, b);
        int lcmAB = prodAB / gcdAB;

        return lcmAB;
    }

    public static void main(String[] args) {
        System.out.println("----------GCD using the subtraction approach---------");
        System.out.println(gcd1(20, 30)); // 10
        System.out.println(gcd1(39, 26)); // 13

        System.out.println("----------GCD using the modulo approach---------");
        System.out.println(gcd2(20, 30)); // 10
        System.out.println(gcd2(39, 26)); // 13

        System.out.println("----------LCM---------");
        System.out.println(lcm(20, 30)); // 60
        System.out.println(lcm(39, 26)); // 78

    }
}
