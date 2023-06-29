package com.dahttt.dahttt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.dahttt.dahttt.constant.GenderEnum;
import com.dahttt.dahttt.util.ValueOfEnum;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @JsonIgnore
    private int id;

    @NotEmpty(message = "The full name is required.")
    @Size(min = 2, max = 50, message = "The length of full name must be between 2 and 50 characters.")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "The gender is required.")
    @Column(name = "gender")
    @ValueOfEnum(enumClass = GenderEnum.class, message = "gender must be: [M , F, O]")
    private String gender;

    @NotNull(message = "The date of birth is required.")
    @Past(message = "The date of birth must be in the past.")
    @Column(name = "date_of_birth")
    private Date dob;

    @NotEmpty(message = "The role is required.")
    @Column(name = "role")
    private String role;

    @NotEmpty(message = "The phone number must not be empty")
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @NotEmpty(message = "The user name must not be empty")
    @Column(name = "username")
    private String username;
    @NotEmpty(message = "The password must not be empty")
    @Column(name = "password")
    private String password;

    @NotEmpty(message = "The created time must not be empty")
    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @Column(name = "reset_password_token")
    private String resetPasswordToken;

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void setRole(String role) { this.role = role;}
    public String getRole() {
        return role;
    }
}
