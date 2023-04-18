import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.loadMap("data/map1.txt");

        Player player1 = new Player(2, 3);
        game.addPlayer(player1);

        Enemy enemy = new Enemy(5, 3);
        game.addActor(enemy);
        game.addActor(new Enemy(10, 1));
        game.addActor(new Enemy(11, 4));

        

        boolean running = true;
        Scanner in = new Scanner(System.in);
        while (running) {
            clrscn();
            game.display();
            for (int i = 0; i < game.actors.size(); i++) {
                game.actors.get(i).act(game);
            }
        }
    }

    public static void clrscn() {
        System.out.print("\033[H\033[2J");
    }
}
