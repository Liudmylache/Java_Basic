package lesson13.homework.task1;

import java.util.Random;

public class Data {
    final static String[] ARRAY_MALES_NAMES = new String[] {"James", "Robert", "John", "Michael", "David",
            "William", "Richard", "Joseph", "Thomas", "Charles", "Christopher", "Daniel", "Matthew"};

    final static String[] ARRAY_FEMALES_NAMES = new String[] {"Patricia", "Jennifer","Linda", "Elizabeth",
            "Barbara", "Susan", "Jessica", "Sarah", "Karen", "Lisa", "Nancy", "Betty", "Margaret"};

    final static String [] ARRAY_SEX = new String[] {"Male", "Female", "Male", "Female"};

    public static String generateRandomObj(String[] array) {
        //TODO: rename to : getRandomElement
        Random random = new Random();
        return (array[random.nextInt(array.length)]);
    }
}
