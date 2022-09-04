package CompetitiveCoding.Ex1_1;

import java.util.Scanner;

public class Ex1_1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        int first = 0;
        int second = 0;

        for(int i = 0; i < 3; i++){
            arr1[i] = scan.nextInt();
        }
        for(int i = 0; i < 3; i++){
            arr2[i] = scan.nextInt();
        }
        for(int i = 0; i < 3; i++){
            if(arr1[i] > arr2[i])
                first++;
            else if(arr1[i] < arr2[i])
                second++;
            else
                continue;
        }
        System.out.println(first + " " + second);
    }
}
