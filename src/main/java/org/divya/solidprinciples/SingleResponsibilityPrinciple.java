package org.divya.solidprinciples;

/*
A class should have only 1 reason to change
 */
public class SingleResponsibilityPrinciple {
    class Marker {
        String name;
        String color;
        int year;
        int price;


        public Marker(String name, String color, int year, int price) {
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;
        }
    }

    class Invoice {
        private Marker marker;
        private int quantity;


        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        //1st reason to change
        public int calculateTotal() {
            int price = marker.price * this.quantity;
            return price;
        }

        //2nd reason to change
        public void printInvoice() {
            //print the invoice
        }

        //3rd reason to change
        public void saveToDB() {
            //Save the data to DB
        }
    }

    //How to correct this
    class Invoice2 {
        private Marker marker;
        private int quantity;


        public Invoice2(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        //1st reason to change
        public int calculateTotal() {
            int price = marker.price * this.quantity;
            return price;
        }
    }

    class InvoiceDAO {
        Invoice invoice;

        public InvoiceDAO(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            //Save the data to DB
        }
    }

    class InvoicePrinter {
        Invoice invoice;

        public InvoicePrinter(Invoice invoice) {
            this.invoice = invoice;
        }

        public void printInvoice() {
            //print the invoice
        }
    }
}























