package br.com.dbserver.utils;

import com.github.javafaker.Faker;

public class GeneratorFaker {

    private Faker faker;
    private String email;
    private String specialRequests;

    public GeneratorFaker() {
        faker = new Faker();
    }

    public String getEmail() {
        email = faker.internet().emailAddress();
        return email;
    }

    public String getSpecialRequests() {
        specialRequests = faker.harryPotter().spell();
        return specialRequests;
    }
}