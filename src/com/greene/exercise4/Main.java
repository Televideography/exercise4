package com.greene.exercise4;
import java.util.Scanner;

public class Main {

    static int avgWeek = 0;

    static int[] totalTemps = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a list of cities, each separated by a single space: ");
        String cities = reader.nextLine();
        String[] listCities = cities.split(" ");
        int i = 0;
        int arrayLength = listCities.length;
        for (int y = 0; y < arrayLength; y++) {
            System.out.print("Enter the Temperature for each of the next five days for " + listCities[y] + " separated by a single space: ");
            String cityTemps = reader.nextLine();
            String [] avgTemps = cityTemps.split(" ");
            avgWeek = 0;
            for (int x = 0; x < 5; x++){
                int number = Integer.parseInt(avgTemps[x]);
                avgWeek = avgWeek + number;
                if (x == 4){
                    avgWeek = avgWeek/5;
                }
                totalTemps[i] = avgWeek;
            }


        }
        for (int y = 0; y < arrayLength; y++){
            System.out.println("The average weekly temperature for " + listCities[y] + " is " + totalTemps[i]);
        }
    }
}
