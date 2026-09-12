package net.explorviz.util;

import net.explorviz.model.Payment;

public class ValidationUtil {

    public static boolean validate(Payment payment) {
        return payment != null && payment.getAmount() != null && payment.getAmount() > 0;
    }
}
