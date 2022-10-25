package lesson7.homework.plane2;

public class Airplane {
    static String type;
    static String model;

    public Airplane(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public void printAirplaneInfo(){
        System.out.println(type + " Jet" + ", " + model + "F-22 Raptor");
    }
}
