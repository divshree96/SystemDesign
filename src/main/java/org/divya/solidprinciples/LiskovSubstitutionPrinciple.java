package org.divya.solidprinciples;


import java.util.ArrayList;
import java.util.List;

/*
If class B is a subclass of class A, then we should be able to replace the object
of A with B without breaking the behaviour of the program

Subclass should extend the capability of parent class and not narrow it down
*/
public class LiskovSubstitutionPrinciple {

//    interface Bike {
//        void turnOnEngine();
//        void accelerate();
//    }
//
//    class Motorcycle implements Bike {
//
//        boolean isEngineOn;
//        int speed;
//
//        @Override
//        public void turnOnEngine() {
//            isEngineOn = true;
//        }
//
//        @Override
//        public void accelerate() {
//            speed = speed+10;
//        }
//    }
//
//    class Bicycle implements Bike {
//
//        //here the behaviour is breaking
//        @Override
//        public void turnOnEngine() {
//            throw new AssertionError("there is no Engine");
//        }
//
//        @Override
//        public void accelerate() {
//            //do something
//        }
//    }

    /* This is wrong example
    public class Vehicle {
        public Integer getNumberOfWheels() {
            return 2;
        }

        public Boolean hasEngine() {
            return true;
        }
    }

    public class Motorcycle extends Vehicle {}

    public class Car extends Vehicle {
        public Integer getNumberOfWheels() {
            return 4;
        }
    }

    public class Bicycle extends Vehicle {
        public Boolean hasEngine() {
            return null; // this will break the code (will throw NPE in main method)
        }
    }

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Motorcycle());
        list.add(new Car());
        list.add(new Bicycle());

        for(Vehicle vehicle : list) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }

     */

    //how to fix this

    public class Vehicle {
        public Integer getNumberOfWheels() { // only generic function
            return 2;
        }
    }

    public class EngineVehicle {
        public Boolean hasEngine() {
            return true;
        }
    }

    public class Motorcycle extends EngineVehicle {
    }

    public class Car extends EngineVehicle {
        public Integer getNumberOfWheels() {
            return 4;
        }
    }

    public class Bicycle extends Vehicle {
    }

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Motorcycle());
        list.add(new Car());
        list.add(new Bicycle());

        for(Vehicle vehicle : list) {
            System.out.println(vehicle.getNumberOfWheels().toString()); // this will work
            System.out.println(vehicle.hasEngine()); // this will throw error at compile time only
        }

        List<EngineVehicle> list1 = new ArrayList<>();
        list1.add(new Motorcycle());
        list1.add(new Car());
        list1.add(new Bicycle()); // this will throw error at compile time only

        for(EngineVehicle vehicle : list1) {
            System.out.println(vehicle.hasEngine());
        }
    }

}
