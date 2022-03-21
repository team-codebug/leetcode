package com.anujbrandy;

public class StringProblems {
    // reverse using stringbuilder
    // T- O(n)
    // S- O(n)
    public static String reverseUsingSB(String s) {
        StringBuilder sB = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i -= 1) {
            sB.append(s.charAt(i));
        }

        return sB.toString();
    }

    // isDivisbleBy3
    // Number is in string format
    // and it can be really large
    public static boolean isDivisibleBy3(String N) {
        int sum = 0;
        // "123"
        for (int i = 0; i < N.length(); i += 1) {
            sum = sum + (N.charAt(i) - '0');
        }

        return sum % 3 == 0;
    }

    public static String compress(String s) {
        int count = 1,
                i = 0;

        StringBuilder sB = new StringBuilder();
        // s -> ab - 2
        // 01
        // s.charAt(2) ->
//        while (...) {
//            while (...) {
//
//            }
//        }
        // aaaaaaaaaaaa....
        // a1000000000
        // aaaabc
        //    i
        // a4
        // ? will the space complexity be constant?
        // analyse the worse case?
        // abcdefabcdefabcdef
        // abcdef
        while (i < s.length()) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count += 1;
            } else {
                sB.append(s.charAt(i));

                if (count > 1) {
                    sB.append(count);
                }

                count = 1;
            }

            i += 1;
        }

        return sB.toString();
    }

    // 1
    // 10B
    public static int flameGame(String s1, String s2) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        // M >>>> 10B
        // N >>>> 5B

        // 5 1 1 0 0 0 0
        // cabaaaa
        for (int i = 0; i < s1.length(); i += 1) {
            counts1[s1.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s2.length(); i += 1) {
            counts2[s2.charAt(i) - 'a'] += 1;
        }

        int sum = 0;
        // 2 - 3 = -1 abs => 1
        // 3 - 2 = 1 abs => 1
        for (int i = 0; i < 26; i += 1) {
            sum += Math.abs(counts1[i] - counts2[i]);
        }

        return sum % 6;
    }
    
    public static String getRelationship(int flameNumber) {
        String str3 = " ";
        switch (flameNumber) {
            case 1:
                str3 = "Friends";
                break;
            case 2:
                str3 = "Love";
                break;
            case 3:
                str3 = "Affection";
                break;
            case 4:
                str3 = "Marriage";
                break;
            case 5:
                str3 = "Enemy";
                break;
            case 0:
                str3 = "Siblings";
                break;
        }
        return str3;
    }

    public static void main(String[] args) {
        System.out.println(reverseUsingSB("anuj"));
        System.out.println(isDivisibleBy3("124"));
        System.out.println(getRelationship(flameGame("saumya", "ansh")));
        System.out.println(compress("aaaaaaabcdddd"));
    }
}
