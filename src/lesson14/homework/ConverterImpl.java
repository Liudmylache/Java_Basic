package lesson14.homework;

public class ConverterImpl implements Converter {
    int celsiusInput;
    int typeOfDegree;

    public ConverterImpl(int celsiusInput, int typeOfDegree) {
        this.celsiusInput = celsiusInput;
        this.typeOfDegree = typeOfDegree;
    }

    @Override
    public void convert(double celsiusInput, int typeOfDegree) {
        if (typeOfDegree == 1) {
            System.out.println(Math.round(celsiusInput * 1.8 + 32));
        } else if (typeOfDegree == 2) {
            System.out.println(Math.round(celsiusInput + 273.15));
        }
        else System.out.println("Please, nex time input 1 or 2 to convert your number :)");
    }
}
