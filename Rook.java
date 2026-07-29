public class Rook extends Game{
    public static void MoveRook(int r, int c, int newR, int newC){
        if (GameBoard[r][c].equals(GREEN + " R " + RESET) && (GameBoard[newR][newC].equals(WHITE + " R " + RESET) || GameBoard[newR][newC].equals("   ") || GameBoard[newR][newC].equals(WHITE + " P " + RESET) || GameBoard[newR][newC].equals(WHITE + " N " + RESET) || GameBoard[newR][newC].equals(WHITE + " B " + RESET) || GameBoard[newR][newC].equals(WHITE + " Q " + RESET))){
            if (newR == r && newC != c){
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
            } else if (newC == c && newR != r){
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
        } else if (GameBoard[r][c].equals(WHITE + " R " + RESET) && (GameBoard[newR][newC].equals(GREEN + " R " + RESET) || GameBoard[newR][newC].equals("   ") || GameBoard[newR][newC].equals(GREEN + " P " + RESET) || GameBoard[newR][newC].equals(GREEN + " N " + RESET) || GameBoard[newR][newC].equals(GREEN + " B " + RESET) || GameBoard[newR][newC].equals(GREEN + " Q " + RESET))){
            if (newR == r && newC != c){
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
            } else if (newC == c && newR != r){
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
