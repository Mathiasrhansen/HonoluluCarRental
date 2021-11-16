package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException{
        ArrayList<RentalCars> carList = new ArrayList<>();
        ArrayList<FamilyCar> familyCarList = new ArrayList<>();
        ArrayList<LuxuryCar> luxuryCarList = new ArrayList<>();
        ArrayList<SportsCar> sportsCarList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Scanner readFam = new Scanner(new File("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\FamilyCars.txt"));
        Scanner readSport = new Scanner(new File("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\SportsCars.txt"));
        Scanner readLux = new Scanner(new File("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\LuxuryCars.txt"));

        SportsCar porsche = new SportsCar("Porsche", "911", "Petrol", "GW40958", "20/05-2020", 3500, true, 420);
        carList.add(porsche);
        sportsCarList.add(porsche);
        FamilyCar nissan = new FamilyCar("Nissan", "Quest", "Petrol", "HF38663", "13/08-2017", 11000, false, true, false, 7);
        carList.add(nissan);
        familyCarList.add(nissan);
        FamilyCar ford = new FamilyCar("Ford", "S-Max", "Diesel", "CV17345", "16/11-2020", 28425, false, true, true, 7);
        carList.add(ford);
        familyCarList.add(ford);

        SportsCar custom = SportsCar.newSportsCarEntry(input);
        appendSportsCars(custom);


        /*System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|        Honolulu Car Rental        |");
        System.out.println("|                                   |");
        System.out.println("-------------------------------------\n");
        System.out.println("Main menu:\n");
        System.out.println("Press 1 to show a list of the cars");

        int ans1 = input.nextInt();
        switch (ans1){
            case 1:
                printMyList(carList);
                break;
        }

        //saveFamilyCarsToFile(familyCarList);

         */
        }

    public static void printMyList(ArrayList<RentalCars> list){
        System.out.println("\n------------------------------------\n");
        for (RentalCars rentalCars : list) {
            System.out.println(rentalCars + "\n\n------------------------------------\n");
        }
    }

    public static void saveFamilyCarsToFile(ArrayList<FamilyCar> familyCarList)throws FileNotFoundException{
        PrintStream write = new PrintStream("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\FamilyCars.txt");
        for (FamilyCar familyCar: familyCarList){
            write.println(familyCar + "\n");
        }
    }

    public static void saveSportsCarsToFile(ArrayList<SportsCar> sportsCarList)throws FileNotFoundException{
        PrintStream write = new PrintStream("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\SportsCars.txt");
        for (SportsCar sportsCar: sportsCarList){
            write.println(sportsCar + "\n");
        }
    }

    public static void saveLuxuryCarsToFile(ArrayList<LuxuryCar> luxuryCarList)throws FileNotFoundException{
        PrintStream write = new PrintStream("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\LuxuryCars.txt");
        for (LuxuryCar luxuryCar: luxuryCarList){
            write.println(luxuryCar + "\n");
        }
    }

    public static void appendSportsCars(SportsCar custom)throws FileNotFoundException{
        try{
            FileWriter appendNE = new FileWriter("C:\\Users\\Mathi\\OneDrive\\Skrivebord\\IntelliJ\\Honolulu Car Rental\\src\\com\\company\\SportsCars.txt", true);
            BufferedWriter out = new BufferedWriter(appendNE);

            String brand = custom.brand;
            String model = custom.model;
            String fuelType = custom.fuelType;
            String regNum = custom.regNum;
            String regDate = custom.regDate;
            int odometer = custom.odometer;
            boolean manualGear = custom.manualGear;
            int horsePower = custom.horsePower;

            out.write("Brand: " + brand+ "\nModel: " + model + "\nFuel type: " + fuelType + "\nRegistration number: " + regNum + "\nRegistration date: " + regDate + "\nKilometers driven: " + odometer + "\nManual gear: " +manualGear + "\nHorsepower: " + horsePower + "\n\n");
            out.close();
        }catch (Exception er){
            System.err.println("Error while printing" + er.getMessage());
        }
    }
}
