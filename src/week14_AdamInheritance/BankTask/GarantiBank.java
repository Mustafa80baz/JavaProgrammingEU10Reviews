package week14_AdamInheritance.BankTask;

public class GarantiBank extends Bank{
    @Override
    public void calculateInterest() {
        System.out.println(getCalpital()*8/100);
    }
}
