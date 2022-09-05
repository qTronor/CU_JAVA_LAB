package ProjectBasedOnJava.assignment;

import java.util.Scanner;

public class task1 {
    /*
    Write a program to print the sum of the elements of the array with the given below condition.
    If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();

            if(arr[i] == 6){
                while(arr[i] != 7) {
                    i++;
                    arr[i] = scan.nextInt();
                }
            }
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
