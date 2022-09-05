package ProjectBasedOnJava.assignment;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String separator = scan.nextLine();

        int times = scan.nextInt();

        String result = word;

        for(int i = 0; i < times - 1; i++){
            result += separator;
            result += word;
        }
        System.out.println(result);
    }
}
