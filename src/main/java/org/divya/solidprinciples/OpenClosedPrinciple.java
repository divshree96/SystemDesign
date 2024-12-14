package org.divya.solidprinciples;
/*
Open for Extension but Closed for Modification
 */
public class OpenClosedPrinciple {
    class Invoice {
        private SingleResponsibilityPrinciple.Marker marker;
        private int quantity;


        public Invoice(SingleResponsibilityPrinciple.Marker marker, int quantity) {
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

    //does not follow Open/Closed
    class InvoiceDAO {
        Invoice invoice;

        public InvoiceDAO(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            //Save the data to DB
        }

        public void saveToFile() {
            //Save the data to File
        }
    }

    //how to improve this
    interface InvoiceDao {
        public void save(Invoice invoice);
    }

    class DatabaseInvoiceDao implements InvoiceDao {

        @Override
        public void save(Invoice invoice) {
            //save to DB
        }
    }

    class FileInvoiceDao implements InvoiceDao {

        @Override
        public void save(Invoice invoice) {
            //save to File
        }
    }
}