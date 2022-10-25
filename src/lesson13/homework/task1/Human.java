package lesson13.homework.task1;

public class Human {
    String name;
    String mothersName;
    String fathersName;
    String sex;

    public Human(String name, String mothersName, String fathersName, String sex) {
        this.name = name;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.sex = sex;
    }

    public Human(String name) {
        this.name = name;
    }

    public String toString() {
        return " " + name;
    }
}
