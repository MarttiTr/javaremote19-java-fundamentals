package strings;

import java.util.Scanner;

/**
 * To write a Java program to change string to upper case
 *
 * @author Martti Triksberg
 */
public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());  // Saab kasutada ka .toLowerCase :), saab kasutada ka length(annab stringi pikkuse)
    }
}
