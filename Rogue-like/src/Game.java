import java.util.ArrayList;

public class Game {
    private String[][] map;
    private Player player;
    public ArrayList<Actor> actors = new ArrayList<>();    // TODO: Change back to private!!!

    public void loadMap(String filename) {
        this.map = Map.loadGrid(filename);
    }

    public void display() {
        // Create a copy of the map grid.
        String[][] mapCopy = Utils.copyOf(this.map);

        // Inside the grid copy, replace tile at each Actor's position with Actor's sprite.
        for (int i = 0; i < actors.size(); i++) {
            Actor actor = actors.get(i);
            if (isInBounds(actor.getX(), actor.getY())) { // check that actor is within map bounds.
                mapCopy[actor.getY()][actor.getX()] = actor.getSprite();
            }
        }

        // Print out the grid copy.

        for (int i = 0; i < mapCopy.length; i++) { // for each row of the 2D array
            for (int j = 0; j < mapCopy[i].length; j++) {  // for each element of the ith row
                System.out.print(mapCopy[i][j]);
            }
            System.out.println();
        }
    }

    public void addPlayer(Player player) {
        this.player = player;
        this.actors.add(player);
    }

    public Player getPlayer() {
        return this.player;
    }

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public boolean canMoveHere(int x, int y) {
        if (!isInBounds(x, y))
            return false;

        String tile = map[y][x];
        return tile.equals(" ");
    }

    /**
     * Check whether position is within map bounds.
     * @param x x-coordinate
     * @param y y-coordinate
     * @return True if within bounds, false otherwise.
     */
    private boolean isInBounds(int x, int y) {
        if (0 <= y && y < this.map.length && 0 <= x && x < this.map[y].length) {
            return true;
        }

        return false;
    }
}
