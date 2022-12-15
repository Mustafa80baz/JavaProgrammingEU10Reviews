package day39RecapInheritance.CydeoTask;

public class Devloper extends Employee{


    public Devloper(String name, int age, char gender, int employee, String jobTitle, double salary) {
        super(name, age, gender, employee, jobTitle, salary);
    }
    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+"is fixing the bugs");
    }

    @Override
    public void work() {
       System.out.println(getJobTitle()+" "+getName()+"is fworking");

    }
}
