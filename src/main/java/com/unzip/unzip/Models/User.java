package com.unzip.unzip.Models;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(nullable=false)
    private String username;
    @Column(nullable=false)
    private String emailAddress;
    @Column(nullable=false)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = String.valueOf(String.valueOf(username.hashCode() + password.hashCode()).hashCode());
    }

    public User(){}

    public User(String username, String emailAddress, String password){
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = String.valueOf(String.valueOf(username.hashCode() + password.hashCode()).hashCode());
    }

    @Override
    public String toString(){
        return String.format(
                "User[id=%d, username='%s', emailAddress='%s', password='%s']",
                id, username, emailAddress, password);
    }
}
