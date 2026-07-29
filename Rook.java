public class Rook extends Game{
    public static void MoveRook(int r, int c, int newR, int newC){
        if (GameBoard[r][c].equals(GREEN + " R " + RESET)){
            if (newR == r && newC != c && GameBoard[newR][newC].equals("   ")){
                if(newC > c){
                    for(int i = c + 1; i < newC; i++){
                        if(!GameBoard[r][i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                } else {
                    for(int i = c - 1; i > newC; i--){
                        if(!GameBoard[r][i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                }
                GameBoard[newR][newC] = GREEN + " R " + RESET;
                GameBoard[r][c] = "   ";
            } else if (newC == c && newR != r && GameBoard[newR][newC].equals("   ")){
                if(newR > r){
                    for(int i = r + 1; i < newR; i++){
                        if(!GameBoard[i][c].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                } else {
                    for(int i = r - 1; i > newR; i--){
                        if(!GameBoard[i][c].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                }
                GameBoard[newR][newC] = GREEN + " R " + RESET;
                GameBoard[r][c] = "   ";
            } else {
                System.out.println(RED + "Invalid Move" + RESET);
            }
        } else if (GameBoard[r][c].equals(WHITE + " R " + RESET)){
            if (newR == r && newC != c && GameBoard[newR][newC].equals("   ")){
                if(newC > c){
                    for(int i = c + 1; i < newC; i++){
                        if(!GameBoard[r][i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                } else {
                    for(int i = c - 1; i > newC; i--){
                        if(!GameBoard[r][i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                }
                GameBoard[newR][newC] = WHITE + " R " + RESET;
                GameBoard[r][c] = "   ";
            } else if (newC == c && newR != r && GameBoard[newR][newC].equals("   ")){
                if(newR > r){
                    for(int i = r + 1; i < newR; i++){
                        if(!GameBoard[i][c].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                } else {
                    for(int i = r - 1; i > newR; i--){
                        if(!GameBoard[i][c].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
                }
                GameBoard[newR][newC] = WHITE + " R " + RESET;
                GameBoard[r][c] = "   ";
            } else {
                System.out.println(RED + "Invalid Move" + RESET);
            }
        } else {
            System.out.println(RED + "Invalid Move" + RESET);
        }
    }
}
