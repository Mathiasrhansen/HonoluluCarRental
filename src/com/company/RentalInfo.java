package com.company;

public class RentalInfo {
    String name;
    String address;
    String postNum;
    String city;
    int mobilePhone;
    int phone;
    String email;

    public RentalInfo(){
    }

    public RentalInfo(String n, String a, String post, String c, int mp, int p, String e){
     name = n;
     address = a;
     postNum = post;
     city = c;
     mobilePhone = mp;
     phone = p;
     email = e;
    }

    public String toString() {
        return ("Name: " + name + "\nAddress: " + address + "\nZip code: " + postNum + "\nCity: " + city
                + "\nMobile phone: " + mobilePhone + "\nPhone: " + phone + "\nEmail: " + email);
    }
}
