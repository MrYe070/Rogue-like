public class Enemy extends Actor {

    public Enemy(int x, int y) {
        super(x, y);    // Call the superclass' constructor using these parameters.
        this.sprite = "\033[32mB\033[0m";
    }

    @Override
    // Overrides the act method inherited from Actor superclass.
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
}
