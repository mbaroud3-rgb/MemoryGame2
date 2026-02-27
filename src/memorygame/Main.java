package memorygame;

import memorygame.controller.GameController;

public class Main {

    public static void main(String[] args) {

        GameController controller = new GameController();

        // بدء اللعبة
        controller.startGame();

        // تجربة قلب بطاقتين
        controller.flipCard(0);
        controller.flipCard(1);
       // Git test2
       //push test
    }
}
    

