package lesson13.homework.task1;

public class Baby extends Human {
    public Baby(String name, String mothersName, String fathersName, String sex) {
        super(name, mothersName, fathersName, sex);
    }

    public static String createABaby() {
        System.out.println("Congratulation!");

        if (createBabySex() == "Male") {
            System.out.println("It is a boy!");
            String babyName = Data.generateRandomObj(Data.ARRAY_MALES_NAMES);
            System.out.println("His name is " + babyName);
        } else
            System.out.println("It is a girl!");
        String babyName = Data.generateRandomObj(Data.ARRAY_FEMALES_NAMES);
        System.out.println("Her name is " + babyName);
        return babyName;
    }

    public static String createBabySex(){
        String sex = Data.generateRandomObj(Data.ARRAY_SEX);
        return sex;

    }
}
