package basics;

import java.util.Scanner;

/**
 * To calculate area and perimeter of a circle
 * Area = Pi radius sq.
 * @author Martti Triksberg
 */

public class Perimeter {
    public static void main(String[] args) {
        final float pi = 3.14f;                 //Final for constant values(wont be cnanged). If it would be changeable then is simply int.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        float radius = scanner.nextFloat();

        //Area
        float area = pi * (radius * radius);

        //Perimeter(Circumference)
        float perimeter = 2 * pi * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);



    }
}
