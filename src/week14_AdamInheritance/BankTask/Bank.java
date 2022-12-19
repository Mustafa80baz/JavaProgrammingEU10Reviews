package week14_AdamInheritance.BankTask;

public class Bank {
    private int capital =10000;
    public int getCalpital (){
        return capital;
    }

    public void calculateInterest(){
        System.out.println("Intereset of the "+getClass().getSimpleName());

    }
  /*
    Task 1:

Create a Bank class which has a functionality( calculateRateOfInterest(int capital)) that calculates the rate of interest.
However, the rate of interest varies according to banks.

class GarantiBank ----> 8%
class AkBank      ----> 7%
class INGBank     ----> 9%

rate of interest.


   */
}
