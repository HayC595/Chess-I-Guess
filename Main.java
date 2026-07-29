import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println(Game.RESET + "Welcome to Chess I Guess");
        System.out.println(Game.RESET + "This is a Two Player Chess Game (No AI)");
        System.out.println(Game.RESET + "The Game is played with" + Game.WHITE + " WHITE " + Game.RESET + "and" + Game.GREEN + " GREEN " + Game.RESET + "pieces");
        System.out.println(Game.RED + "Please Press Enter to Start" + Game.RESET);
        scanner.nextLine();
        System.out.println(Game.RESET + "Game Starting...");
        
        //game.game(args);
    }
}