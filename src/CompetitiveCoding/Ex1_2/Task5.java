package CompetitiveCoding.Ex1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
        public static void main(String [] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            int tank = 0;
            int result = -1;
            for (int loop = 0; loop < n; loop++) {
                int net = in.nextInt() - in.nextInt();
                if (tank + net > 0) {
                    if (result == -1) {
                        result = loop;
                    }
                    list.add(net);
                    tank += net;
                } else {
                    list.clear();
                    tank = 0;
                    result = -1;
                }
            }
            System.out.println(result);
            in.close();
        }
}
