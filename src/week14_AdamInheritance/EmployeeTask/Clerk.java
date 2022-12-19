package week14_AdamInheritance.EmployeeTask;

public class Clerk extends Employee{
    @Override
    public int salary() {
        return super.salary()+1000;
    }
}
