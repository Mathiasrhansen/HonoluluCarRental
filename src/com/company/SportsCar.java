package com.company;

public class SportsCar extends  RentalCars{
    boolean manualGear;
    int horsePower;

    public SportsCar(String b, String m, String fuel, int r, String rd, int o, boolean mGear, int hp){
        super(b, m, fuel, r, rd, o);
        manualGear = mGear;
        horsePower = hp;
    }
}