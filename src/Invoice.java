import java.time.LocalDate;
import java.util.Date;

public class Invoice {

    private final int id;
    private double amount;
    private LocalDate due_Date;
    private LocalDate paid_Date;

    public Invoice(int id, double amount, LocalDate due_Date, LocalDate paid_Date) {

        this.id = id;
        this.amount = amount;
        this.due_Date = due_Date;
        this.paid_Date = paid_Date;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDue_Date() {
        return due_Date;
    }

    public LocalDate getPaid_Date() {
        return paid_Date;
    }

    public void setPaid_date(LocalDate paid_Date) {
        this.paid_Date = paid_Date;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", amount=" + amount +
                ", dueDate=" + due_Date +
                ", paidDate=" + paid_Date +
                '}';
    }
}
