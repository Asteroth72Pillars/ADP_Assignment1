//Tsireledzo Nemushungwa - 221196803
package za.ac.cput.factory;
import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class PaymentFactory {
    public static Payment createPayment(String paymentID, String bookingID, String customerID,
                                        String paymentDate, String amount, String paymentMethod,
                                        String status, String receiptNumber, String paymentDetails) {
        return new Payment.Builder()
                .setPaymentID(paymentID)
                .setBookingID(bookingID)
                .setCustomerID(customerID)
                .setPaymentDate(LocalDateTime.parse(paymentDate))
                .setAmount(Double.valueOf(amount))
                .setPaymentMethod(paymentMethod)
                .setStatus(status)
                .setReceiptNumber(receiptNumber)
                .setPaymentDetails(paymentDetails)
                .build();
    }
    public static Payment createPaymentWithGeneratedId(String bookingID, String customerID,
                                                       LocalDateTime paymentDate, Double amount,
                                                       String paymentMethod, String status,
                                                       String receiptNumber, String paymentDetails) {
        String paymentID = generatePaymentID();
        return new Payment.Builder()
                .setPaymentID(paymentID)
                .setBookingID(bookingID)
                .setCustomerID(customerID)
                .setPaymentDate(paymentDate)
                .setAmount(amount)
                .setPaymentMethod(paymentMethod)
                .setStatus(status)
                .setReceiptNumber(receiptNumber)
                .setPaymentDetails(paymentDetails)
                .build();
    }
    private static String generatePaymentID() {
        if (Helper.isNullOrEmpty("any string"))
            return null;

        LocalDateTime now = LocalDateTime.now();
        String timestamp = String.format("%d%02d%02d%02d%02d%02d",
                now.getYear(), now.getMonthValue(), now.getDayOfMonth(),
                now.getHour(), now.getMinute(), now.getSecond());

        int randomNumber = ThreadLocalRandom.current().nextInt(10000, 100000);
        return "PAYMENT-" + timestamp + "-" + randomNumber;
    }
}
