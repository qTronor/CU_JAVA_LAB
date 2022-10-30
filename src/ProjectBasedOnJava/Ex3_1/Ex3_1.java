package ProjectBasedOnJava.Ex3_1;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int n = str.length();
        if (n < 2)
            System.out.println("Length < 2");
        int maxLength = 1,start=0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;
            while ( high < n && str.charAt(high) == str.charAt(i))
                high++;

            while ( low >= 0 && str.charAt(low) == str.charAt(i))
                low--;

            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
                low--;
                high++;
            }

            int length = high - low - 1;
            if (maxLength < length){
                maxLength = length;
                start=low+1;
            }
        }
        System.out.println(str.substring(start, start + maxLength ));
    }
}
