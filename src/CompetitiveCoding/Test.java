package CompetitiveCoding;

import java.awt.*;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(((a == 0) || (a<0) && (b<0))||(a == b && b == 0)) System.out.println("no such x");

        else if ((a == 0) || (-b/a < 0 && a > 0)) System.out.println("any x");

        else if(((a < 0) && (-b/a > 0)) || ((a < 0) && (-b/a > 0))) System.out.println();
        //a * Math.abs(x) + b >0
    }
}
