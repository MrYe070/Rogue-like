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

    public void act(Game game) {
        Player player = game.getPlayer();
        int xChange = player.getX() - this.x;
        int yChange = player.getY() - this.y;

        if (xChange > 0) {
            move(1, 0);
        }
        else if (xChange < 0) {
            move(-1, 0);
        }
        else if (yChange > 0) {
            move(0, 1);
        }
        else if (yChange < 0) {
            move(0, -1);
        }
    }

        /**
     * Move by specified amount.
     * @param xChange Amount to move by on x-axis.
     * @param yChange Amount to move by on y-axis.
     */
    private void move(int xChange, int yChange) {
        // TODO: Validate the values.
        this.x += xChange;
        this.y += yChange;
    }
}
