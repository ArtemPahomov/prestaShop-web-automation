package com.prestashop.demo.factories;

import com.github.javafaker.Faker;
import com.prestashop.demo.models.OrderDetails;

import java.util.Locale;

public class OrderDetailsFactory {
    private Faker faker;

    public OrderDetailsFactory(Locale locale) {
        this.faker = new Faker(locale);
    }

    public OrderDetails createOrderDetails() {
        final String firstName = faker.name().firstName();
        final String lastName = faker.name().lastName();
        final String email = faker.internet().emailAddress();
        final String city = faker.address().city();
        final String address = faker.address().fullAddress();
        final String postalCode = faker.address().zipCode();
        return new OrderDetails()
                .setFirstName(firstName)
                .setLastName(lastName).setEmail(email).setCity(city).setAddress(address).setPostalCode(postalCode);
    }
}
