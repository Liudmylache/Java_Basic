package lesson7.homework.plane2;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Aircraft type:","model: " );
        Aerobus aerobus = new Aerobus("Aircraft type:","model: " ,
                "number of economy class passengers: ");
        Boeing boeing = new Boeing("Aircraft type:", "model: ",
                "number of economy class passengers: ", "number of business class passengers: " );

        airplane.printAirplaneInfo();
        aerobus.printAirplaneInfo();
        boeing.printAirplaneInfo();
    }
}
