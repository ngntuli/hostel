package com.ngntuli.hostel.services;

import com.ngntuli.hostel.models.Tenant;
import com.ngntuli.hostel.repos.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TenantServiceImpl implements TenantService {
    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public void create(Tenant tenant) {
        tenantRepository.save(tenant);
    }

    @Override
    public Iterable<Tenant> list() {
        return tenantRepository.findAll();
    }

    @Override
    public Tenant read(Long tenantId) {
        Optional<Tenant> tenant = tenantRepository.findById(tenantId);
        if (tenant.isEmpty()) {
            try {
                throw new Exception("Tenant not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return tenant.get();
    }

    @Override
    public void update(Tenant tenant, Long tenantId) {
        Tenant tenant1 = read(tenantId);
        if (tenant1 != null) {
            tenantRepository.save(tenant);
        }

    }

    @Override
    public void remove(Long tenantId) {
        tenantRepository.deleteById(tenantId);
    }

}
