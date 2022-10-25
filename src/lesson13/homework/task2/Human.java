package lesson13.homework.task2;

public class Human {
    String name;
    String sex;
    String mothersName;
    String fathersName;

    public Human(String name, String sex, String mothersName, String fathersName) {
        this.name = name;
        this.sex = sex;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
    }

    public String toString() {
        return  "Name: " + name + "(" + sex + ")" + '\n' +
                "Mothers name is " + mothersName +  '\n' +
                "Fathers name is " + fathersName;
    }
}
