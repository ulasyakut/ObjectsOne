package object1;


import java.util.logging.Logger;

public class Main {


    public static void main(String... args) {
        //Logger logger=Logger.getLogger(Main.class.getName());
        //logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30, 182);
        Person person2 = new Person("Mike", 36, 176);
        System.out.println(person1.height);
        System.out.println(person2.name);


        Car car1 = new Car("Honda","Accord",2024,6000);
        Car car2 = new Car("Toyota","Camry",2020,55000);
        System.out.println(car2.getMake());
        System.out.println(car1.getMileage());



    }


}


