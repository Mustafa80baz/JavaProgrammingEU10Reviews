package week14_AdamInheritance.BankTask;

public class INGBank extends Bank {

    @Override
    public void calculateInterest() {
        System.out.println(getCalpital()*9/100);
    }
}
