package com.company;

public class SportsCar extends  RentalCars{
    boolean manualGear;
    int horsePower;

    public SportsCar(String b, String m, String fuel, String r, String rd, int o, boolean mGear, int hp){
        super(b, m, fuel, r, rd, o);
        manualGear = mGear;
        horsePower = hp;
    }

    @Override
    public String toString(){
        return ("Brand: " + brand + "\nModel: " + model + "\nFueltype: " + fuelType + "\nRegistration number: " + regNum
                + "\nRegistration date: " + regDate + "\nKilometers driven: " + odometer + "\nHorsepower: "
                + horsePower + "\nManual gear: " + manualGear);
    }
}

