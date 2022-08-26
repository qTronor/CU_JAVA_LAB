package ProjectBasedOnJava.Ex1_3;

public class RDAccount extends Account{
    public RDAccount() {
        System.out.println("Enter the Average amount in your account: ");
        amount  = super.getValue();

        System.out.println("Enter the number of days: ");
        //noOfMonths = super.getValue();

        System.out.println("Enter your age: ");
        //ageOfAcHoulder = super.getValue();
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
