package com.application.doctorsuggest.doctorsuggest.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(value = "Users")
public class UsersModel {
//Test
    @Id
    private String Id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Lastname is mandatory")
    private String surname;
    private String creationDate;
    @Indexed(unique=true)
    @NotBlank(message = "Username is mandatory")
    private String username;
    @Indexed(unique=true)
    @NotBlank(message = "Email is mandatory")
    private String mail;

    private String phoneNumber;
    @NotBlank(message = "Password is mandatory")
    private String password;

    private String userStatus;

    public UsersModel(String Id,String name, String surname, String creationDate, String username, String mail, String phoneNumber, String password,String userStatus) {
        this.Id=Id;
        this.name = name;
        this.surname = surname;
        this.creationDate = creationDate;
        this.username = username;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userStatus=userStatus;
    }

    public UsersModel() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
