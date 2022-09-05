package ProjectBasedOnJava.assignment;

import java.util.Scanner;

public class task9 {
    /*
    Write a program to initialize an integer array with values and check if a given number is present in the array or not.
    If the number is not found, it will print -1 else it will print the index value of the given number in the array.
    Array elements are {1,4,34,56,7} and the search element is 90 O/P: -1
    Array elements are {1,4,34,56,7} and the search element is 56 O/P: 4
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        for(int i = 0; i < n; i++){
            if(arr[i] == num)
                System.out.println(i + 1);
            else if(i == n - 1){
                System.out.println(-1);
                break;
            }
        }
    }
}
