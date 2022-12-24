package com.ngntuli.hostel.repos;

import com.ngntuli.hostel.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
