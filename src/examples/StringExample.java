package examples;

/**
 * Examples of String
 *
 * @author Martti Triksberg
 */

public class StringExample {

    public static void main(String[] args) {
        String firstName = "Martti";
        String lastName = "Triksberg";
        String fullName = firstName + lastName;  //Option 1

        System.out.println(fullName);

        fullName = firstName.concat(lastName); //Option 2 //String has .concat

        String city = "Tallinn";

        String ageString = "My age is : " + 3 + ". I live in " + city + ". My name is: " + fullName;
        System.out.println(ageString);

        String ageStringFormatted = String.format("My age is : %d. I live in %s. My name is: %s", 3, city, fullName); // %d - integer , %s - string
        System.out.println(ageStringFormatted);



        StringBuilder str1 = new StringBuilder("Hello!");  //Stringbuilder has .append
        StringBuilder str2 = str1.append("World");          //Append will automatically assign the value since its Stringbuilder
        System.out.println(str2);                           //Use stringbuilder if there are loops in code, since if not using it and using simply string it would take up much more memory
        System.out.println(str1);


        String var1 = "Red";                    //Concat wont add it to previous since its normal string
        var1.concat("Yellow");              // If i add  var1 = var1.concat("yellow"); then it prints Redyellow, otherwise not.
        String var2 = "Blue";                   //Use .concat when i dont have any loops in the code, since it doesnt take up much memory then.
        System.out.println(var1);
        System.out.println(var2);


        //Equality
        //There are 2 types of equality methods: == and string.equals
        // == - compares Memory references and value
        // string.equals - Compares only the value

        String s1 = "Sibul"; //String pool
        String s2 = "Sibul"; //String pool
        String s3 = new String("Sibul"); //Heap //237462837782346 - memory reference example
        String s4 = new String("Sibul"); //Heap //237436267627677

        System.out.println(s1 == s3);  //False, since s1 is stored in String pool, s3 is stored in heap memory.
        System.out.println(s1 == s2); //True, since both are stored in String pool.
        System.out.println(s3 == s4); //False since value is same, but memory reference isnt same.

        System.out.println(s1.equals(s3)); //True since s1.eguals(string.equals), compares only value.


        Float f1 = new Float(4.5f);
        Float f2;
    }
}
