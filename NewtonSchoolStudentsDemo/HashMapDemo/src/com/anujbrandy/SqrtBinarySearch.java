/**
 *

 Interview - 45 minutes
 2 easy to medium level questions

 1 easy and a hard variation of it

 2-3 minutes - you should give an introduction about yourself
 in a very brief and concise manner

 Sometimes, interviewer finds an interesting proj (in your resume)
 and asks one or two questions on that

 5 minutes have completed

 40 minutes

 I have given the question to the other person
 the first thing he has to do is to able to come up with a brute force solution in 2 minutes
 he need not code it
 he should be able to explain it in paper or something like whiteboard
 brute force? sqrt n -> /n time complexity
 he will try to give you a very basic hint if you are not able to figure out the optimal solution to the problem?
 goal - solve as many things as possible
 you have taken 15 minutes to tell about yourself...
 it's a red flag...
 30 minutes?
 5 minutes complete all the formal things
 40 minutes to complete two questions
 2 minutes - come up with some solution
 some solution - later we try to optimise it

 20 minutes for first question
 18 minutes - code the brute force solution
 he will see that you know basic programming skills
 just stop or black out - it's a big red flag... it gives the intuition to interviewers that you haven't practiced enough...
 3 minutes --- you should be able to code it... and run through a few examples to show how your code works.
 discuss the time and space complexity...
 implement a optimise solution... come up with a optimise solution...
 you will discuss the approach... and if you didn't get it... he will give you a hint... which won't be very straight...20 minutes to the first problem...
 if you solve it early... there are brownie points... it implies that you have practiced many times and have seen these problems earlier as well...

 45
 5 - 40
 20 minutes - optimised approach, he may or may not ask you to implement it... you are able to discuss the optimised approach, and have implemented the brute force approach...(10-15 minutes)
 25-30 minutes
 1 round
 you will have to come up with questions for the interviwer
 you should ask some questions about the company or in general something that makes sense during the interview... and not cross any boundaries...
 red flag...

 1 question
 - clarify the question as much as possible
 - solved many problems earlier. Then it boils down to just the input and output things...
 - think about the range of values that the input can take
 - think about the edge cases
 - boolean fn(int[] arr, int target)
 */
package com.anujbrandy;

public class SqrtBinarySearch {
    public static int sqrtFn(int x) {
        // 1? 2? 3?
        if (x <= 3) {
            return 1;
        }

        int left = 2,
                right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long num = (long)mid * mid;

            if (num == x) {
                return mid;
            } else if (num > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
    public static void main(String[] args) {
        System.out.println(sqrtFn(17));
    }
}
