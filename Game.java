import java.util.Scanner;

public class Game extends Main {

    public static final String RESET = "\u001B[38;2;245;245;180m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[97m";
    public static final String OFF_WHITE_BACKGROUND = "\u001B[48;2;245;245;180m";

    public static final String BLACK_BACKGROUND = "\u001B[40m";

    public static void main(String[] args) {
    // Background black, text white
    System.out.println(BLACK_BACKGROUND + WHITE + "This is White text on Black background" + RESET);

    // Background yellow, text red
    System.out.println(RESET + GREEN + "This is Green text on Off-White background" + RESET);
    }

    public static String[][] GameBoard;

    public static void game(String[] args){

        GameBoard = new String[8][8];

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                GameBoard[r][c] = ".";
            }

        }
    }
}