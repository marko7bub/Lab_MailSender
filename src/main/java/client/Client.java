package client;

import lombok.Getter;

@Getter
public class Client {
    private static int idCounter = 0;
    private int id;
    private String name;
    private int age;
    private Sex sex;


    public Client(String name, int age, Sex sex) {
        idCounter += 1;
        this.id = idCounter;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
