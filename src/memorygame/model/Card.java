
package memorygame.model;

public class Card {

    private final int id;
    private final String value;
    private boolean flipped;
    private boolean matched;

    public Card(int id, String value) {
        this.id = id;
        this.value = value;
        this.flipped = false;
        this.matched = false;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }
}
