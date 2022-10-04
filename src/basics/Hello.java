package basics;

import java.util.Scanner;

/**
 * To get input from user and print it
 * @author Martti Triksberg
 */

public class Hello {

    public static void main(String[] args) {
        System.out.println("Welcome to my first exercise!");

        //Scanner is used to get an input from user.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Do you live in Tallinn?");
        boolean isLivingInTallinn = scanner.nextBoolean();

        System.out.println("Age is: " + age);
        System.out.println("Am i living in Tallinn:" + isLivingInTallinn);
    }
}
