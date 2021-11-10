package com.company;

public class PrivateRental extends RentalInfo{
    int driversLicenseNum;
    String driverSince;

    public PrivateRental(String n, String a, String post, String c, int mp, int p, String e, int dln, String d){
        super (n, a, post, c, mp, p, e);
        driversLicenseNum = dln;
        driverSince = d;
    }
}
