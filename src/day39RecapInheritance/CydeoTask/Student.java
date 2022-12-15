package day39RecapInheritance.CydeoTask;

public class Student extends Person {
    private String studentID;
    private String fieldofStady;


    public Student(String name, int age, char gender, String studentID, String fieldofStady) {
        super(name, age, gender);
       setStudentID(String.valueOf(studentID));
        setFieldofStady(fieldofStady);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldofStady() {
        return fieldofStady;
    }

    public void setFieldofStady(String fieldofStady) {
        this.fieldofStady = fieldofStady;
    }
    public void study(){
        System.out.println(getName()+"is studying");
    }

    public String toString() {
        return "Student{" +
                 "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID='" + studentID + '\'' +
                ", fieldofStady='" + fieldofStady + '\'' +
                '}';
    }
}
