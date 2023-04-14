public class Player {
    private String sprite = "\033[35;42m@\033[0m";
    private int x, y;

    public Player(int x, int y) {
        // TODO: Check that the coords are valid.
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getSprite() {
        return this.sprite;
    }

    public void move(int xChange, int yChange) {
        // TODO: Validate the values.
        this.x += xChange;
        this.y += yChange;
    }
}
