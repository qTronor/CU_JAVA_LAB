package CompetitiveCoding.Ex1_4;

import java.util.Scanner;
import java.util.Stack;

public class Ex1_4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] brr = new int[m];

        for(int j = 0; j < m; j++){
            brr[j] = scan.nextInt();
        }

        int[] ans = missingNumbers(arr, brr);

        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] missingNumbers(int[] arr, int[] brr){
        int n;
        if(arr.length > brr.length) n = brr.length;

        else n = arr.length;

        Stack miss = new Stack();

        for(int i = 0, j = 0; i < n; i++, j++){
            if(arr[i] != brr[j]){
                if(!miss.contains(brr[j])) miss.push(brr[j]);

                i--;
            }
        }
        int[] ans = new int[miss.size()];
        int size = miss.size();

        for(int i = 0; i < size; i++){
            ans[i] = (int) miss.pop();
        }
        ans = sort(ans);
        return ans;
    }
    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        return arr;
    }
}
