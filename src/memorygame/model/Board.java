
package memorygame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Board {

    private final List<Card> cards;

    public Board() {
        cards = new ArrayList<>();
        initializeCards();
        Collections.shuffle(cards);
    }

    private void initializeCards() {

        String[] values = {"A", "B", "C", "D"};

        int id = 1;

        for (String value : values) {
            cards.add(new Card(id++, value));
            cards.add(new Card(id++, value));
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public boolean allCardsMatched() {

        for (Card card : cards) {
            if (!card.isMatched()) {
                return false;
            }
        }
        return true;
    }
}