package arrays;

import java.util.Arrays;
import java.util.List;

/**
 *Crete two arrays:
 * gasolineCars
 * electricCars
 *
 * Join the array
 *
 * result would be allCars
 *
 * @author Martti Triksberg
 */

public class ConcatArrays {
    public static void main(String[] args) {
        String[] gasolineCars = {"Passat B8", "Audi S6", "Mercedes GLS", "Bmw 735i"};
        String[] electricCars = {"Tesla Model X", "Nissan Leaf", "Volwswagen UP", "Ford Mustang"};
        List<String[]> allCars = Arrays.asList(gasolineCars, electricCars);

        String[] allCars2 = new String[gasolineCars.length + electricCars.length];

        for (int i = 0; i < gasolineCars.length; i++) {
            allCars2[i] = gasolineCars[i];
        }

        for (int i = 0; i < electricCars.length; i++) {
            allCars2[i + gasolineCars.length] = electricCars[i];
        }
        System.out.println(Arrays.toString(allCars2));
    }
}
