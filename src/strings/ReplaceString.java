package strings;

import java.util.Scanner;

/**
 * To write a program to replace a string
 *
 * @author Martti Triksberg
 */
public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        boolean isMatching = false;
        String source = null;

        while(!isMatching) {
        System.out.println("Which string to replace?");
        source = scanner.nextLine();


        /*     //Check case-sensitive
        if(s.contains(source)) {
            isMatching = true;
        } else {
            System.out.println("String not found! Enter again.");
            }
        */

        //Check non-case sensitive
            String[] sArr = s.split(" ");

        for(String word: sArr) {
            if(word.equalsIgnoreCase(source)) {
                isMatching = true;
                break;
                }
            }
        if(!isMatching) {
            System.out.println("string not found! Enter again!");
            }
        }
        System.out.println("Enter the replacement string:");
        String destination = scanner.nextLine();

        String result = s.replace(source, destination);   // Kui tahan ainult ühte stringi vahetada

        //String result = s.replaceAll(source, destination);  // Kui mitu tk on, siis vahetab kõik ära.
        System.out.println(result);
    }
}
