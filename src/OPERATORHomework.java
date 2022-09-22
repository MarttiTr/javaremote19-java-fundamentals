/**
 * Operator Homework
 * @author Martti Triksberg
 */

public class OPERATORHomework {

    public static void main(String[] args) {

        float i = 9.0f;
        float o = 18.0f;
        float k = 5.0f;
        float s = 7.0f;

        double y = i + (o / k) + k - (-i) * (++s);

        System.out.println(y);


        // 1) (-i) = -9
        // 2) (++s) = 1 + 7 = 8
        // 3) (o / k) = 18 / 5 = 3.6
        // 4) -(-i) * (++s) = 9 * 8 = 72
        // 5) i + 3.6 = 9 + 3.6 = 12.6
        // 6) 12.6 + 5 = 17.6
        // 7) 17.6 + 72 = 89.6


    }
}
