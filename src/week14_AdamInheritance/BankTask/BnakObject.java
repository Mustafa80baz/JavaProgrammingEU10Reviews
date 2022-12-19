package week14_AdamInheritance.BankTask;

public class BnakObject {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.calculateInterest();//interest of bank yazısını yazar

        Akbank akbank=new Akbank();
        akbank.calculateInterest();//bu da akbankın fazini hesaplar yazar
        System.out.println("--------------------------------------------");

        GarantiBank garantiBank=new GarantiBank();
        garantiBank.calculateInterest();

    }
}
