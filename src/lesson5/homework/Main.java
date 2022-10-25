package lesson5.homework;

public class Main {
    public static void main(String[] args) {
        MyMath math = new MyMath();


        System.out.println(math.addition(5, 4));

        System.out.println(math.subtraction(100, 200));

        System.out.println(math.multiplication(3, 5));

        System.out.println(math.division(200, 100));

        System.out.println(math.divisionFP(55.10, 2));

        System.out.println(math.remainder(101,3));

        System.out.println(math.prefIncriment(33));

        System.out.println(math.postIncriment(99));

        System.out.println(math.prefDecrement(100));

        System.out.println(math.postDecrement(100));

        System.out.println(math.example(3,5));

    }
}
