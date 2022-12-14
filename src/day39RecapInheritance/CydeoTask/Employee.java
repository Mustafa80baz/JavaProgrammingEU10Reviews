package day39RecapInheritance.CydeoTask;

public class Employee extends Person{
  private int employeeId;
  private String jobTitle;
  private double salary;

    public int getEmployee() {
        return employeeId;
    }

    public void setEmployee(int employee) {
        if (salary<=0){
            System.out.println("Invalid salary");
        }
        this.employeeId = employee;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+"is workin");
    }

    public Employee(String name, int age, char gender, int employee, String jobTitle, double salary) {
        super(name, age, gender);
       setEmployee(employee);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                 "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

