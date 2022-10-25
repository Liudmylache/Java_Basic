package lesson14.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Type numbers of Degrees");
        int celsiusInput = Integer.parseInt(READER.readLine());
        System.out.println("If you want to convert it to Fahrenheit, type 1;");
        System.out.println("If you want to convert it to Kelvin, type 2;");
        int typeOfDegree = Integer.parseInt(READER.readLine());
        ConverterImpl converterImp = new ConverterImpl(celsiusInput, typeOfDegree);

        converterImp.convert(celsiusInput,typeOfDegree);

        System.out.println("Have a nice day!");
    }
}
