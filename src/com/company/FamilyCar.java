package com.company;

import java.util.Scanner;

public class FamilyCar extends RentalCars{
    boolean manualGear;
    boolean airCondition;
    boolean cruiseControl;
    int seats;

    public FamilyCar(String b, String m, String fuel, String r, String rd, int o, boolean mGear, boolean air, boolean cc, int s){
        super(b, m, fuel, r ,rd, o);
        manualGear = mGear;
        airCondition = air;
        cruiseControl = cc;
        seats = s;
    }

    @Override
    public String toString() {
        return ("Brand: " + brand + "\nModel: " + model + "\nFuel type: " + fuelType + "\nRegistration number: " + regNum
                + "\nRegistration date: " + regDate + "\nKilometers driven: " + odometer + "\nManual gear: " + manualGear
                + "\nAir condition: " + airCondition + "\nCruise control: " + cruiseControl + "\nSeats: " + seats);
    }

    public static FamilyCar newFamilyCarEntry(Scanner input){
        System.out.println("What brand is the car?");
        String brand = input.next();
        System.out.println("What model is the car?");
        String model = input.next();
        System.out.println("Is it diesel or petrol?");
        String fuelType = input.next();
        System.out.println("What is the registration-number?");
        String regNum = input.next();
        System.out.println("What date what it registered? (DD/MM-YYYY)");
        String regDate = input.next();
        System.out.println("How many miles has it driven?");
        int odometer = input.nextInt();
        boolean manualGear = true;
        boolean airCondition = true;
        System.out.println("Does the car have cruisecontrol? true/false");
        boolean cruiseControl = input.nextBoolean();
        System.out.println("How many seats does the car have?");
        int seats = input.nextInt();

        return new FamilyCar(brand, model, fuelType, regNum, regDate, odometer, manualGear, airCondition, cruiseControl, seats);
    }
}
