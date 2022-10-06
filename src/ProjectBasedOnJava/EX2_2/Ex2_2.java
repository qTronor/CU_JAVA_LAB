package ProjectBasedOnJava.EX2_2;

import java.util.*;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Character, Object> cards = new HashMap<>();

        while(cards.size() < 4) {
            char c = scan.next().charAt(0);
            int v = scan.nextInt();
            if(cards.containsKey(c) == false) cards.put(c, new Card(c, v));
            else continue;
        }
        for(Map.Entry<Character, Object> entry : cards.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
