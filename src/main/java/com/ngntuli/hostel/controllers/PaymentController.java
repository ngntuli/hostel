package com.ngntuli.hostel.controllers;

import com.ngntuli.hostel.models.Payment;
import com.ngntuli.hostel.services.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping("/tenants/{tenantId}/payments")
    public ResponseEntity<?> create(@PathVariable Long tenantId, @RequestBody Payment payment) {
        paymentService.create(tenantId, payment);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/tenants/{tenantId}/payments")
    public ResponseEntity<?> list(@PathVariable Long tenantId) {
        Iterable<Payment> payments = paymentService.list(tenantId);
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }
}
