import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        String[][] map = loadGrid("map1.txt");
        for (String[] row : map) {
            for (String tile : row) {
                System.out.print(tile);
            }
            System.out.println();
        }
    }


    public static String[][] loadGrid(String filename) {
        try (Scanner in = new Scanner(new FileReader(filename))) {
            ArrayList<String> rows = new ArrayList<>();

            while(in.hasNextLine()) {
                rows.add(in.nextLine());
            }
            
            String[][] grid = new String[rows.size()][];

            for (int i = 0; i < rows.size(); i++) {
                grid[i] = rows.get(i).split("");
            }

            return grid;
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
            return new String[0][0]; 
        }
    }
}