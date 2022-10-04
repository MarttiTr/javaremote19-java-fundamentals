package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * To reverse a given array
 *
 * @author Martti Triksberg
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();

        System.out.println("Enter array elements one after an other:");

        int[] arr = new int[arrLength];
        int[] reversedArr = new int[arrLength];

        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Input array is: " + Arrays.toString(arr));   //Array.to string converdib array stringiks.

        int j = 0;

        for (int i = arrLength - 1; i >= 0; i--) {
            reversedArr[j] = arr[i]; // 0 = 4
            j++;
        }

        System.out.println("Reverse array is: " + Arrays.toString(reversedArr));
    }
}
