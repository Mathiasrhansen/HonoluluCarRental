package com.company;

import java.util.Scanner;

public class PrivateRental extends RentalInfo{
    int driversLicenseNum;
    String driverSince;

    public PrivateRental(String n, String a, String post, String c, int mp, int p, String e, int dln, String d){
        super (n, a, post, c, mp, p, e);
        driversLicenseNum = dln;
        driverSince = d;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\nAddress: " + address + "\nZip code: " + postNum + "\nCity: " + city
                + "\nMobile phone: " + mobilePhone + "\nPhone: " + phone + "\nEmail: " + email
                + "\nDrivers license number: " + driversLicenseNum + "\nDriver since: " + driverSince);
    }

    public  static PrivateRental newPrivateRentalEntry(Scanner input){
        System.out.println("What is the full name of the renter?");
        String name = input.next();
        System.out.println("What is the address of the renter?");
        String address = input.next();
        System.out.println("What is the zip code of the renter?");
        String postNum = input.next();
        System.out.println("What city does the renter live in?");
        String city = input.next();
        System.out.println("What is the cell phone number of the renter?");
        int cellPhoneNum = input.nextInt();
        System.out.println("What is the phone number of the renter?");
        int phoneNum = input.nextInt();
        System.out.println("What is the email of the renter?");
        String email = input.next();
        System.out.println("What is the drivers license number of the renter?");
        int driversNum = input.nextInt();
        System.out.println("When did the renter acquire their drivers license?");
        String driverSince = input.next();

        return new PrivateRental(name, address, postNum, city, cellPhoneNum, phoneNum, email, driversNum, driverSince);
    }
}
