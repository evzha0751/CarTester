
package pkg161013.cartester;


public class CarTester {

    public static void main(String[] args) {
    Car car1 = new Car("Audi","A6",2017,72950,"Black",1);
    Car car2 = new Car("Audi","RS",2017,118300);
    Car car3 = new Car();

    //Print the details of each dog
    System.out.println(car1.toString());
    System.out.println("--------------------------");

    System.out.println(car2.toString());
    System.out.println("--------------------------");

    //toString() is called by default, no need to write it!
    System.out.println(car3);
    System.out.println("--------------------------");

    //dog1 barks friendly, dog2 barks angry
    car1.sound1();
    car2.sound2();

    }
    
}
