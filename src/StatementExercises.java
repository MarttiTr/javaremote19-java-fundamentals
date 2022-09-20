public class StatementExercises{

    public static void main(String[] args) {
            int i;
            //1) Odd or even Problem
//!!! OPERATORYD VAJA PÄHE ÕPPIDA NT TERNARY JNE
    // Solution 1: Using if-else

            for(i=0; i <= 20; i++) {
            if(i % 2 == 0) {
            System.out.println(i + " is even number");
            } else {
            System.out.println(i + " is odd number");
            }
        }

            // Solution 2: using ternary operator

        for (i = 0; i <= 20; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + " number"); // i is even/odd number
        }


        //2) Leap year problem

        int year = 2022;

        //Solution 1
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        //Solution 2
        System.out.println(year + " is" + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : " not ") + "a leap year");

        //Solution 3- simple!
        if(year % 4 == 0) { // % - nimetatakse module/ks
            System.out.println("This is leap year!");
        } else {
            System.out.println("Not leap year!");
        }

        //3) FIZZBUZZ PROBLEM
        //Solution 1

        int j = 15;
        if (j % 3 == 0 && j % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if(j % 5 == 0) {
            System.out.println("BUZZ");
        } else if (j % 3 == 0) {
            System.out.println("FIZZ");
        }

        //Solution 2
        //Homework, one line solution for FizzBuzz

    }
}
