import java.util.Scanner;

public class Player extends Actor {
    private static Scanner in = new Scanner(System.in);

    public Player(int x, int y) {
        super(x, y);    // Call the superclass' constructor using these parameters.
        this.sprite = "\033[35;42m@\033[0m";
    }

    @Override
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
}
