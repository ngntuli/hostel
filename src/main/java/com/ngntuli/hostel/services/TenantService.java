package com.ngntuli.hostel.services;

import com.ngntuli.hostel.models.Tenant;

public interface TenantService {
    void create(Tenant tenant);

    Iterable<Tenant> list();

    Tenant read(Long tenantId);

    void update(Tenant tenant, Long tenantId);

    void remove(Long tenantId);
}
