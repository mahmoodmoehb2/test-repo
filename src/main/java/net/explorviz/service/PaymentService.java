package net.explorviz.service;

import net.explorviz.repository.PaymentRepository;
import net.explorviz.model.Payment;
import net.explorviz.util.ValidationUtil;

public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment processPayment(Payment payment) {
        ValidationUtil.validate(payment);
        return paymentRepository.save(payment);
    }
}
