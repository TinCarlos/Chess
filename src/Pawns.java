public class Pawns implements AllPieces{
    private int position;
    private int LifePoint;
    public Pawns(){
        this.position = 0;
        this.LifePoint = 1;
    }

    public int move(int x, int y) {
        // Implement the logic for moving the King piece
        // For simplicity, let's assume the King can move one square in any direction
        if (Math.abs(x) <= 1 && Math.abs(y) <= 1) {
            // Valid move
            this.position += x + y; // Update position (this is a simplification)
            return this.position;
        } else {
            // Invalid move
            System.out.println("Invalid move for King");
            return this.position;
        }

    }
}
