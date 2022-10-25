package lesson10.classwork;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int numbers[] = new int[10];
        fill(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] ints = Arrays.copyOf(numbers, 20);
        System.out.println(Arrays.toString(ints));

    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

}
