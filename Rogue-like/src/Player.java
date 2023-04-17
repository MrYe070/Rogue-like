import java.util.Scanner;

public class Player {
    private static Scanner in = new Scanner(System.in);

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

    /**
     * Read user input and update state/perform actions.
     * Call this method every iteration of the main game loop.
     * @param game The game object this is currenly inside of.
     */
    public void act(Game game) {
        String input = in.nextLine();
        int xChange = 0, yChange = 0;
        if (input.equalsIgnoreCase("W")) {
            yChange = -1;
        }
        else if (input.equalsIgnoreCase("S")) {
            yChange = 1;
        }
        else if (input.equalsIgnoreCase("A")) {
            xChange = -1;
        }
        else if (input.equalsIgnoreCase("D")) {
            xChange = 1;
        }

        if (game.canMoveHere(this.getX() + xChange, this.getY() + yChange))
            this.move(xChange, yChange);
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
