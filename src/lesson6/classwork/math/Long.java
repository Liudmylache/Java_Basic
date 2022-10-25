package lesson6.classwork.math;

public class Long extends Int{
    @Override
    public double getSum(double a, double b) {
        long sum = (long)super.getSum(a, b);
        return sum;
    }
}
