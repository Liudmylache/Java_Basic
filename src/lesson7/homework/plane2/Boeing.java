package lesson7.homework.plane2;

public class Boeing extends Airplane {

    static String economy;
    static String business;

    public Boeing(String type, String model, String economy, String business) {
        super(type, model);
        this.economy = economy;
        this.business = business;
    }

    @Override
    public void printAirplaneInfo(){
        System.out.println(type + " Airliner" + ", " + model + "Boeing 777" + ", "
                + economy + "180" + ", " + business + "180");
    }
}
