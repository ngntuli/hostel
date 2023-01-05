package com.ngntuli.hostel.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PAYMENT_ID")
    private Long id;
    @Column(name = "PAID_DATE")
    private Date date;
    @Column(name = "AMOUNT")
    private double amount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenant")
    private Tenant tenant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date month) {
        this.date = month;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
