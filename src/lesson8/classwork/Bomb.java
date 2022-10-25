package lesson8.classwork;

public class Bomb {
    public static void main(String[] args) throws InterruptedException {

      /*  int i = 10;
        do {
            System.out.println("До взрыва осталось " + i + " сек)");
            Thread.sleep(1000);
            i--;

            if (i == 5) {
                break;
            }
        } while (i >= 0);

        if (i == 0) {
            System.out.println("Boom!!!");
        } else {
            System.out.println("Обезврежена");
        } */

        for (int i = 10; i >=0; i--) {
            System.out.println("До взрыва осталось " + i + " секунд");
            Thread.sleep(1000);
            if (i == 5) {
                System.out.println("Обезвреджена");
                break;
            }
        }
    }
}