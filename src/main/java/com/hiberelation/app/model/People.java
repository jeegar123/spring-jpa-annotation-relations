package com.hiberelation.app.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class People {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String bio;
    private Timestamp created;
    private Contact contactById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 25)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 25)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 10)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "bio", nullable = false, length = -1)
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Basic
    @Column(name = "created", nullable = false)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id &&
                Objects.equals(firstName, people.firstName) &&
                Objects.equals(lastName, people.lastName) &&
                Objects.equals(username, people.username) &&
                Objects.equals(password, people.password) &&
                Objects.equals(bio, people.bio) &&
                Objects.equals(created, people.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, username, password, bio, created);
    }

    @OneToOne(mappedBy = "peopleById",cascade = CascadeType.ALL)
    public Contact getContactById() {
        return contactById;
    }

    public void setContactById(Contact contactById) {
        this.contactById = contactById;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                ", created=" + created +
                ", contactById=" + contactById +
                '}';
    }
}
