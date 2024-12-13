package org.divya.solidprinciples;

import javax.sound.midi.Soundbank;

/*
Interface should be such, that client should not implement
unnecessary functions they do not need
 */
public class InterfaceSegmentedPrinciple {

    interface RestaurantEmployee {
        void washDished();
        void serveCustomers();
        void cookFood();
    }

    class Waiter implements RestaurantEmployee {

        public void washDished() {
            //not my job
        }

        public void serveCustomers() {
            //yes and here is my implementation
            System.out.println("Serving the customers");
        }

        public void cookFood() {
            //not my job
        }
    }

    interface WaiterInterface {
        void serveCustomers();
        void takeOrder();
    }

    interface ChefInterface {
        void cookFood();
        void decideMenu();
    }

    class waiter implements WaiterInterface {

        public void serveCustomers() {
            System.out.println("Serving the customers");
        }

        public void takeOrder() {
            System.out.println("Taking the orders");
        }
    }
}








