public class Pawn extends Game{
    public static void MovePawnOne(int r, int c){
        if (GameBoard[r][c].equals(GREEN + " P " + RESET) && GameBoard[r][c + 1].equals("   ") && (c < 7 && c > 0)){
            
                int newC = c + 1;
                GameBoard[r][newC] = GREEN + " P " + RESET;
                GameBoard[r][c] = "   ";
            
        } else if (GameBoard[r][c].equals(WHITE + " P " + RESET) && GameBoard[r][c - 1].equals("   ") && (c < 7 && c > 0)){

                int newC = c - 1;
                GameBoard[r][newC] = WHITE + " P " + RESET;
                GameBoard[r][c] = "   ";
            
        } else {
            System.out.println(RED + "Invalid Move" + RESET);
        }
    }
    public static void MovePawnTwo(int r, int c){
        if (GameBoard[r][c].equals(GREEN + " P " + RESET) && c == 1 && GameBoard[r][c + 1].equals("   ") && GameBoard[r][c + 2].equals("   ")){
           
                int newC = c + 2;
                GameBoard[r][newC] = GREEN + " P " + RESET;
                GameBoard[r][c] = "   ";
        
        } else if (GameBoard[r][c].equals(WHITE + " P " + RESET) && c == 6 && GameBoard[r][c - 1].equals("   ") && GameBoard[r][c - 2].equals("   ")){

                int newC = c - 2;
                GameBoard[r][newC] = WHITE + " P " + RESET;
                GameBoard[r][c] = "   ";
            
        } else {
            System.out.println(RED + "Invalid Move" + RESET);
        }
    }
    public static void PawnCapture(int r, int c, int newR, int newC){
        if (GameBoard[r][c].equals(GREEN + " P " + RESET)){
            if (newC == c + 1 && (newR == r + 1 || newR == r - 1) && !GameBoard[newR][newC].equals("   ")){
                GameBoard[newR][newC] = GREEN + " P " + RESET;
                GameBoard[r][c] = "   ";
            } else {
                System.out.println(RED + "Invalid Move" + RESET);
            }
        } else if (GameBoard[r][c].equals(WHITE + " P " + RESET)){
            if (newC == c - 1 && (newR == r + 1 || newR == r - 1) && !GameBoard[newR][newC].equals("   ")){
                GameBoard[newR][newC] = WHITE + " P " + RESET;
                GameBoard[r][c] = "   ";
            } else {
                System.out.println(RED + "Invalid Move" + RESET);
            }
        } else {
            System.out.println(RED + "Invalid Move" + RESET);
        }
    }
    public static void PawnPromotion(int r, int c, String newPiece){
        if(newPiece.equals("Q") || newPiece.equals("R") || newPiece.equals("N") || newPiece.equals("B")){
            if (GameBoard[r][c].equals(GREEN + " P " + RESET) && c == 7){
                GameBoard[r][c] = GREEN + " " + newPiece + " " + RESET;
            } else if (GameBoard[r][c].equals(WHITE + " P " + RESET) && c == 0){
                GameBoard[r][c] = WHITE + " " + newPiece + " " + RESET;
            } else {
                System.out.println(RED + "Invalid Move" + RESET);
            }
        } else {
            System.out.println(RED + "Invalid Promotion Piece" + RESET);
        }
    }
}
