package examples;

/**
 * Examples of primitive and non-primitive datatypes
 *
 * @author Martti Triksberg
 */

public class DataType {
    //Numbers
    //Primitive datatypes

    byte f = 111;
    short shortNumber = -32000;
    int a = 1;
    long longNumber = 18298189891289812L;


    float decimalNumber = 2.45f;
    double doubleNumber = 3.456d;

    float result = decimalNumber + a; // Int cant work with a decimal nr

    double result2 = doubleNumber + a; // Double can be working with int nr aswell.

    //character
    char alpha = 'f';

    //True/false
    boolean hadLunch = true;  //had lunch? // Boolean default value is false.
    boolean isHoliday = false;

    int h; //0

    float x; //0.00f

    char animal; //''

    boolean isClassTomorrow; //false
    
    
    //Non-primitive datatypes:
    
    String word = "I am a developer!";
    
    Character random = 't';
    
    Integer number = 5;

    Float numberSecond = 2.45F;
    
    Integer randomNUmber; //null

    //Multideclaration

    int numberOne, numberTwo, numberThree;
    String fruit = "apple", vegetanle = "pumpkin";


    private static String CAR = "Toyota"; //If private cant be used outside of this class.

    public static String FOOD = "Cake";  //Same string can be used in other classes aswell.

    public static void main(String[] args) {
        int k = 0;
        Integer y = null;

        System.out.println(k);
        System.out.println(y);


        //Variable name can start with _, $ or letter

        String _color = "black";

        int $hexaNumber = 0x2A;

        float exam12_mark = 1.332f;

        String className = "sda";

        System.out.println(CAR);
        System.out.println(FOOD);

        //Instance variables, class variables and local variables

    }
    

}
