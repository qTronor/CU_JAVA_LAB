package ProjectBasedOnJava.Ex1_3;

import java.util.Scanner;

public class Ex1_3_Launcher {
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Select the option: \nSelect the option:\n" +
                "1. Interest Calculator –SB\n" +
                "2. Interest Calculator –FD\n" +
                "3. Interest Calculator –RD\n" +
                "4. Exit");

        Scanner scan = new Scanner(System.in);
        try {
            choice = scan.nextInt();
            if(choice < 0){
                System.out.println("Amount < 0");
                return;
            }
        }
        catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
        switch(choice){
            case 1:
                SBAccount SBAccount = new SBAccount();
                System.out.println("Interest gained: " + (int)SBAccount.calculateInterest());
                break;

            case 2:
                FDAccount FDAccount = new FDAccount();
                System.out.println("Interest gained: " + (int)FDAccount.calculateInterest());
                break;

            case 3:
                RDAccount RDAccount = new RDAccount();
                System.out.println("Interest gained: " + (int)RDAccount.calculateInterest());
                break;

            case 4:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("We don't have information about this option");
        }

    }
}
