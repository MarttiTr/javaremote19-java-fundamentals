/**
 *
 * @author Martti Triksberg
 */
public class Operator {

    public static void main(String[] args) {

        //unary operators (operator with one variable)
        //post increment
        int i = 0;
        System.out.println(i);
        System.out.println(i++); // i=0, (increment here but not used)
        i++; // 1+1 (incremented value plus another increment)
        System.out.println(i);

        // post-decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        // pre-decrement
        int j = 10;
        System.out.println(j);
        System.out.println(--j);

        //Sulud annavad prioriteedi
        int x = i + (-j); // x = i - j , 2 - 9 = -7
        System.out.println(x);

        //binary operators (operator with 2 variables)
        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b; //Korrutust vaatan enne
        System.out.println(d);

        float z = i * a + (c / b) - (-j) % x; //Esimesena (-j), sest see on unary operator, unary operator alati enne binary operatoryt
        System.out.println(z);


        int divide = 40 / 5; // Quotient value . Siis võrdub 8 . (võtab täpse value) 7
        System.out.println(divide);

        int module = 40 % 5; // Reminder value , Siis võrdub 0 , kui 40 % 6 = 4 (4onjääk!)
        System.out.println(module);

        //comparison operators(==, !=, >, <, <=)

        boolean result = divide == module; // ==(võrdub) ,aga divide ei võrdu module valuega(8=5), seega on false
        System.out.println(result);

        boolean result2 = divide != module; //divide ei võrdu moduliga !=(not equal)
        System.out.println(result2);

        boolean lessCheck = divide < module; // 8 < 0
        System.out.println(lessCheck);

        boolean greaterCheck = divide > module; // 8 > 0
        System.out.println(greaterCheck);

        //less than or equals
        boolean lessEquals = divide <= module;
        System.out.println(lessEquals);

        /* logical operators (&&,||) - and , or      kontrollib kas on loogiliselt korrektne &&(JA) ||(VÕI)!!!

            true && false = false
            false && true = false
            false && false = false
            true && true = true
         */

        boolean andCheck = (8 < 9) && (10 > 4); //annab vastuse true, sest 8 on väiksem kui 9 ja 10 suurem kui 4
        System.out.println(andCheck);

        /*
            true || true = true
            false || false = false
            true || false = true
            false || true = true
         */

        boolean orCheck = (8 < 9) || (10 > 4);
        System.out.println(orCheck);

        /* xAnd, xOR
        0 = 00000000;
        1 = 00000001;
        2 = 00000010;
        3 = 00000011;
        4 = 00000100;
        5 = 00000101;
        6 = 00000110;
        7 = 00000111;
        8 = 00001000;
        9 = 00001001;
        10 = 00001010;
        11 = 00001011;
        12 = 00001100;

        0 = false
        1 = true

        true ^ false = true
        false ^ true = true
        true ^ true = false
        false ^ false =
        */
        float expo = 12 ^ 25; //  12=00001100, 25=00011001                      Ei kasutata tihti, väga harva = 3.0

        System.out.println(expo);

        //Assignment operators
        x = x + 1; // both are same
        x += 1; // mõlemad on õiged

        x = x + y; //saab ka korrutamist või jagamist samamoodi kirjutada
        x += y;


        //ternary operators (?, :)- you work with 3 variables
        String ternary = (x > y) ? "Cat" : "Dog"; //Tähendab et false on, oleks cat printed siis oleks true
        System.out.println(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        //Ainult sama andmetüüpi saab võrrelda, nt kui boolean siis ainult booleaniga, kui string siis ainult stringiga

        boolean checkNumber = 9 == 9.002312312; // int == float, on võimalik, aga ainult numbritega.
        System.out.println(checkNumber);
    }
}
