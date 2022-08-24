package ProjectBasedOnJava.Ex1_3;

import java.util.Scanner;

public abstract class Account {
    public double interestRate;
    public double amount;

    public abstract double calculateInterest();

    public int getValue(){
        int number = 0;
        Scanner scan = new Scanner(System.in);
        try {
            number = scan.nextInt();
            if(number < 0){
                System.out.println("Invalid Number entered. Please enter correct values.");
                throw new Exception("Invalid Number entered. Please enter correct values.");
            }
        }
        catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
        return number;
    }
}
