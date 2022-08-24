package ProjectBasedOnJava.Ex1_3;

public class FDAccount extends Account{

    public int noOfDays;
    public int ageOfAcHoulder;

    public FDAccount() {
        System.out.println("Enter the Average amount in your account: ");
        amount  = super.getValue();

        System.out.println("Enter the number of days: ");
        noOfDays = super.getValue();

        System.out.println("Enter your age: ");
        ageOfAcHoulder = super.getValue();
    }

    @Override
    public double calculateInterest() {
        if(amount < 10000000){
            interestRate = (amount / 100) * getCurrentRateBelowCrore();
        }
        else if(amount >= 10000000){
            interestRate = (amount / 100) * getCurrentRateAboveCrore();
        }
        return interestRate;
    }
    private double getCurrentRateBelowCrore(){
        double rate = 0;
        if(noOfDays >= 7 && noOfDays <= 14)
            if(ageOfAcHoulder > 60) rate =  5.00;
            else rate = 4.50;

        else if(noOfDays >= 15 && noOfDays <= 29)
            if(ageOfAcHoulder > 60) rate =  5.25;
            else rate = 4.75;

        else if(noOfDays >= 30 && noOfDays <= 45)
            if(ageOfAcHoulder > 60) rate =  6;
            else rate = 5.50;

        else if(noOfDays >= 46 && noOfDays <= 60)
            if(ageOfAcHoulder > 60) rate =  7.5;
            else rate = 7;

        else if(noOfDays >= 61 && noOfDays <= 184)
            if(ageOfAcHoulder > 60) rate =  8;
            else rate = 7.5;

        else if(noOfDays >= 185 && noOfDays <= 365)
            if(ageOfAcHoulder > 60) rate = 8.5;
            else rate = 8;
        return rate;
    }
    private double getCurrentRateAboveCrore(){
        double rate = 0;
        if(noOfDays >= 7 && noOfDays <= 14)
            rate = 6.50;

        else if(noOfDays >= 15 && noOfDays <= 29)
            rate = 6.75;
        else if(noOfDays >= 30 && noOfDays <= 45)
            rate = 6.75;
        else if(noOfDays >= 46 && noOfDays <= 60)
            rate = 8;
        else if(noOfDays >= 61 && noOfDays <= 184)
            rate = 8.50;
        else if(noOfDays >= 185 && noOfDays <= 365)
            rate = 10;
        return rate;
    }
}