package day39RecapInheritance.CydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTiket(){
        System.out.println(getJobTitle()+" "+getName()+"is creating ticket");
    }
}
