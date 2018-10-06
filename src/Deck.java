import java.util.*;

public class Deck<T extends Card> {
    private Deque<T> deck;

    public void setDeck(Deque<T> deck) {
        this.deck = deck;
    }

    public void shuffle() {
        System.out.println("Shuffling deck...");
    }

    public int getRemainingCards() {
        return deck.size();
    }

    public Deque<T> dealHand(int number) {
        if (getRemainingCards() < number) {
            return null;
        }

        Deque<T> hand = new ArrayDeque<>(number);
        int count = 0;

        while (number < hand.size()) {
            T card = dealCard();
            if (card != null) {
                hand.addLast(card);

            }
        }

        return hand;
    }

    public T dealCard() {
        if (getRemainingCards() == 0) {
            return null;
        }

        T card = deck.removeLast();


        return card;
    }

    public void print() {
        for(Card card : deck) {
            System.out.println(card);
        }

    }
}
