package day39RecapInheritance.CydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employee, String jobTitle, double salary) {
        super(name, age, gender, employee, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+"is teaching");
    }
}
