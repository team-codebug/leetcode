package com.anujbrandy;

import java.util.*;

class Student {
    int age;
    int percent;
    String address;

    public Student(int age, int percent, String address) {
        this.age = age;
        this.percent = percent;
        this.address = address;
    }
}

public class Main {

    public static void main(String[] args) {
        /**
         * {
         *  "Anuj": {
         *      age: 27,
         *      percent: 60,
         *      address: "Bangalore"
         *  },
         *  "ankit": {
         *      age: 24,
         *      percent: 90,
         *      address: "Delhi"
         *   }
         */
        Map<String, Student> school = new HashMap<>();

        /**
         * {
         *     "name of student1": { age, percent, address},
         *     "name of student2": { age, percent, address }
     *     }
         */
        System.out.println("----------");
        System.out.println("School Data");
        school.put("Anuj", new Student(27, 60, "Bangalore"));
        school.put("Ankit", new Student(24, 90, "Delhi"));
        school.put("Sachin", new Student(20, 95, "California"));

        for (Map.Entry<String, Student> entry: school.entrySet()) {
            Student student = entry.getValue();
            System.out.println("Name: " + entry.getKey() + " Age: " + student.age + " Percent: " +
                    student.percent + " Address: " + student.address);
        }

        //school.get("Anuj") -> Student { age, percent, address }
//        school.get("Anuj").age = 30;
        Student anujStudent = school.get("Anuj");



        school.put("Anuj", new Student(anujStudent.age + 5, anujStudent.percent + 20, "Canada"));
        school.put("Anil", new Student(24, 94, "Chandigarh"));



        System.out.println("----------");
        // [ Lakh ]
        //
        System.out.println("After Anuj moved to Canada.");
        for (Map.Entry<String, Student> entry: school.entrySet()) {
            Student student = entry.getValue();
            System.out.println("Name: " + entry.getKey() + " Age: " + student.age + " Percent: " +
                    student.percent + " Address: " + student.address);
        }

        System.out.println("----------");



        /**
         * {
         *  "anuj": {
         *      age: 27,
         *      percent: 60,
         *      address: "Bangalore"
         *  },
         *  "ankit": {
         *      age: 24,
         *      percent: 90,
         *      address: "Delhi"
         *   }
         */

        System.out.println("Percent of Ankit: " + school.get("Ankit").percent);

        System.out.println(school.get("Anuj").address);
        // Bangalore

        /**
         * {
         *     "anuj": 26,
         *     "ankit": 28,
         *     "ankush": 30
         * }
         */

        // initialising a hashmap
        Map<String, Integer> newtonSchool = new HashMap<String, Integer>();
        /**
         * { }
         */

        newtonSchool.put("anuj", 26);
        newtonSchool.put("ankit", 28);
        newtonSchool.put("ankush", 30);
        /**
         * {
         *     "anuj": 26,
         *     "ankit": 28,
         *     "ankush": 30
         * }
         */

        System.out.println("Age of Ankit: " + newtonSchool.get("ankit"));

        // remove
        newtonSchool.remove("anuj");
        /**
         * {
         *     "ankit": 28,
         *     "ankush": 30
         * }
         */

        // checking if the "anuj" is in the map or nor

        /**
         * {
         *     "ankit": 28,
         *     "ankush": 30
         * }
         */
        if (newtonSchool.containsKey("anuj")) {
            System.out.println("Anuj is there in the map.");
        } else {
            System.out.println("Anuj is not there in the map.");
        }

        // print all the values of the map
        /**
         * {
         *     "anuj"(key): 26(value), 
         *     "ankit": 28,
         *     "ankush": 30
         * }
         */
        
        // Entry -> <Key, Value> in the map
        // Map -> Lots of Entries
        for (Map.Entry<String, Integer> entry : newtonSchool.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
        
        // Integer, Integer
        // Height: No. of people with that height
//        for (Map.Entry<Integer, Integer> entry : newtonSchool.entrySet()) {
//            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
//        }
        /**
         * {
         *     "anuj": {
         *         "age": 30,
         *         "percent": 60,
         *     },
         *     "ankit": {
         *          "age": 30,
         *          "percent": 60,
         *     }
         * }
         * 
         */
        // Anil
        // school.get("Anil")
        System.out.println("Anil data: ");
        System.out.println(school.get("Anil").age + " " + school.get("Anil").percent + " "
         + school.get("Anil").address);
    }
}
