package lesson7.homework.plane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfPlane {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("We have 3 types of aircraft: Fighter, " +
                "Passenger aircraft(Aerobus), " +
                "Passenger aircraft(Boeing)");
        System.out.println("Type Number of plane to get more characteristics");
        System.out.println("1 - Fighter OR 2 - Aerobus OR 3 - Boeing OR 4 - If you want to know information about all of them");


        Integer number = Integer.parseInt(reader.readLine());

        if (number == 1) {
            System.out.println("Aircraft type: Jet");
            System.out.println("Model: F-22 Raptor");
        } else if (number == 2) {
            System.out.println("Aircraft type: Airliner");
            System.out.println("Model: Aerobus 737,");
            System.out.println("Number of passengers in economy class: 120");
        } else if (number == 3) {
            System.out.println("Aircraft type: Airliner");
            System.out.println("Model: Boeing 777,");
            System.out.println("Number of passengers in economy class: 180");
            System.out.println("Number of passengers in business class: 28");
        } else if (number == 4) {
            System.out.println("Aircraft type: Jet");
            System.out.println("Model: F-22 Raptor");
            System.out.println("--------------------");
            System.out.println("Aircraft type: Airliner");
            System.out.println("Model: Aerobus 737,");
            System.out.println("Number of passengers in economy class: 120");
            System.out.println("--------------------");
            System.out.println("Aircraft type: Airliner");
            System.out.println("Model: Boeing 777,");
            System.out.println("Number of passengers in economy class: 180");
            System.out.println("Number of passengers in business class: 28");
        } else
            System.out.println ("Please make sure you type the right number :)");

    }
}
