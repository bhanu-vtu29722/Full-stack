package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment() {
        return "Payment processed successfully";
    }

    public String getPaymentStatus() {
        return "Payment status: SUCCESS";
    }
}
