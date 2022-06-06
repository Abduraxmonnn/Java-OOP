package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        DriverLicense license = new DriverLicense();
        Driver driver = new Driver();
        driver.setLicense(license);
        driver.setFirstName("Bob");
        driver.setSecondName("Poul");
        driver.setAge(19);
        driver.setExperience(1);
        driver.Show();

        System.out.println("\n----------------------------\n");
        Date issuance = new Date(2022, 3, 18);
        Date expiration = new Date(2026, 3, 18);
        DriverLicense license1 = new DriverLicense("poqwmnzx", "BC");
        license1.setGivenDate(issuance);
        license1.setDueDate(expiration);
        license1.setOrganization("License organization");
        Driver driver1 = new Driver("Alex", 23);
        driver1.setLicense(license1);
        driver1.setSecondName("Williams");
        driver1.setExperience(5);
        driver1.Show();
    }

}

