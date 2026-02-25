package memorygame.view;
import memorygame.model.Card;
import java.util.List;
public class GameView {
    public void displayBoard(List<Card> cards) {

        System.out.println("=== MEMORY GAME BOARD ===");

        for (Card card : cards) {

            if (card.isMatched() || card.isFlipped()) {
                System.out.print(card.getValue() + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
    }

    public void showMoves(int moves) {
        System.out.println("Moves: " + moves);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
