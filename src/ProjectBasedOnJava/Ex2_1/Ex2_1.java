package ProjectBasedOnJava.Ex2_1;

import java.util.*;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Character, List> cards = new HashMap<>();

        ArrayList s_class = new ArrayList();
        ArrayList d_class = new ArrayList();
        ArrayList c_class = new ArrayList();
        ArrayList h_class = new ArrayList();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            char c = scan.next().charAt(0);
            int v = scan.nextInt();

            switch (c) {
                case 's':
                    s_class.add(new Card(c, v));
                    break;
                case 'd':
                    d_class.add(new Card(c, v));
                    break;
                case 'c':
                    c_class.add(new Card(c, v));
                    break;
                case 'h':
                    h_class.add(new Card(c, v));
                    break;
                default:
                    break;
            }
        }

        cards.put('s', s_class);
        cards.put('d', d_class);
        cards.put('h', h_class);
        cards.put('c', c_class);

        System.out.println("Distinct Symbols are:");
        for(Character entry : cards.keySet()){
            System.out.print(entry);
        }
        for(Map.Entry<Character, List> entry : cards.entrySet()){
            List classList = entry.getValue();
            System.out.println("\nCards in " + entry.getKey() + " Symbol");

            int sumOfNumbers = 0;
            for(int i = 0; i < classList.size(); i++){
                Card card = (Card) classList.get(i);
                System.out.println(card.toString());
                sumOfNumbers += card.getNumber();
            }
            System.out.println("Number of cards: " + classList.size());
            System.out.println("Sum of numbers: " + sumOfNumbers);
        }
    }
}
