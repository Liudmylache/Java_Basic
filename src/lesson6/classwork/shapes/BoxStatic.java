package lesson6.classwork.shapes;

public class BoxStatic {
    private static int calculateVolumeStat(int a, int b, int c){
        return a * b * c;
    }

    public static void main(String[] args){
        //System.out.println(calculateVolumeStat(1,2,3));
        int volume = calculateVolumeStat(1,2,3);
        System.out.println(volume);
    }
}
