package week14_AdamInheritance.BankTask;

public class Akbank extends Bank{

    @Override
    public void calculateInterest() {
        System.out.println(getCalpital()*7/1007);
    }
}
