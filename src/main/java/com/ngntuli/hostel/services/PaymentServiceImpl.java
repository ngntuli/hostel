package com.ngntuli.hostel.services;

import com.ngntuli.hostel.models.Payment;
import com.ngntuli.hostel.models.Tenant;
import com.ngntuli.hostel.repos.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private TenantServiceImpl tenantService;

    @Override
    public void create(Long tenantId, Payment payment) {
        Tenant tenant = tenantService.read(tenantId);

        if (tenant != null) {
            payment.setTenant(tenant);
            payment = paymentRepository.save(payment);
            System.out.println("\n\n\n" + payment.getTenant().getId());
        }
    }

    @Override
    public Iterable<Payment> list(Long tenantId) {
        return paymentRepository.findAll();
    }

}
