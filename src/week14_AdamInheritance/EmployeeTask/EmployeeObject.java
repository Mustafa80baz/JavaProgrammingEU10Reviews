package week14_AdamInheritance.EmployeeTask;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee=new Employee();

        System.out.println(employee.salary());//base salary

        Manager manager=new Manager();
        System.out.println(manager.salary());//base manager farkı eklenmiş hali

        Clerk clerk=new Clerk();
        System.out.println(clerk.salary());
        
    }
}
