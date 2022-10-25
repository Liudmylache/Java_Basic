package lesson8.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] arg) throws IOException {

        /**
         * Считываать с консоли любые слова, пока пользователь не напишет словао "Stop"
         * После ввода слова "Stop" прогорамма завершается
         */
        String input = READER.readLine();
        while(!input.equalsIgnoreCase("stop")){
            System.out.println("your input: " + input);
            input = READER.readLine();
        }
    }
}
