
package memorygame.model;


public class MatchEngine {
    public boolean isMatch(Card first, Card second) {

        if (first == null || second == null) {
            return false;
        }

        return first.getValue().equals(second.getValue());
    }
}

