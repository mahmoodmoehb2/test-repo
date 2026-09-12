package net.explorviz.repository;

import net.explorviz.model.Payment;

public class PaymentRepository {

    public Payment findById(Long id) {
        Payment payment = new Payment();
        payment.setId(id);
        return payment;
    }

    public Payment save(Payment payment) {
        return payment;
    }
}
