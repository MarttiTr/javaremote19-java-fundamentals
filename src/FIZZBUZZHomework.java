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
        int j = 0;
        j++;
        System.out.println(((j % 3 == 0) && (j % 5 == 0) ? "FIZZBUZZ" : "" ) || (j % 3 == 0 ? "FIZZ" : "" ) || ((j % 5 == 0) ? "Buzz" : "" ));

    }
}
