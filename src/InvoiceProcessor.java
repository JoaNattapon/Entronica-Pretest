import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InvoiceProcessor {

    public List<Invoice> getOverdueInvoices(List<Invoice> invoices) {

        LocalDate currentDate = LocalDate.now();
        List<Invoice> result = new ArrayList<>();

        for(Invoice invoice : invoices) {

            if(invoice.getDue_Date().isBefore(currentDate) && invoice.getPaid_Date() == null) {

                result.add(invoice);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "InvoiceProcessor{}";
    }

    public static void main(String[] args) {

        List<Invoice> myTest = new ArrayList<>();

        myTest.add(new Invoice(1, 100, LocalDate.of(2024, 4, 25), null));
        myTest.add(new Invoice(2, 200, LocalDate.of(2024, 3, 6), LocalDate.of(2024, 3, 3)));
        myTest.add(new Invoice(3, 150, LocalDate.of(2024, 2, 12), LocalDate.of(2024,2,15)));
        myTest.add(new Invoice(4, 300, LocalDate.of(2024, 3, 2), null));

        InvoiceProcessor lotOne = new InvoiceProcessor();

        List<Invoice> getOverdue = lotOne.getOverdueInvoices(myTest);

        for(Invoice inv : getOverdue) {

            System.out.println(inv);
        }
    }
}
