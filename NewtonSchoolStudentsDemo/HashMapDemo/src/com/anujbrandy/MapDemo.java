package com.anujbrandy;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> college = new HashMap();

        // insert a new key value pair
        college.put("12IT09", "Anuj");

        // 1000
        // for each statement, it takes the key "12IT09"
        // Java takes over
        // A map is an array of buckets.
        // Each bucket(array) has collection of pairs(pair <Key, Value>
        // Smart Hash function -> 12IT09 -> in constant time -> value
        // value -> Bucket Index?
        // lookup? for a bucket is constant time?
        // which bucket it should go to is constant
        // iterating through that bucket? why is this constant?
        // Java again optimises the creation of buckets based on the number
        // of entries
        // 10000 key value, java sees that... and it creates 1000 buckets
        // If Java does all the things optimally, then each bucket will
        // have 10 pairs
        // Search
        // college.get("12IT09");
        // Java takes over
        // f("12IT09") -> same value
        // index of the bucket
        // this bucket lookup is constant
        // that bucket where we went to... there we have to look
        // a bucket is a collection of pairs
        // 10 pairs .. we can linearly(has become so small
        // that it looks constant in real time)... pair.first === 12IT09?
        // return pair.second?

        /**
         * {
         *     "12IT09": "Anuj",
         *
         * }
         */

        System.out.println(college.get("12IT09"));

        college.put("12ME10", "Ankit");
        /**
         * {
         *     "12IT09": "Anuj",
         *     "12ME10": "Ankit"
         * }
         */

        System.out.println(college.size());

        /**
         * {
         *     "12IT09": "Akshay",
         *     "12ME10": "Ankit"
         * }
         */
        college.put("12IT09", "Akshay");
        System.out.println(college.size());

        /**
         * {
         *     "12IT09": "Akshay",
         *     "12ME10": "Ankit",
         *     "12CS08": "Abhishek"
         * }
         */
        college.put("12CS08", "Abhishek");
        System.out.println(college.size());

        /**
         * {
         *     "12ME10": "Ankit",
         *     "12CS08": "Abhishek"
         * }
         */
        college.remove("12IT09");
        System.out.println(college.size());

        /**
         * {
         *     "12IT09": "Anil",
         *     "12ME10": "Ankit",
         *     "12CS08": "Abhishek"
         * }
         */
        college.put("12IT09", "Anil");

        if (college.containsKey("12IT09")) {
            System.out.println("Anil is present in the college");
        } else {
            System.out.println("Anil is not present in the college");
        }

        // Iterate through all the entries in the map
        // get the key value pair...
        /**
         * {
         *     "12IT09": "Anil",
         *     "12ME10": "Ankit",
         *     "12CS08": "Abhishek"
         * }
         */
        for (Map.Entry<String, String> entry: college.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        /**
         * {
         *
         * }
         */

        // clear the hashmap
        college.clear();

        System.out.println(college.size());

        college.put("12CV98", "Kiran");

        if (college.isEmpty()) {
            System.out.println("The college is empty");
        } else {
            System.out.println("The college is not empty");
        }

        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Anuj", 25);


    }
}
