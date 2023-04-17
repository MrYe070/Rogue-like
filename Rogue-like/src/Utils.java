public class Utils {
    /**
     * Creates and returns a clone of the specified 2D array.
     * @param grid 2D array to be cloned.
     * @return The cloned array.
     */
    public static String[][] copyOf(String[][] grid) {
        String[][] copy = new String[grid.length][];

        for (int row = 0; row < grid.length; row++) {
            copy[row] = new String[grid[row].length];
            
            for (int col = 0; col < grid[row].length; col++) {
                copy[row][col] = grid[row][col];
            }
        }

        return copy;
    }
}
