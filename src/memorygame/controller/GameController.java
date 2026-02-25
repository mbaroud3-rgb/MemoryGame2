
package memorygame.controller;

import memorygame.model.Game;
import memorygame.view.GameView;
public class GameController {
    private final Game game;
    private final GameView view;

    public GameController() {
        game = new Game();
        view = new GameView();
    }

    public void startGame() {

        game.startGame();

        view.showMessage("Game Started!");
        view.displayBoard(game.getBoard().getCards());
        view.showMoves(game.getStats().getMoves());
    }

    public void flipCard(int index) {

        game.flipCard(index);

        view.displayBoard(game.getBoard().getCards());
        view.showMoves(game.getStats().getMoves());

        if (game.isFinished()) {
            view.showMessage("Game Finished!");
        }
    }
}


