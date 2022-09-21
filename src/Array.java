public class Array {
    public static void main(String[] args) {



        int a = 9;

        //Singel-dimensional array
        //NOTE: Array index always starts with 0. Array´s can contain duplicate elements.
        //int array
        int[] b = {9, 27, 40, 20, 839, 11000, 27 , 40}; // This is array, can use only same type of variable!

        //String array                         // Arrays can be used with any datatypes.
        String[] fruits = {"apple", "orange", "mango", "peach", "banana"};   // 0 - apple, 1 - orange, 2 - mango

        System.out.println(fruits[0]);
        System.out.println(b[4]);
        System.out.println(fruits[3]);  // Array index out of bound
        System.out.println(b.length);   // Return the number of values in the array
        System.out.println(b.length - 1); // Returns array´s last index

        //Defined array
        int[] veggies = new int[5]; //New object

        veggies[3] = 65;
        veggies[4] = 45;

        System.out.println(veggies[2]);

        String[] food = new String[] {"cake", "orange", "rice"};

        int[] ageArray = new int[3];



        //Processing array (loops are used)
        //Conventional for
        for(int i=0; i < fruits.length; i++) {    // i = index of array
            System.out.println(fruits[i]);
        }
        //Enhanced for-loop
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Find the largest element in the array
        //Brute-force method
        int result = b[0]; //9

        for(int x: b) {
            if (x > result) {
                result = x;
            }
        }
        System.out.println(result);


        //homework 4
        //find the smalllest in the array [b]
        }
    }
