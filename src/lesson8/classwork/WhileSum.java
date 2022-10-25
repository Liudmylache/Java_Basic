package lesson8.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileSum {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        /**
         * Считываать с консоли число, пока пользователь не напишет словао "сумма"
         * После ввода слова "сумма" нужно вывести в консоль сумму всех введенных чисел
         */
        String input = READER.readLine();
        int sum = 0;
        int i = 0;
        while (!input.equalsIgnoreCase("sum")) {
            sum += Integer.parseInt(input);
            input = READER.readLine();
            ++i;
        }
        System.out.println("sum " + sum);
        System.out.println(i);
    }
}