public class Bishop extends Game{
    public static void MoveBishop(int r, int c, int newR, int newC) {
        if (GameBoard[r][c].equals(GREEN + " B " + RESET) && (GameBoard[newR][newC].equals(WHITE + " B " + RESET) || GameBoard[newR][newC].equals("   ") || GameBoard[newR][newC].equals(WHITE + " P " + RESET) || GameBoard[newR][newC].equals(WHITE + " N " + RESET) || GameBoard[newR][newC].equals(WHITE + " R " + RESET) || GameBoard[newR][newC].equals(WHITE + " Q " + RESET))) {
            for(int i = 1; i < Math.abs(newR - r); i++){
                if(newR > r && newC > c){
                        if(!GameBoard[r + i][c + i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                } else if(newR > r && newC < c){
                        if(!GameBoard[r + i][c - i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                } else if(newR < r && newC > c){
                        if(!GameBoard[r - i][c + i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                } else {
                        if(!GameBoard[r - i][c - i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
            }
            GameBoard[newR][newC] = GREEN + " B " + RESET;
            GameBoard[r][c] = "   ";

        } else if (GameBoard[r][c].equals(WHITE + " B " + RESET) && (GameBoard[newR][newC].equals(GREEN + " B " + RESET) || GameBoard[newR][newC].equals("   ") || GameBoard[newR][newC].equals(GREEN + " P " + RESET) || GameBoard[newR][newC].equals(GREEN + " N " + RESET) || GameBoard[newR][newC].equals(GREEN + " R " + RESET) || GameBoard[newR][newC].equals(GREEN + " Q " + RESET))) {
            for(int i = 1; i < Math.abs(newR - r); i++){
                if(newR > r && newC > c){
                        if(!GameBoard[r + i][c + i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                } else if(newR > r && newC < c){
                        if(!GameBoard[r + i][c - i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                } else if(newR < r && newC > c){
                        if(!GameBoard[r - i][c + i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                } else {
                        if(!GameBoard[r - i][c - i].equals("   ")){
                            System.out.println(RED + "Invalid Move" + RESET);
                            return;
                        }
                    }
            }
            GameBoard[newR][newC] = WHITE + " B " + RESET;
            GameBoard[r][c] = "   ";

        } else {
            System.out.println(RED + "Invalid Move" + RESET);
        }
    }
}