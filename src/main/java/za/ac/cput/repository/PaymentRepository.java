package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepository implements IPaymentRepository {

    private static PaymentRepository repository = null;
    private final List<Payment> paymentList;

    private PaymentRepository() {
        paymentList = new ArrayList<>();
    }

    public static PaymentRepository getRepository() {
        if (repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }

    @Override
    public Payment create(Payment entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Entity cannot be null");
        }
        boolean success = paymentList.add(entity);
        return success ? entity : null;
    }

    @Override
    public Payment findById(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        for (Payment e : paymentList) {
            if (id.equals(e.getPaymentID())) {
                return e;
            }
        }
        return null;
    }

    @Override
    public Payment update(Payment entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Entity cannot be null");
        }
        Payment existingPayment = findById(entity.getPaymentID());
        if (existingPayment == null) {
            return null;
        }
        int index = paymentList.indexOf(existingPayment);
        paymentList.set(index, entity);
        return entity;
    }

    @Override
    public boolean delete(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        Payment paymentToDelete = findById(id);
        return paymentToDelete != null && paymentList.remove(paymentToDelete);
    }

    @Override
    public List<Payment> getAll() {
        return new ArrayList<>(paymentList);
    }
}
