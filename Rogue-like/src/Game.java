public class Game {
    private String[][] map;
    private Player player;

    public void loadMap(String filename) {
        this.map = Map.loadGrid(filename);
    }

    public void display() {
        // Create a copy of the map grid.
        String[][] mapCopy = Utils.copyOf(this.map);

        // Inside the grid copy, replace tile at player's position with player sprite.
        if (player != null && isInBounds(player.getX(), player.getY())) { // check that player has been added, and is within map bounds.
            mapCopy[player.getY()][player.getX()] = player.getSprite();
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
