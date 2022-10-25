package lesson5.homework;

public class MyMath {
    //Arithmetic operations

    //addition (+)
    public static int addition(int a, int b) {
        return a + b;
    }

    // subtraction (-)
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // multiplication (*)
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // division (/)
    public static int division(int a, int b) {
        return a / b;
    }
    //OR (For the result to be with a floating point number)
    public static double divisionFP(double a, double b) {
        return a / b;
    }

    //getting the remainder after dividing two numbers (%)
    public static int remainder(int a, int b){
        return a % b;
    }
    // prefix increment (++a)
    public static MyPair prefIncriment(int a) {
        int left = ++a;
        int right = a;

        return new MyPair(left, right);
    }

    // postfix increment (a++)
    public static MyPair postIncriment(int a) {
        int left = a++;
        int right = a;

        return new MyPair(left, right);
    }

    // prefix decrement (--a)
    public static MyPair prefDecrement(int a){
        int left = --a;
        int right = a;

        return new MyPair(left,right);
    }

    // postfix decrement (a--)
    public static MyPair postDecrement(int a) {
        int left = a--;
        int right = a;

        return new MyPair(left, right);
    }

    //Example
    public static int example(int a, int b){
        return ((a + b)/a * ++a) % 3;
    }

    public MyPair incriment(int a) {
        int left = a++;
        int right = a;

        return new MyPair(left, right);
    }

    /* Priority of arithmetic operations:
    1) ++ and --
    2) *, /, %
    3) +,-
     */
}
