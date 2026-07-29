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
            GameBoard[r][1] = GREEN + " P " + RESET;
        }
        for (int r = 0; r < 8; r++) {
            GameBoard[r][6] = WHITE + " P " + RESET;
        }

        GameBoard[0][0] = GREEN + " R " + RESET;
        GameBoard[7][0] = GREEN + " R " + RESET;
        GameBoard[0][7] = WHITE + " R " + RESET;
        GameBoard[7][7] = WHITE + " R " + RESET;
        GameBoard[1][0] = GREEN + " N " + RESET;
        GameBoard[6][0] = GREEN + " N " + RESET;
        GameBoard[1][7] = WHITE + " N " + RESET;
        GameBoard[6][7] = WHITE + " N " + RESET;
        GameBoard[2][0] = GREEN + " B " + RESET;
        GameBoard[5][0] = GREEN + " B " + RESET;
        GameBoard[2][7] = WHITE + " B " + RESET;
        GameBoard[5][7] = WHITE + " B " + RESET;
        GameBoard[3][0] = GREEN + " Q " + RESET;
        GameBoard[3][7] = WHITE + " Q " + RESET;
        GameBoard[4][0] = GREEN + " K " + RESET;
        GameBoard[4][7] = WHITE + " K " + RESET;

        for(int r = 0; r < 8; r++) {
            for(int c = 0; c < 8; c++) {
                if(GameBoard[r][c] == null){
                    GameBoard[r][c] = "   ";
                }
            }
        }
    }

    public static void PrintBoard(){

        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(GameBoard[0][c]);
        }
        System.out.println(NORM);
        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[1][c]);
        }
        System.out.println(NORM);
        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(GameBoard[2][c]);
        }
        System.out.println(NORM);
        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[3][c]);
        }
        System.out.println(NORM);
        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(GameBoard[4][c]);
        }
        System.out.println(NORM);
        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[5][c]);
        }
        System.out.println(NORM);
        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(OFF_WHITE_BACKGROUND);
            } else {
                System.out.print(BLACK_BACKGROUND);
            }
                System.out.print(GameBoard[6][c]);
        }
        System.out.println(NORM);
        for (int c = 0; c < 8; c++) {
            if (c % 2 == 0) {
                System.out.print(BLACK_BACKGROUND);
            } else {
                System.out.print(OFF_WHITE_BACKGROUND);
            }
                System.out.print(GameBoard[7][c]);
        }
        System.out.println(NORM);
        System.out.println(NORM);
    }

}