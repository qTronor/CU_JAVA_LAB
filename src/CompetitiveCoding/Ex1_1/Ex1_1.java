package CompetitiveCoding.Ex1_1;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for(int j = 0; j < n / 2; j++){
            int t = arr[j];
            arr[j] = arr[n - 1 - j];
            arr[n-1 - j] = t;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
