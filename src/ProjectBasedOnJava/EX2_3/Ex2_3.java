package ProjectBasedOnJava.EX2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_3 {

    static List list = new ArrayList<String>();

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Insert\n" +
                "2. Search\n" +
                "3. Delete\n" +
                "4. Display\n" +
                "5. Exit\n" +
                "Enter your choice : ");
        switch (scanner.nextInt()){
            case 1: insert(); break;
            case 2: search(); break;
            case 3: delete(); break;
            case 4: display(); break;
            case 5: return;
            default: return;
        }
    }

    public static void insert(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the item to be inserted: ");
        list.add(scanner.next());
        System.out.println("Inserted successfully.\n");

        menu();
    }

    public static void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item to search : ");
        String item = scanner.next();

        if(list.contains(item)) System.out.println("Item found in the list.\n");
        else System.out.println("Item not found in the list.\n");
        /*for(int i = 0; i < list.size(); i++){
            if(list.get(i) == item){
                System.out.println("Item found in the list.");
                break;
            }
            if(i == list.size() - 1) System.out.println("Item not found in the list.");
        }*/
        menu();
    }

    public static void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item to delete : ");
        String item = scanner.next();

        if(list.remove(item)) System.out.println("Item deleted.\n");
        else System.out.println("Item does not exist.\n");

        menu();
    }

    public static void display(){
        for(Object item : list){
            System.out.println(item);
        }
        System.out.println("");
        menu();
    }
}
