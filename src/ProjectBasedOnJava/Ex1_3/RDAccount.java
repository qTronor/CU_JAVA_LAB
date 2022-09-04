package ProjectBasedOnJava.Ex1_3;

public class RDAccount extends Account{

    double amount;
    int noOfMonths;
    int ageOfAcHoulder;

    double interestGain = 0.0;

    public RDAccount() {
        System.out.println("Enter the Average amount in your account: ");
        amount  = super.getValue();

        System.out.println("Enter the number of days: ");
        noOfMonths = super.getValue();

        System.out.println("Enter your age: ");
        ageOfAcHoulder = super.getValue();
    }

    @Override
    public double calculateInterest() {
        if(ageOfAcHoulder>=65){
            if(noOfMonths>=6 && noOfMonths<9){
                interestGain = (amount*8.00)/100;
            }
            else if(noOfMonths>=9 && noOfMonths<12){
                interestGain = (amount*8.25)/100;
            }
            else if(noOfMonths>=12 && noOfMonths<15){
                interestGain = (amount*8.50)/100;
            }
            else if(noOfMonths>=15 && noOfMonths<18){
                interestGain = (amount*8.75)/100;
            }
            else if(noOfMonths>=18 && noOfMonths<21){
                interestGain = (amount*9.00)/100;
            }
            else if(noOfMonths>=21 && noOfMonths<=24){
                interestGain = (amount*9.25)/100;
            }
            //System.out.println("Interestgain "+ interestGain);
        }
        else{
            if(noOfMonths>=6 && noOfMonths<9){
                interestGain = (amount*7.50)/100;
            }
            else if(noOfMonths>=9 && noOfMonths<12){

                interestGain = (amount*7.75)/100;
            }
            else if(noOfMonths>=12 && noOfMonths<15){
                interestGain = (amount*8.00)/100;
            }
            else if(noOfMonths>=15 && noOfMonths<18){
                interestGain = (amount*8.25)/100;
            }
            else if(noOfMonths>=18 && noOfMonths<21){
                interestGain = (amount*8.50)/100;
            }
            else if(noOfMonths>=21 && noOfMonths<=24){
                interestGain = (amount*8.75)/100;
            }
            //System.out.println("Interestgain "+ interestGain);
        }
        return interestGain;
    }
}
