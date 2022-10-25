package lesson13.classwork;

public class Bicycle {
    public String model;
    public int weight;

    public static String abc;

    public class SteeringWheel {
        public void left() {
            System.out.println("left");
        }
        public void right() {
            System.out.println("right");
        }
    }

    static public class Seat {
        public void up() {
            System.out.println("up");
        }
        public void down() {
            System.out.println("down");
        }
    }
}
