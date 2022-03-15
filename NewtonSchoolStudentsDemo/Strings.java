package com.anujbrandy;

import java.util.Locale;

public class StringDemo {
    // s1 < s2 ? -ve value
    // s1 == s2 ? 0
    // s1 > s2 ? +ve value

    // App, Apple
    public static int stringCompare(String s1, String s2) {
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i += 1) {
            // 3, 5
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            } else {
                // 'a' -> 97 'b' -> 98...
                int a = s1.charAt(i);
                int b = s2.charAt(i);
                return a - b;
            }
        }

        // App, Apple
        return s1.length() - s2.length();
    }
    public static void main(String[] args) {
        String s = "Hello";
                  //01234
        System.out.println(s.charAt(2));
        // s.charAt(index) -> character
        System.out.println(s);
        System.out.println(s.concat(" World"));
        System.out.println(s);
        s = s.concat(" World");
        System.out.println(s);
        // s -> Hello
        // s.concat(" World") -> Hello World
        // s = s.concat(" World"); -> s -> Hello World
        System.out.println(s.length());

        System.out.println(s.replace('l', 'w'));
        System.out.println(s);
        // Hewwo Worwd

        // Hello World
        System.out.println(s.substring(3));
        // lo World
        System.out.println(s.substring(4,7));
        // o W
        // ' ' -> some numeric value -> stored in memory
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.contains("llo"));
        System.out.println(String.join("|", "Anuj", "Kumar"));
        System.out.println(String.join(",", "M", "S", "E"));
        // M,S,E
        // Anuj|Kumar

        String sNew = "A,B,C";
        // ..
        // +91873897328
        // whether it is an Indian no. or not?
        // regex -> it should start with +91 and it should have 10 digits after +91

        String[] sArr = sNew.split(",");
        System.out.println(sArr[1]);
        // ["A", "B", "C"]
        for (int i = 0; i < sArr.length; i += 1) {
            System.out.println(sArr[i]);
        }

        System.out.println(s.startsWith("Hello"));
        // true

        System.out.println(s.endsWith("World"));
        // true

        // data not in string format -> String
        // String -> some other data type
        int p = 100;
        String pS = String.valueOf(p); // pS -> "100"
        System.out.println(pS);

        int pI = Integer.parseInt(pS); // -> "100" -> pI - 100
        System.out.println(pI); // 100

        // trim
        // "     lots of spaces    "
        String lotsOfSpaces = "     lots of spaces    ";
        System.out.println(lotsOfSpaces.trim());

        // charAt - done
        // indexOf
        String test = "India is great!";
        System.out.println(test.indexOf("i", 4));
        System.out.println(test.lastIndexOf("i", 4));

        // compare if two strings are equal or not
        // dictionary - words are sorted... lexicographic order
        // A, B...
        // Apple, App? -> App, Apple
        String sC1 = "Apple";
        String sC2 = "App";

        System.out.println(sC1.compareTo(sC2));

        // "HelloWorld"
        StringBuilder sB = new StringBuilder();
        // ""
        sB.append("Hello");
        // "Hello"
        sB.append(" Wo rl d");
        // "HelloWorld"
        System.out.println(sB);


        String test1 = "Hello";

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i += 1) {
            test1 = test1 + "Hello" + i;
        }

        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        StringBuilder test2 = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i += 1) {
            test2.append("Hello" + i);
        }

        System.out.println(System.currentTimeMillis() - start);

        String temp1 = "TEST";
        String temp2 = "TEST";

        System.out.println(temp1 == temp2);

        temp1 = new String("TEST");
        temp2 = new String("TEST");

        System.out.println(temp1 == temp2);

        System.out.println(temp1.equals(temp2));

        // == with a literal (whether they are referencing to the same thing)
        // == with a new
        // .equals (it just checks whether the contents in the memory
        // are same or not)
    }
}
