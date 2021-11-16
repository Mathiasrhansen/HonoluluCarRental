package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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
        return ("Brand: " + brand + "\nModel: " + model + "\nFuel type: " + fuelType + "\nRegistration number: " + regNum
                + "\nRegistration date: " + regDate + "\nKilometers driven: " + odometer + "\nHorsepower: "
                + horsePower + "\nManual gear: " + manualGear);
    }

    public static SportsCar newSportsCarEntry(Scanner input){
        System.out.println("What brand is the car?");
        String brand = input.next();
        System.out.println("What model is the car?");
        String model = input.next();
        System.out.println("Is it diesel or petrol");
        String fuelType = input.next();
        System.out.println("What is the registration-number");
        String regNum = input.next();
        System.out.println("What date what it registered? (DD/MM-YYYY)");
        String regDate = input.next();
        System.out.println("How many miles has it driven?");
        int odometer = input.nextInt();
        boolean mGear = true;
        System.out.println("How many horsepower does it have?");
        int hp = input.nextInt();

        return new SportsCar(brand, model, fuelType, regNum, regDate, odometer, true, hp);
    }
}

