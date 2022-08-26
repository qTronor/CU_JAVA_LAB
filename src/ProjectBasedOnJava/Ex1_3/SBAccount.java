package ProjectBasedOnJava.Ex1_3;

public class SBAccount extends Account{

    private int typeOfAccount;
    public SBAccount() {
        System.out.println("Enter type of your Account:\n 1 - Normal\n 2 - NRI ");
        typeOfAccount  = super.getValue(2);

        System.out.println("Enter the Average amount in your account: ");
        amount  = super.getValue();
    }

    @Override
    public double calculateInterest() {
        if(typeOfAccount == 1)
            return (amount / 100) * 4;

        else if(typeOfAccount == 2)
            return (amount / 100) * 6;

        else{
            System.out.println("You entered the wrong number");
            return 0;
        }
    }
}
