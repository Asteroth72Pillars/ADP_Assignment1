package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    private IPaymentRepository repository;
    private Payment payment;

    @BeforeEach
    @Order(1)
    void setUp() {
        repository = PaymentRepository.getRepository();
        payment = PaymentFactory.createPayment("PAY-123", "BOOK-456", "CUS-789",
                "2024-03-25T12:00:00", "100", "Credit Card", "Completed",
                "REC-001", "Additional details");
    }

    @Test
    @Order(2)
    void create() {
        Payment created = repository.create(payment);
        assertNotNull(created);
        assertEquals(payment, created);
        System.out.println("Created Payment: " + created);
    }

    @Test
    @Order(3)
    void read() {
        repository.create(payment);
        Payment retrieved = repository.findById(payment.getPaymentID());
        assertNotNull(retrieved);
        assertEquals(payment, retrieved);
        System.out.println("Retrieved Payment: " + retrieved);
    }

    @Test
    @Order(4)
    void update() {
        repository.create(payment);
        Payment updatedPayment = new Payment.Builder()
                .copy(payment)
                .setPaymentMethod("Online Transfer")
                .build();
        Payment updated = repository.update(updatedPayment);
        assertNotNull(updated);
        assertEquals("Online Transfer", updated.getPaymentMethod());
        System.out.println("Updated Payment: " + updated);
    }

    @Test
    @Order(5)
    void getAll() {
        repository.create(payment);
        List<Payment> paymentList = repository.getAll();
        assertNotNull(paymentList);
        assertFalse(paymentList.isEmpty());
        System.out.println("All Payments: " + paymentList);
    }

    @Test
    @Order(6)
    void delete() {
        repository.create(payment);
        boolean deleted = repository.delete(payment.getPaymentID());
        assertTrue(deleted);
        assertNull(repository.findById(payment.getPaymentID())); // Change assertEquals to assertNull
        System.out.println("Payment deleted successfully.");
    }
}
