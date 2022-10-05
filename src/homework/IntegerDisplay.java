package homework;

import java.util.Scanner;

/**
 * To read a number from user and print the same number like this:
 *
 * Given number 4
 * 4, 44, 444, 4444
 * 5, 55, 555, 5555, 55555
 * and so on....
 *
 * @author Martti Triksberg
 */

public class IntegerDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++) {  // To print number of times/lines
            for(int j = 1; j <= i; j++) {   // To print the number of digits
                System.out.print(number);
            }

            System.out.println();
        }

        for(int i = number; i >= 1; i--) {  // To print number of times/lines
            for(int j = i; j >= 1; j--) {   // To print the number of digits
                System.out.print(number);
            }

            System.out.println();
        }
    }
}
