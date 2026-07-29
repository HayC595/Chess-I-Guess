import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println(Game.RESET + "Welcome to Chess I Guess");
        System.out.println(Game.RESET + "This is a Two Player Chess Game (No AI)");
        System.out.println(Game.RESET + "The Game is played with" + Game.WHITE + " WHITE " + Game.RESET + "and" + Game.GREEN + " GREEN " + Game.RESET + "pieces");
        System.out.println(Game.BLUE + "---------------------------||");
        System.out.println(Game.RESET + "The Peices are as follows: ");
        System.out.println(Game.RESET + "P - Pawn");
        System.out.println(Game.RESET + "R - Rook");
        System.out.println(Game.RESET + "N - Knight");
        System.out.println(Game.RESET + "B - Bishop");
        System.out.println(Game.RESET + "Q - Queen");
        System.out.println(Game.RESET + "K - King");
        System.out.println(Game.BLUE + "---------------------------||");      
        System.out.println(Game.RED + "Please Press Enter to Start" + Game.RESET);
        scanner.nextLine();
        System.out.println(Game.RESET + "Game Starting...");

        Game.BoardSetup();
        Game.PrintBoard();

        //TEST
        Pawn.MovePawnTwo(0, 1);
        Game.PrintBoard();
        Rook.MoveRook(0, 0, 0, 2);
        Game.PrintBoard();
        Rook.MoveRook(0, 2, 7, 2);
        Game.PrintBoard();
        Rook.MoveRook(7, 2, 7, 6);
        Game.PrintBoard();
        Pawn.MovePawnOne(3,1);
        Game.PrintBoard();
        Pawn.MovePawnTwo(6,6);
        Game.PrintBoard();
        Bishop.MoveBishop(2, 0, 6, 4);
        Game.PrintBoard();
        Queen.MoveQueen_Bishop(4, 0, 0, 4);
        Game.PrintBoard();
        Queen.MoveQueen_Rook(0, 4, 0, 6);
        Game.PrintBoard();
    }
}