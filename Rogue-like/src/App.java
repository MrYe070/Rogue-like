import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.loadMap("data/map1.txt");

        Player player1 = new Player(2, 3);
        game.addPlayer(player1);
        

        boolean running = true;
        Scanner in = new Scanner(System.in);
        while (running) {
            clrscn();
            game.display();
            String input = in.nextLine();
            if (input.equalsIgnoreCase("W")) {
                player1.move(0, -1);
            }
        }
    }

    public static void clrscn() {
        System.out.print("\033[H\033[2J");
    }
}
