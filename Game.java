public class Game extends Main {

    public static final String RESET = "\u001B[38;2;245;245;180m"; //Norm Text Color
    public static final String GREEN = "\u001B[32m"; // Green Pieces
    public static final String RED = "\u001B[31m"; // Instruction Text Color
    public static final String WHITE = "\u001B[97m"; // White Pieces
    public static final String BLUE = "\u001B[34m"; // Barriers
    public static final String OFF_WHITE_BACKGROUND = "\u001B[48;2;245;245;180m"; // Off-White Background
    public static final String BLACK_BACKGROUND = "\u001B[40m"; // Black Background

    public static void main(String[] args) {
    // Background black, text white
    System.out.println(BLACK_BACKGROUND + WHITE + "This is White text on Black background" + RESET);

    // Background yellow, text red
    System.out.println(OFF_WHITE_BACKGROUND + GREEN + "This is Green text on Off-White background" + RESET);
    }

    public static String[][] GameBoard;

    public static void BoardSetup(){

        GameBoard = new String[8][8];

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                GameBoard[r][c] = ".";
            }

        }
    }

    public static void PrintBoard(){

        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][0]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][1]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][2]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][3]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][4]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][5]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][6]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(RESET + GameBoard[r][7]);
        }

    }
}