package com.hiberelation.app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Contact {
    private int id;
    private String address;
    private int phone;
    private People peopleById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 30)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone", nullable = false)
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id &&
                phone == contact.phone &&
                Objects.equals(address, contact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, phone);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public People getPeopleById() {
        return peopleById;
    }

    public void setPeopleById(People peopleById) {
        this.peopleById = peopleById;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", peopleById=" + peopleById +
                '}';
    }
}
