package lesson5.homework;

public class MyPair extends Object{
    public int left;
    public int right;

    public MyPair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "left:" + this.left + " right:" + this.right;
    }
}
