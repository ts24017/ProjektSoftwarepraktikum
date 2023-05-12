package com.example.projektsoftwarepraktikum.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Benutzer {
//Klasse darf nicht user heißen sonst fehler
    @Id
    @GeneratedValue
    private Integer userId;

    private String username;

    private String password;

    public Benutzer() {
        // empty constructor for Hibernate
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}