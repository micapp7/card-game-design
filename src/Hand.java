import java.util.ArrayDeque;
import java.util.Deque;

public class Hand<T extends Card> {
    Deque<T> cards = new ArrayDeque<>();

    public int score() {
        int score = 0;
        for(T card : cards) {
            score += card.getFaceValue();
        }

        return score;
    }

    public void addCard(T card) {
        cards.addLast(card);
    }

    public void print() {
        for (Card card : cards ) {
            System.out.println(card.toString());
        }
    }

}
