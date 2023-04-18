public class Enemy {
    private String sprite = "\033[32mB\033[0m";
    private int x, y;

    public Enemy(int x, int y) {
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
}
