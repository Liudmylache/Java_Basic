package lesson6.classwork.math;

/*
Write a method to sum 2 ints
Overload it so that you can sum long and long, double and double

Return type - double for all methods
 */


public class Main {
    public static void main(String[] args) {
        Int i = new Int ();
        System.out.println(i.getSum(10.876, 168));

        Int l = new Long();
        System.out.println(l.getSum(177, 64));
    }
}
