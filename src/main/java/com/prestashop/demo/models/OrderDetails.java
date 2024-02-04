package com.prestashop.demo.models;

public class OrderDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String postalCode;
    private String City;

    public String getFirstName() {
        return firstName;
    }

    public OrderDetails setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public OrderDetails setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public OrderDetails setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public OrderDetails setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public OrderDetails setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getCity() {
        return City;
    }

    public OrderDetails setCity(String city) {
        City = city;
        return this;
    }
}
