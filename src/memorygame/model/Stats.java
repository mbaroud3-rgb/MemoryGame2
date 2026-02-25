
package memorygame.model;


public class Stats {
    private int moves;

    public Stats() {
        moves = 0;
    }

    public void incrementMoves() {
        moves++;
    }

    public int getMoves() {
        return moves;
    }

    public void reset() {
        moves = 0;
    }
}
