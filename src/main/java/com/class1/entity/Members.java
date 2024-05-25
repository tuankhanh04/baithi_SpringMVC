package com.class1.entity;

import javax.persistence.*;


@Entity
@Table(name = "members")
public class Members {
    @Id
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "password")
    private String password;
    @Column(name = "is_active")
    private int is_active;

    public Members() {

    }

    public Members(String user_id, String password, int is_active) {
        this.user_id = user_id;
        this.password = password;
        this.is_active = is_active;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "Members [user_id=" + user_id + ", password=" + password + ",is_active" + is_active + "]";
    }
}
