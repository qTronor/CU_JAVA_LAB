package ProjectBasedOnJava.Ex1_4;

public class Card {

    public char symbol;
    public int number;

    public Card(char symbol, int number){
        this.symbol = symbol;
        this.number = number;
    }
    @Override
    public String toString() {
        return symbol + " " +number;
    }
}
