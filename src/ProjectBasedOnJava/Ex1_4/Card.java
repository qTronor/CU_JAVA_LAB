package ProjectBasedOnJava.Ex1_4;

public class Card {

    public char symbol;
    public int number;

    public Card(char symbol, int number){
        this.symbol = symbol;
        this.number = number;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "symbol=" + symbol +
                ", number=" + number +
                '}';
    }
}
