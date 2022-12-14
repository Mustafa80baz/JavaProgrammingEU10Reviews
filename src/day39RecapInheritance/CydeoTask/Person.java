package day39RecapInheritance.CydeoTask;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isEmpty()||name.isBlank()){
            System.out.println("Invalid Name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='F'||gender=='M')){
            System.out.println("Invalid Gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
    public void eat(){
        System.out.println( name+"is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+"is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
/*
   1- Create a class named Person:
    Verialbes: name ,age,gender
    Encapsulate all the field
    Methods:eat(),dring(),sleep(),toString()
    Add a constructor to set all the fields
    2-Creat ea sub class of person named employee:
    Extra veraiable:employee Id,Jobtitle,salary
    Encapsulate all the fields
    Add a constructor to set all the fields
     Methods:work(),toString()
     3-Creat ea sub class of person named employee named Tester


     */
}
