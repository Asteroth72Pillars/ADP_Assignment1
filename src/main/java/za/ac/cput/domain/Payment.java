//Tsireledzo Nemushungwa - 221196803
package za.ac.cput.domain;
import java.util.Objects;
import java.time.LocalDateTime;

public class Payment {
    private String paymentID;
    private String bookingID;
    private String customerID;
    private LocalDateTime paymentDate;
    private Double amount;
    private String paymentMethod;
    private String status;
    private String receiptNumber;
    private String paymentDetails;

    private Payment(){}

    private Payment (Builder builder){
        this.paymentID = builder.paymentID;
        this.paymentDate = builder.paymentDate;
        this.paymentDetails = builder.paymentDetails;
        this.paymentMethod = builder.paymentMethod;;
        this.amount = builder.amount;
        this.bookingID = builder.paymentID;
        this.customerID = builder.customerID;
        this.receiptNumber = builder.receiptNumber;;
        this.status = builder.status;
    }


    public String getPaymentID() {
        return paymentID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public Double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(getPaymentID(), payment.getPaymentID()) && Objects.equals(getBookingID(), payment.getBookingID()) && Objects.equals(getCustomerID(), payment.getCustomerID()) && Objects.equals(getPaymentDate(), payment.getPaymentDate()) && Objects.equals(getAmount(), payment.getAmount()) && Objects.equals(getPaymentMethod(), payment.getPaymentMethod()) && Objects.equals(getStatus(), payment.getStatus()) && Objects.equals(getReceiptNumber(), payment.getReceiptNumber()) && Objects.equals(getPaymentDetails(), payment.getPaymentDetails());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPaymentID(), getBookingID(), getCustomerID(), getPaymentDate(), getAmount(), getPaymentMethod(), getStatus(), getReceiptNumber(), getPaymentDetails());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", paymentDate=" + paymentDate +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                ", receiptNumber='" + receiptNumber + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                '}';
    }
    public static class Builder {
        private String paymentID;
        private String bookingID;
        private String customerID;
        private LocalDateTime paymentDate;
        private Double amount;
        private String paymentMethod;
        private String status;
        private String receiptNumber;
        private String paymentDetails;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setPaymentDate(LocalDateTime paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder setAmount(Double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setReceiptNumber(String receiptNumber) {
            this.receiptNumber = receiptNumber;
            return this;
        }

        public Builder setPaymentDetails(String paymentDetails) {
            this.paymentDetails = paymentDetails;
            return this;
        }
        public Builder copy(Payment p){
            this.amount = p.amount;
            this.paymentID = p.paymentID;
            this.bookingID = p.paymentID;
            this.paymentDate = p.paymentDate;
            this.paymentDetails = p.paymentDetails;
            this.customerID = p.customerID;
            this.paymentMethod = p.paymentMethod;
            this.receiptNumber = p.receiptNumber;
            this.status = p.status;
            return this;
        }
        public Payment build(){return new Payment(this);}
    }

}
