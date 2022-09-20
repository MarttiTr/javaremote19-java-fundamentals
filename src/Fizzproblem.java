/**
 * Fizz Buzz problem
 * @author Martti, Mattias
 */


public class Fizzproblem {
    public static void main(String[] args) {

        int i = 3;
        int j = 5;
        int x = 30;

        if(x % 3 == 0) {
            System.out.println("Fizz");
            if (x % 5 == 0)
                System.out.println("Buzz");
            if (x % 3 == 0 && x % 5 == 0)
            System.out.println("FizzBuzz");


        }
    }
}
