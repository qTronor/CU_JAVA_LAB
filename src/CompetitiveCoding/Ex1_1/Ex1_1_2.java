package CompetitiveCoding.Ex1_1;

import java.util.Scanner;

public class Ex1_1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
