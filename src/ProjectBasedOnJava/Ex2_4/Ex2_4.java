package ProjectBasedOnJava.Ex2_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_4 {
    public static List<Emp> employers = new ArrayList<Emp>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Main menu\n 1. Add an Employee\n 2. Display All\n 3.Exit");

        switch(scanner.nextInt()){
            case 1: addEmployee(); break;
            case 2: displayAll(); break;
            case 3: return;
            default: return;
        }
    }
    public static void addEmployee(){
        Scanner scanner = new Scanner(System.in);
        int id, salary;
        String name;
        byte age;

        System.out.println("\nEnter Employee ID:");
        id = scanner.nextInt();
        System.out.println("Enter Employee Name:");
        name = scanner.next();
        System.out.println("Enter Employee age");
        age = scanner.nextByte();
        System.out.println("Enter Employee Salary");
        salary = scanner.nextInt();

        employers.add(new Emp(id, name, age, salary));
        System.out.println();
        menu();
    }
    public static void displayAll(){
        System.out.println("\n----Report----");
        for (Emp e: employers){
            System.out.println(e.toString());
        }
        System.out.println("----End of Report----\n");
        menu();
    }

}
