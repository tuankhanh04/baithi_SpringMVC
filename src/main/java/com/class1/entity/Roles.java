package com.class1.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "role")
    private String 	role;

    public Roles()  {

    }

    public Roles(String user_id, String role) {
        this.user_id = user_id;
        this.role = role;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "Roles [user_id=" + user_id + ", role=" + role + "]";
    }
}
