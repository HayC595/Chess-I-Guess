public class Game extends Main {

    public static final String RESET = "\u001B[38;2;245;245;180m"; //Norm Text Color
    public static final String NORM = "\u001B[m"; // Normal Background Color
    public static final String GREEN = "\u001B[32m"; // Green Pieces
    public static final String RED = "\u001B[31m"; // Instruction Text Color
    public static final String WHITE = "\u001B[97m"; // White Pieces
    public static final String BLUE = "\u001B[34m"; // Barriers
    public static final String OFF_WHITE_BACKGROUND = "\u001B[48;2;245;245;180m"; // Off-White Background
    public static final String BLACK_BACKGROUND = "\u001B[40m"; // Black Background

    public static String[][] GameBoard;

    public static void BoardSetup(){

        GameBoard = new String[8][8];

        for (int r = 0; r < 8; r++) {
            GameBoard[1][r] = GREEN + " P " + RESET;
        }
        for (int r = 0; r < 8; r++) {
            GameBoard[6][r] = WHITE + " P " + RESET;
        }

        GameBoard[0][0] = GREEN + " R " + RESET;
        GameBoard[0][7] = GREEN + " R " + RESET;
        GameBoard[7][0] = WHITE + " R " + RESET;
        GameBoard[7][7] = WHITE + " R " + RESET;
        GameBoard[0][1] = GREEN + " N " + RESET;
        GameBoard[0][6] = GREEN + " N " + RESET;
        GameBoard[7][1] = WHITE + " N " + RESET;
        GameBoard[7][6] = WHITE + " N " + RESET;
        GameBoard[0][2] = GREEN + " B " + RESET;
        GameBoard[0][5] = GREEN + " B " + RESET;
        GameBoard[7][2] = WHITE + " B " + RESET;
        GameBoard[7][5] = WHITE + " B " + RESET;
        GameBoard[0][3] = GREEN + " Q " + RESET;
        GameBoard[7][3] = WHITE + " Q " + RESET;
        GameBoard[0][4] = GREEN + " K " + RESET;
        GameBoard[7][4] = WHITE + " K " + RESET;

        for(int r = 0; r < 8; r++) {
            for(int c = 0; c < 8; c++) {
                if(GameBoard[r][c] == null){
                    GameBoard[r][c] = "   ";
                }
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
                System.out.print(GameBoard[r][0]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[r][1]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(GameBoard[r][2]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[r][3]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(GameBoard[r][4]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[r][5]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(GameBoard[r][6]);
        }
        System.out.println();
        for (int r = 0; r < 8; r++) {
            if (r % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[r][7]);
        }
        System.out.println(NORM);
    }
}