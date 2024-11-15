package org.example.structural;

import java.math.BigDecimal;

public class CompositionExample {

    Response response;

    public static class Response {

        String id;

        Employee data;

    }

    public static class Employee {

        Person person;

        Payroll payroll;

        Employer employer;

    }

    public static class Person {

        String firstname;

        String lastname;

        String ssn;

        Address address;

    }

    public static class Employer {

        String name;

        Address address;

    }

    public static class Address {

        String street;

        String city;

        Integer zip;

        String country;

    }

    public static class Payroll {

        BigDecimal yearlySalary;

        BigDecimal bonus;

    }

}

