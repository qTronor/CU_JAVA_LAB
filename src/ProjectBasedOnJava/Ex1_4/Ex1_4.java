package ProjectBasedOnJava.Ex1_4;

import java.util.*;

public class Ex1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Character, Object> cards = new HashMap<>();

        while(cards.size() < 4) {
            char c = scan.next().charAt(0);
            int v = scan.nextInt();
            if(cards.containsValue(new Card(c, v)) == false) cards.put(c, new Card(c, v));
            else continue;
        }
        for(Map.Entry<Character, Object> entry : cards.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
