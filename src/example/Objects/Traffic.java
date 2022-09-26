package example.Objects;

/**
 * Default Constructor example
 *
 * @author Karl Sirkas
 */
public class Traffic {
    public static void main(String[] args) {
        Car car=new Car();
        car.name="Audi Q7"; //garbage Collection

        Car car2=new Car();
        car2.name="Bmw x2";

        Car car3=new Car();
        car3.name="Ford mustang";

        car.name="Toyota RAV4";

        Car car4= car2;

        Car car5= car3;



        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);
        System.out.println(car5.name);

        System.gc();
    }

}
