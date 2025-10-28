public class Knight implements AllPieces{
    private int position;
    private int LifePoint;

    public Knight() {
        this.position = 0; // Default position
        this.LifePoint = 1; // Knights typically have 1 life point
    }

    @Override
    public int move(int x, int y) {
        // Implement the logic for moving the Knight piece
        // For simplicity, let's assume the Knight moves in an "L" shape: two squares in one direction and one square perpendicular
        if ((Math.abs(x) == 2 && Math.abs(y) == 1) || (Math.abs(x) == 1 && Math.abs(y) == 2)) {
            // Valid move
            this.position += x + y; // Update position (this is a simplification)
            return this.position;
        } else {
            // Invalid move
            System.out.println("Invalid move for Knight");
            return this.position;
        }
    }
    
}
