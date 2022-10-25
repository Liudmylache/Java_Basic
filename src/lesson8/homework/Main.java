package lesson8.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number of dogs you want to feed: ");

        int numberOfDogs = Integer.parseInt(reader.readLine());
        System.out.println("You have: " + numberOfDogs + " dogs");

        System.out.println("Enter a number of cats you want to feed: ");

        int numberOfCats = Integer.parseInt(reader.readLine());
        System.out.println("You have: " + numberOfCats + " cats");

        System.out.println("Enter a number of days: ");

        int numberOfDays = Integer.parseInt(reader.readLine());
        System.out.println("Number of days: " + numberOfDays);


        Shelter shelter = new Shelter(numberOfCats,numberOfDogs, 2, numberOfDays);
        System.out.println("----------------------------");

        System.out.println("For " + numberOfDogs + " (dog)s you need " + shelter.eatPerDogs() + " g dog food "
                + " for " + numberOfDays + " day(s)");

        System.out.println("For " + numberOfCats + " cat(s) you need " + shelter.eatPerCats() + " g cat food "
                + " for " + numberOfDays + " day(s)");

        System.out.println("Overall cost of the shelter maintenance is " + "$" + shelter.overallCost());
    }
}
