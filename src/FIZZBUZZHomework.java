/**
 * Fizzbuzz homework
 * @author Martti Triksberg
 */

public class FIZZBUZZHomework {
    public static void main(String[] args) {

        /*
        int j = 15;
        if (j % 3 == 0 && j % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if(j % 5 == 0) {
            System.out.println("BUZZ");
        } else if (j % 3 == 0) {
            System.out.println("FIZZ");
        }
         */

        //Homework, one line solution for FizzBuzz
        int j = 15;
        System.out.println((j % 3 == 0 && j % 5 == 0 ? "FIZZBUZZ" : " " ) || (j % 3 == 0 ? "FIZZ" : " " ) || (j % 5 == 0 ? "Buzz" : " " ));

        /*If i run the code:
          ":17:75
            java: bad operand types for binary operator '||'
            first type:  java.lang.String
            second type: java.lang.String"
         */
    }
}
