package lesson13.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Human woman1 = new Human("Lucy");
        Human woman2 = new Human("Stacy");
        Human woman3 = new Human("Any");

        Human man1 = new Human("Alex");
        Human man2 = new Human("Artur");
        Human man3 = new Human("Orest");

        printInstruction(woman1,woman2,woman3,man1,man2,man3);

        System.out.println("Input # of person, which will be a mom");
        int mom = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input # of person which will be a dad");
        int dad = Integer.parseInt(bufferedReader.readLine());

        if ((mom > 3) || ((dad < 4) || (dad > 6))) {
            System.out.println("Wrong number :( ");
            System.exit(0);
        }

        Baby.createABaby();

        System.out.println("Baby's parents names: " + Main.chooseMom(mom, woman1, woman2, woman3) + " and" +
                Main.chooseDad(dad, man1, man2, man3));
    }


    public static void printInstruction(Object woman1,Object woman2, Object woman3,Object man1, Object man2, Object man3) {
        System.out.println("Welcome to the Sims city!");
        System.out.println("We already have 3 women and 3 men");
        System.out.println("(1)" + woman1.toString());
        System.out.println("(2)" + woman2.toString());
        System.out.println("(3)" + woman3.toString());
        System.out.println("(4)" + man1.toString());
        System.out.println("(5)" + man2.toString());
        System.out.println("(6)" + man3.toString());
    }


    public static Object chooseMom (int mom, Object woman1, Object woman2, Object woman3) {
        if (mom == 1) {
            return woman1;
        } else if (mom == 2) {
            return woman2;
        } else if (mom == 3) {
            return woman3;
        } else
            return "Wrong number :( ";
    }

    public static Object chooseDad (int dad, Object man1, Object man2, Object man3) {
        if (dad == 1) {
            return man1;
        } else if (dad == 4) {
            return man1;
        } else if (dad == 5) {
            return man2;
        } else if (dad == 6) {
            return man3;
        } else
            return "Wrong number :( ";
    }
}