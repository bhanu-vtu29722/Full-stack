package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    // FIELD INJECTION
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/pay")
    public String makePayment() {
        return paymentService.processPayment();
    }

    @GetMapping("/status")
    public String paymentStatus() {
        return paymentService.getPaymentStatus();
    }
}
