package CompetitiveCoding.Ex1_1;

import java.util.Scanner;

public class Ex1_1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();

        int[][] arr = new int[n][n];
        int first = 0;
        int second = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scan.nextInt();
                if(i == j)
                    first += arr[i][j];
                if(i == n - j - 1){
                    second += arr[i][j];
                }
            }
        }
        System.out.println(Math.abs(first - second));
    }
}
