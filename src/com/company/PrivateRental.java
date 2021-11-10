package com.company;

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
}
