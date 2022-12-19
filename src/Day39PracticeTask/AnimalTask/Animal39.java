package Day39PracticeTask.AnimalTask;

import java.security.cert.CertificateRevokedException;

public class Animal39 {
    private String name;
    private String breed;
    private char gender;
    private int age;
    private char size;
    private String color;


    public Animal39(String name, String breed, char gender, int age, char size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()||name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed==null||breed.isEmpty()||breed.isBlank()) {
            System.err.println("Invalid breed");
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='F'||gender=='M')) {
            System.err.println("Invalid Gender");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.err.println("Invalid Age");
        }
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
         if (color==null||color.isEmpty()||color.isBlank()) {
             System.err.println("Invalid color");
                System.exit(1);
    }
        this.color = color;
    }

    public void eat(){

        System.out.println(name+"is eating");
    }

    public void drink(){

        System.out.println(name+"is drinking");


}
public void sleep(){

        System.out.println(name+"is sleeping");


}


    public String toString() {
        return "Animal39{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}