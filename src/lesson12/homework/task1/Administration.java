package lesson12.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;

public class Administration {
    public static Cat registerCat(BufferedReader bufferedReader) throws IOException {
        System.out.println("Input your cat's name below:");
        String name  = bufferedReader.readLine();

        System.out.println("Input your cat's age below:");
        int age = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Input your cat's weight below:");
        int weight = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Input your cat's breed below:");
        String breed = bufferedReader.readLine();

        return new Cat(name, age, weight, breed);
    }

    public static void verifyCat(Cat object, Cat anotherObj) {
        if (object.equals(anotherObj) == true) {
            System.out.println("Uuups. We have a problem.");
            System.out.println("It looks like you tried to use one cat twice. Please come with me....");
        }

        if (object.equals(anotherObj) == false) {
            System.out.println("Everything is perfect!");
            System.out.println("You can go and have fun!");
        }
    }
}
