package lesson12.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println();


        Message.printIntro();

        Cat cat1 = Administration.registerCat(BUFFERED_READER);

        System.out.println(cat1);
        cat1.mew();

        Message.printAnotherMessage();
        Cat cat2 = Administration.registerCat(BUFFERED_READER);
        System.out.println(cat2);
        cat2.mew();

        Message.printCheckMessage();

        System.out.println("_________________________");
        System.out.println(cat1.equals(cat2));
        System.out.println("_________________________");
        Administration.verifyCat(cat1,cat2);
    }
}
