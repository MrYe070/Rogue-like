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
     */
    public void act() {
        String input = in.nextLine();
        if (input.equalsIgnoreCase("W")) {
            this.move(0, -1);
        }
        else if (input.equalsIgnoreCase("S")) {
            this.move(0, 1);
        }
        else if (input.equalsIgnoreCase("A")) {
            this.move(-1, 0);
        }
        else if (input.equalsIgnoreCase("D")) {
            this.move(1, 0);
        }
    }

    private void move(int xChange, int yChange) {
        // TODO: Validate the values.
        this.x += xChange;
        this.y += yChange;
    }
}
