package com.ngntuli.hostel.controllers;

import com.ngntuli.hostel.models.Tenant;
import com.ngntuli.hostel.services.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TenantController {

    @Autowired
    private TenantServiceImpl tenantService;

    @PostMapping("/tenants")
    public ResponseEntity<?> create(@RequestBody Tenant tenant) {
        tenantService.create(tenant);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/tenants")
    public ResponseEntity<Iterable<Tenant>> list() {
        Iterable<Tenant> tenants = tenantService.list();
        return new ResponseEntity<>(tenants, HttpStatus.OK);
    }

    @GetMapping("/tenants/{tenantId}")
    public ResponseEntity<?> read(@PathVariable Long tenantId) {
        Tenant tenant = tenantService.read(tenantId);
        return new ResponseEntity<>(tenant, HttpStatus.OK);
    }

    @PutMapping("/tenants/{tenantId}")
    public ResponseEntity<?> update(@RequestBody Tenant tenant, @PathVariable Long tenantId) {
        tenantService.update(tenant, tenantId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/tenants/{tenantId}")
    public ResponseEntity<?> remove(@PathVariable Long tenantId) {
        tenantService.remove(tenantId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
