package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
        ArrayList<RentalCars> carList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //Scanner read = new Scanner(new File("Cars.txt"));

        SportsCar porsche = new SportsCar("Porsche", "911", "Petrol", "GW40958", "20/05-2020", 3500, true, 420);
        carList.add(porsche);
        FamilyCar nissan = new FamilyCar("Nissan", "Quest", "Petrol", "HF38663", "13/08-2017", 11000, false, true, false, 7);
        carList.add(nissan);
        FamilyCar ford = new FamilyCar("Ford", "S-Max", "Diesel", "CV17345", "16/11-2020", 28425, false, true, true, 7);
        carList.add(ford);

        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|        Honolulu Car Rental        |");
        System.out.println("|                                   |");
        System.out.println("-------------------------------------\n");
        System.out.println("Main menu:\n");
        System.out.println("Press 1 to");


        }

    public static void printMyList(ArrayList<RentalCars> list){
        System.out.println("\n------------------------------------\n");
        for (RentalCars rentalCars : list) {
            System.out.println(rentalCars + "\n\n------------------------------------\n");
        }
    }
}
