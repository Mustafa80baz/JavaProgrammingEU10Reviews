package day39RecapInheritance.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Devloper developer=new Devloper("Salih",23,'M',2343,"develeopoer",20000);

        Tester tester=new Tester("Numan",24,'M',2012,"tester",230404);

        Teacher teacher=new Teacher("Mustafa",47,'M',234,"Teacher",456789);
        Student student=new Student("Nihal",10,'F',"12","SDET");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println( teacher);
        System.out.println( student);

        System.out.println("---------------------------------------------");
        developer.setAge(39);//capsullenmiş bir veriyi ancak get ve set kullnarak cagırıp değiştirebiliriz
        developer.getAge();
        System.out.println(developer);
        System.out.println("------------------------------------");
        developer.work();
        teacher.eat();
        student.eat();



    }
}
