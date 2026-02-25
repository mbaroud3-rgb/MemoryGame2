
package memorygame.model;
import java.util.List;

public class Game {
    private final Board board;
    private final MatchEngine matchEngine;
    private final Stats stats;

    private Card firstCard;
    private Card secondCard;

    public Game() {
        board = new Board();
        matchEngine = new MatchEngine();
        stats = new Stats();
    }

    // بدء اللعبة
    public void startGame() {
        stats.reset();
        firstCard = null;
        secondCard = null;
    }

    // قلب بطاقة
    public void flipCard(int index) {

        List<Card> cards = board.getCards();

        if (index < 0 || index >= cards.size()) {
            return;
        }

        Card selected = cards.get(index);

        if (selected.isFlipped() || selected.isMatched()) {
            return;
        }

        selected.setFlipped(true);

        if (firstCard == null) {
            firstCard = selected;
        } else {
            secondCard = selected;
            stats.incrementMoves();
            checkMatch();
        }
    }

    private void checkMatch() {

        if (matchEngine.isMatch(firstCard, secondCard)) {
            firstCard.setMatched(true);
            secondCard.setMatched(true);
        } else {
            firstCard.setFlipped(false);
            secondCard.setFlipped(false);
        }

        firstCard = null;
        secondCard = null;
    }

    // هل انتهت اللعبة؟
    public boolean isFinished() {
        return board.allCardsMatched();
    }

    public Board getBoard() {
        return board;
    }

    public Stats getStats() {
        return stats;
    }
}

