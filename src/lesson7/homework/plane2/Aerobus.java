package lesson7.homework.plane2;

public class Aerobus extends Airplane {

    static String economy;

    public Aerobus(String type, String model, String economy) {
        super(type, model);
        this.economy = economy;
    }

    @Override
    public void printAirplaneInfo() {
        System.out.println(type + " Airliner" + ", " + model + "Aerobus 737" + ", " + economy + "120");
    }
}