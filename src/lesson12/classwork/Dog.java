package lesson12.classwork;

public class Dog {

    String breed;
    String size;
    int age;
    String color;

    public Dog() {
        System.out.println("Dog has been created!");
    }

    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void run() {
        System.out.println("dog runs");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            return size.equals(dog.size) && age == dog.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
