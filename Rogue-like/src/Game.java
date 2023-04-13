public class Game {
    private String[][] map;

    public void loadMap(String filename) {
        this.map = Map.loadGrid(filename);
    }

    public void display() {
        for (int i = 0; i < this.map.length; i++) { // for each row of the 2D array
            for (int j = 0; j < this.map[i].length; j++) {  // for each element of the ith row
                System.out.print(this.map[i][j]);     // print element on ith row, jth column
            }
            System.out.println();
        }
    }
}
