package org.example;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Black",200,"hatchback",200);
        System.out.println(car);
    }

}

class Vehicle{
    private String vehicleType;
    private Integer topSpeed;

    public Vehicle(String vehicleType, Integer topSpeed) {
        this.vehicleType = vehicleType;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }

    public void start(){
        System.out.println("vehicle started....");
    }



}



class Car{
    private String color;
    private Integer weight;
    private final Vehicle vehicle;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", vehicle=" + vehicle +
                '}';
    }

    public Car(String color, Integer weight, String vehicleType, Integer topSpeed) {
        this.vehicle = new Vehicle(vehicleType,topSpeed);
        this.color=color;
        this.weight=weight;
    }


    public void run(){
        System.out.println("car running");
    }



}




/*

// no association *** *** *** *** *** *** *** *** *** *** *** ***

public class Main {
    public static void main(String[] args) {
       Vehicle vehicle = new Vehicle();
       Car car = new Car();
       vehicle.start();
       car.run();
    }
}

class Vehicle{
    private String vehicleType;
    private Integer topSpeed;

    public void start(){
        System.out.println("vehicle starting");
    }

 */

// Association *** *** *** *** *** *** *** *** *** *** *** ***
/*

public class Main {
    public static void main(String[] args) {
       Vehicle vehicle = new Vehicle();
       Car car = new Car();
       vehicle.start(car);

    }
}

class Vehicle{
    private String vehicleType;
    private Integer topSpeed;

    public void start(Car car){
        car.run();
    }

}



class Car{
    private String color;
    private Integer weight;

    public void run(){
        System.out.println("car running");
    }

}


 */


// Composition *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***

/*

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Black",200,"hatchback",200);
    }
}

class Vehicle{
    private String vehicleType;
    private Integer topSpeed;

    public Vehicle(String vehicleType, Integer topSpeed) {
        this.vehicleType = vehicleType;
        this.topSpeed = topSpeed;
    }

    public void start(){
        System.out.println("vehicle started....");
    }

}



class Car{
    private String color;
    private Integer weight;
    private Vehicle vehicle;

    public Car(String color,Integer weight, String vehicleType, Integer topSpeed) {
        this.vehicle = new Vehicle(vehicleType,topSpeed);
        this.color=color;
        this.weight=weight;
    }

    public void run(){
        System.out.println("car running");
    }

}




 */