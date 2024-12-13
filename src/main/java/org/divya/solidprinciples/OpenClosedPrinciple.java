package org.divya.solidprinciples;
/*
Open for Extension but Closed for Modification
 */
public class OpenClosedPrinciple {
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