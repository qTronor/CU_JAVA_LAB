package CompetitiveCoding.Ex1_3;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex_1_3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        if (t >= 1 && t <= 10) {
            for (int i = 0; i < t; i++) {
                System.out.println(linkMethd());
            }
        }
    }

    public static int linkMethd() {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n != m) return 0;

        if (n >= 1 && n <= 1000 && m >= 1 && m <= 1000) {

            for (int j = 0; j < n; j++) {
                int q = sc.nextInt();
                if (q >= 1 && q <= 1000) first.add(q);
                else return 0;
            }
            for (int k = 0; k < m; k++) {
                int w = sc.nextInt();
                if (w >= 1 && w <= 1000) second.add(w);
                else return 0;
            }
        } else return 0;

        for (int l = 0; l < n; l++) {
            if (first.get(l) == second.get(l)) continue;
            else return 0;
        }
        return 1;
    }
}
