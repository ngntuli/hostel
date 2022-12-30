package com.ngntuli.hostel.repos;

import com.ngntuli.hostel.models.Tenant;
import org.springframework.data.repository.CrudRepository;

public interface TenantRepository extends CrudRepository<Tenant, Long> {
}
