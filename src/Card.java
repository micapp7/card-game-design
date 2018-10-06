public abstract class Card {
    private int faceValue;
    private Suit suit;

    public Card(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public abstract int getFaceValue();

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}
