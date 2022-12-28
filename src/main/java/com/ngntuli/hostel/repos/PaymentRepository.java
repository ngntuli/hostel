package com.ngntuli.hostel.repos;

import com.ngntuli.hostel.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
