package lesson6.classwork.shapes;

public class Box {
    private int a;
    private int b;
    private int c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public  int calculateVolume() {
        return this.a * this.b * this.c;
    }


    public static void main(String[] args) {
        Box box1 = new Box(1, 2, 3);

        System.out.println(box1.calculateVolume());
    }
}
