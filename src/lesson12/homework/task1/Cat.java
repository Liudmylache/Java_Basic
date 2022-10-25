package lesson12.homework.task1;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    int weight;
    String breed;

    public Cat(int i) {
        System.out.println("Cat has been created!");
    }

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Your cat's information:" + '\n' +
                "name = " + this.name + '\n' +
                "age = " + this.age + '\n' +
                "weigh = " + this.weight + '\n' +
                "breed = " + this.breed + '\n';
    }

    public boolean equals(Object anothercat) {
        if (anothercat instanceof Cat) {
            Cat cat = (Cat) anothercat;
            return Objects.equals(this.weight, cat.weight) && this.age == cat.age;
        }
        return false;
    }

    public void mew (){
        System.out.println("meow, meow, meow..." + '\n');
    }
}
