package com.ngntuli.hostel.services;

import com.ngntuli.hostel.models.Payment;

public interface PaymentService {
    void create(Long tenantId, Payment payment);

    Iterable<Payment> list(Long tenantId);
}
