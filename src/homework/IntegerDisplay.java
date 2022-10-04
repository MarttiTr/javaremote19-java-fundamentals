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

        System.out.println("Write a 1 digit number, which is not 0");

        int Number = scanner.nextInt();

        System.out.println("Number is: " + Number + ", " + Integer.parseInt(Number+""+Number));

    }
}
