package week14_AdamInheritance.EmployeeTask;

public class Manager extends Employee{
    @Override
    public int salary() {
        return super.salary()+2000;// gettersalary gibi
    }
}
