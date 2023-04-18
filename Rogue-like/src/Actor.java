public class Actor {
    
    protected String sprite = "*";
    protected int x, y;

    public Actor(int x, int y) {
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

    /**
     * Read user input and update state/perform actions.
     * Call this method every iteration of the main game loop.
     * @param game The game object this is currenly inside of.
     */
    public void act(Game game) {
    }

    /**
     * Move by specified amount.
     * @param xChange Amount to move by on x-axis.
     * @param yChange Amount to move by on y-axis.
     */
    protected void move(int xChange, int yChange) {
        // TODO: Validate the values.
        this.x += xChange;
        this.y += yChange;
    }
}
