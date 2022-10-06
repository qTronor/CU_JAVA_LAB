package CompetitiveCoding.Ex1_4;

import java.util.Scanner;

public class Ex1_4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(minimumLoss(arr));
    }
    public static int minimumLoss(int[] arr){
        long min = (long) Math.pow(10, 16);
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] - arr[j] < min && arr[i] - arr[j] > 0) min = arr[i] - arr[j];
            }
        }
        return (int)min;
    }
}
