package lesson6.classwork.animals;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat(4);
        cat1.age = 3;
        System.out.println(cat1.getName());

        Whale cat2 =  new Cat(4);
        //Employee lucy = new Recruiter();

        Cow cow = new Cow();
        System.out.println(cow.getName());

        Whale whale = new Whale();
        whale.test();
        System.out.println(whale.getName());


        Cow whaleCow = new Whale();

        if (whaleCow instanceof Whale) {
            ((Whale) whaleCow).test();
        }
        System.out.println(whaleCow.getName());
    }

}
