package lesson13.classwork;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
       /* Bicycle.SteeringWheel steeringWheel = new Bicycle.SteeringWheel();
        steeringWheel.left();
        */

        Bicycle.Seat seat = new Bicycle.Seat();
        seat.up();

        Bicycle.Seat seat1 = new Bicycle.Seat();
        seat1.down();
    }
}
