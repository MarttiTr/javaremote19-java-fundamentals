package examples;

public class ArrayHomeworks {
    public static void main(String[] args) {

        //homework 4A
        //find the smalllest in the array [b]
        //int[] b = {9, 27, 40, 20, 839, 11000, 27 , 40};

        int[] b = {9, 27, 40, 20, 839, 11000, 27 , 40};

        int result2 = b[0];

        for(int y: b) {
            if (y < result2) {
                result2 = y;
                System.out.println(y);
            }
        }


        //homework 4B

        int[] c = {1, 7, 3, 10, 9};
        int result3 = c[4];

    }
}
