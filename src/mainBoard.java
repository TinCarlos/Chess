
public class mainBoard {
    
    //m == 8 and n == 8
    public static void main(String[] args) throws Exception {
        AllPieces[][] board = new AllPieces[8][8];
        for(int i = 1; i <  8; i++){
            board[1][i] = new Pawns();
        }
        board[0][8] = new Rook();
        board[0][0] = new Rook();
        board[0][1] = new Knight();
        board[0][7] = new Knight();
        board[0][2] = new Bishop();
        board[0][6] = new Bishop();
        board[0][3] = new Queens();
        board[0][4] = new King();

    }
}
