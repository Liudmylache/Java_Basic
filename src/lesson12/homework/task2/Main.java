package lesson12.homework.task2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        String [] arrayLatUppercase = new String [] {"A","B","C", "D", "E", "F", "G", "H", "I", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z", "_"};

        String [] arrayLatLowercase = new String[] {"a","b","c", "d", "e", "f", "g", "h", "i", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "v", "x", "y", "z", "_"};

        String[] arrayNumbers = new String [] {"0","1","2","3","4","6","7","8","9"};

        String randomLatUppercase1 = generateRandomObj(arrayLatUppercase);
        String randomLatUppercase2 = generateRandomObj(arrayLatUppercase);
        String randomLatLowercase1 = generateRandomObj(arrayLatLowercase);
        String randomLatLowercase2 = generateRandomObj(arrayLatLowercase);

        String randomNumber1 = generateRandomObj(arrayNumbers);
        String randomNumber2 = generateRandomObj(arrayNumbers);
        String randomNumber3 = generateRandomObj(arrayNumbers);
        String randomNumber4 = generateRandomObj(arrayNumbers);

        System.out.print(randomLatUppercase1);
        System.out.print(randomLatUppercase2);
        System.out.print(randomLatLowercase1);
        System.out.print(randomLatLowercase2);

        System.out.print(randomNumber1);
        System.out.print(randomNumber2);
        System.out.print(randomNumber3);
        System.out.println(randomNumber4);

        String [] passwordArray = new String[] {randomLatUppercase1,randomLatUppercase2,randomLatLowercase1,randomLatLowercase2,
                randomNumber1,randomNumber2,randomNumber3,randomNumber4};


        // printCollection(passwordArray);
        String[] shuffledPassword = shuffleArray(shuffleArray(passwordArray));
        printCollection(shuffledPassword);
    }


    public static String generateRandomObj(String[] array) {
        Random random = new Random();
        return (array[random.nextInt(array.length)]);
    }

    public static String[] shuffleArray(String[] array) {
        for (int i = array.length; i > 1; i--)
        {
            Random random = new Random();
            int j = random.nextInt(i);
            String temp = array[i - 1];
            array[i - 1] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void printCollection(Object[] collection) {
        for (Object password : collection) {
            System.out.print(password);
        }
        System.out.println();
    }
}
