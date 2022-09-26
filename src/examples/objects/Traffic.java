package examples.objects;

/**
 * Default Constructor example
 *
 * @author Martti Triksberg
 */
public class Traffic {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Audi Q7";  // goes to garbage collection

        Car car2 = new Car();
        car2.name = "BMW X2";

        Car car3 = new Car();
        car3.name = "Ford Mustang";

        car.name = "Toyota RAV4";

        Car car4 = new Car(); // Or - Car car4 = car2 , sest eelnevalt olemas et Car car2 = new Car()

        car4 = car2;


        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);

        System.gc(); // Frees up the garbage collection values. Nt eelnevalt car.name = "Audi Q7" , kustutab ära, kuna uus value on sellele hiljem antud.
    }
}
