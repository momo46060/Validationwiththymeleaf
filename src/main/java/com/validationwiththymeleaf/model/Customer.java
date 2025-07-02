package com.validationwiththymeleaf.model;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private  String lastName;
    @NotNull(message = "is required")
    @Min(value = 1, message = " too low")
    @Max(value =10, message = " too high")
    private  Integer passes;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "must be a 5 digit number")
    private  String postalCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer() {
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Customer(String firstName, String lastName, Integer passes, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passes = passes;
        this.postalCode = postalCode;
    }

    public Integer getPasses() {
        return passes;
    }

    public void setPasses(Integer passes) {
        this.passes = passes;
    }
}
