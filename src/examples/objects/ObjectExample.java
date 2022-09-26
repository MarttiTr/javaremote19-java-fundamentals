package examples.objects;

/**
 * Object Example
 *
 * @author Martti Triksberg
 */

public class ObjectExample {
    public String name;

    public int a;

    // Non-parameterized constructor or Normal constructor
    public ObjectExample() {
        System.out.println("Constructing Object Example");
        name = "Martti Triksberg";

        }
        // Parameterized Constructor
        public ObjectExample(int age, String name)  {
        System.out.println(age);
            System.out.println(name);
    }


    }
