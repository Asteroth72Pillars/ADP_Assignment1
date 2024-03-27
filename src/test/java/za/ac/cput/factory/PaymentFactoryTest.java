package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Payment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class PaymentFactoryTest {

    @Test
    void createPayment() {
        LocalDateTime paymentDate1 = LocalDateTime.parse("2023-12-03T00:00:00");
        String formattedPaymentDate1 = paymentDate1.format(DateTimeFormatter.ISO_DATE_TIME);
        Payment e = PaymentFactory.createPayment("200", "12", "AS12", formattedPaymentDate1, "100.00", "card","active", "1200", "fully paid");
        assertNotNull(e);
        System.out.println(e.toString());

        LocalDateTime paymentDate2 = LocalDateTime.parse("2023-12-02T00:00:00");
        String formattedPaymentDate2 = paymentDate2.format(DateTimeFormatter.ISO_DATE_TIME);
        Payment e2 = PaymentFactory.createPayment("AS12", "d23","w12", formattedPaymentDate2, "200.00", "Cash", "active", "1200", "fully paid");
        assertNotNull(e2);
        System.out.println(e2.toString());
    }
}
