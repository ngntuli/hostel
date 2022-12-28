package com.ngntuli.hostel.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Tenant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int room;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @OrderBy
    private Set<Payment> payments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
}
