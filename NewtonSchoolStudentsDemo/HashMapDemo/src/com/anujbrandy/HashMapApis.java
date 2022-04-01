package com.anujbrandy;

import java.util.*;

public class HashMapApis {
    public static void main(String[] args) {
        // string - apple
        // Map - collection of key value pairs
        // apple -> { a: 1, p: 2, l: 1, e: 1}
        String str = "apple";

        Map<Character, Integer> countChars = new HashMap();

        // iterate through a string
        // banana
        // 012345
        //  i
        /*
            {
             b: 1,
             a: 1
            }
         */
        for (int i = 0; i < str.length(); i += 1) {
            char curChar = str.charAt(i);
            if (!countChars.containsKey(curChar)) {
                countChars.put(curChar, 1);
            } else {
                // this case will be reached when the curChar is
                // already there in the map
                int prevValue = countChars.get(curChar);
                countChars.put(curChar, prevValue + 1);
            }
        }

        /*
         "Anuj", "Ankit", "Shweta"
         */
        String[] students = new String[] {
                "Anuj",
                "Ankit",
                "Shweta"
        };
        int[] ages = new int[] {
                26,
                28,
                22
        };
        /*
            {
                "Anuj": 26,
                "Ankit": 28,
                "Shweta": 22
            }
         */
        Map<String, Integer> collegeAgeData = new HashMap();
        /*
        {}
        */

        for (int i = 0; i < students.length; i += 1) {
            collegeAgeData.put(students[i], ages[i]);
        }
        /*
        {
                "Anuj": 26,
                "Ankit": 28,
                "Shweta": 22
            }
         */

        System.out.println(collegeAgeData.get("Ankit"));
        /*
            Write a function that takes the college data and average out the
            sum of all the students...
            If the student is not present in the college, just take the default value of 24
         */
        String[] studentNames = new String[] {
                "Anuj",
                "Ankit",
                "Shweta",
                "Anamika"
        };

        int sumAge = 0;
        for (int i = 0; i < studentNames.length; i += 1) {
            // if the key is there in the map
            // getOrDefault will work similarly as get
            int curAge = collegeAgeData.getOrDefault(studentNames[i], 24);
            System.out.println("Key: " + studentNames[i] + ", age(getOrDefault): " + curAge);
            sumAge += curAge;
        }
        // 26 + 28 + 22 + 24 -> 100
        System.out.println(sumAge);
        // { }
        // put (key1, value1) -> { key1: value1 }
        // put (key1, value2) -> { key1: value2 }
        // { }
        // putIfAbsent(key1, value1) -> { key1: value1 }
        // putIfAbsent(key1, value2) -> { key1: value1 }
        collegeAgeData.put("Aditya", 22);
        System.out.println("Key Aditya is absent: Put: " + collegeAgeData.get("Aditya"));
        collegeAgeData.put("Aditya", 27);
        System.out.println("Key Aditya is present: Put: " + collegeAgeData.get("Aditya"));


        collegeAgeData.putIfAbsent("Ashok", 32);
        System.out.println("Key Ashok is absent: PutIfAbsent: " + collegeAgeData.get("Ashok"));
        collegeAgeData.putIfAbsent("Ashok", 37);
        System.out.println("Key Ashok is present: PutIfAbsent: " + collegeAgeData.get("Ashok"));

        // iterating through a map
        // print all the students and their ages in the map
        // array is a collection of items
        // map is a collection of key, value pairs
        // map has one or more than one key,value pairs
        // iterate through the map collection
        System.out.println("Iterating through the college data: ");
        /*
        {
                "Anuj": 26,
                "Ankit": 28,
                "Shweta": 22,
                "Aditya": 27,
                "Ashok": 32
            }
         */
        // we read in theory about maps
        // we hash and use the key to figure out the bucket where we stored it
        // "Anuj", "Ankit"
        // map.put("Anuj")
        // map.put("Ankit")
        // order could be arbitrary
        // Anuj..., Ankit...
        // put -> Anuj -> computes a hash out of it -> bucket index
        // it puts the pair in the bucket... map is array of buckets
        // a bucket is an array of pairs [[key1, value1], [key2, value2]]...
        // put -> Anuj -> computes a hash out of it -> bucket index
        // stores in the bucket... this hashing that we are doing
        // is random...
        for (Map.Entry<String, Integer> item: collegeAgeData.entrySet()) {
            System.out.println("Name: " + item.getKey() + ", Age: " + item.getValue());
        }

        System.out.println("is empty api: ");
        System.out.println(collegeAgeData.isEmpty());
        System.out.println(collegeAgeData.size()); // 5

        // remove function
        collegeAgeData.remove("Anuj");
        System.out.println("After removing Anuj from " +
                        "the college. Size: " + collegeAgeData.size()); // 4

        collegeAgeData.clear();
        System.out.println(collegeAgeData.size()); // 0
    }
}
