package basics;

import java.util.Scanner;

/**
 * To read two number from the user, add and print the result
 *
 * @author Martti Triksberg
 */

public class InputSum {
    public static void main(String[] args) {
        // To get input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to Sum:");

        System.out.println("Number 1: ");
        int number1 = scanner.nextInt();


        System.out.println("Number 2: ");
        int number2 = scanner.nextInt();
        //  Sum
        System.out.println("Sum is:" + (number1 + number2));
    }
}
