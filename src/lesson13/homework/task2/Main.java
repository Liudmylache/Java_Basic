package lesson13.homework.task2;

public class Main {
    public static void main(String[] args) {

        Human mom = new Human("Sara", "woman", "Lucy", "Swen");
        Human dad = new Human("Sten","man", "Molly", "Dan");

        printFirstGeneration(mom,dad);

        Human son = new Human("Peter", "man", mom.name, dad.name);
        Human daughter = new Human("Eva", "woman", mom.name, dad.name);

        printSecondGeneration(son,daughter);

        mom.name = daughter.name;
        Human grandson = new Human("Eric", "man", mom.name, "Alex");

        printThirdGeneration(grandson);
    }

    public static void printFirstGeneration(Object mom, Object dad){
        System.out.println("-----------------");
        System.out.println("First generation");
        System.out.println("-----------------");
        System.out.println(mom.toString());
        System.out.println();
        System.out.println(dad.toString());
        System.out.println();
        System.out.println("-----------------");
    }

    public static void printSecondGeneration(Object son, Object daughter){
        System.out.println("Second generation");
        System.out.println("-----------------");
        System.out.println(son.toString());
        System.out.println();
        System.out.println(daughter.toString());
        System.out.println();
        System.out.println("-----------------");
    }

    public static void printThirdGeneration(Object grandson){
        System.out.println("Third generation");
        System.out.println("-----------------");
        System.out.println();
        System.out.println(grandson.toString());
    }
}
