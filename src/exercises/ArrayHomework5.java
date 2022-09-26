package exercises;

/**
 * Array homework5
 * @author Martti Triksberg
 */

public class ArrayHomework5  {


    public static void main(String[] args) {

        //1) Write a Java program to print all odd numbers from an array: [1, 7, 3, 10, 9].

        int[] arr = new int [] {1, 7, 3, 10, 9};

       for(int i=0; i<arr.length; i++) {
           if (arr[i] % 2 != 0)
               System.out.println(arr[i]);
       }

       //2) Write a Java program to find the number of even and odd numbers from an array of integers: [1, 7, 3, 10, 9].

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0)
            {
                System.out.println(arr[i] + " is even number");
            }
            else
                System.out.println(arr[i] + " is odd number");
        }


        //3) Write a Java program to find the duplicate values of an array of integer values: [1, 7, 3, 7, 10, 1, 9].

        int[] arr2 = new int [] {1, 7, 3, 7, 10, 1, 9};
            int result = arr2[0];

                for (int i=0; i<arr2.length; i++) {
                        for (result=0; result<arr2.length; result++) {
                                if (arr2[i] == result) {
                                    System.out.println(arr2[i] + " is duplicate number");
                                }
                            }
                        }







    }
}
