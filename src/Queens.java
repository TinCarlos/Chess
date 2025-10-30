public class Queens implements AllPieces{
    private int position;
    private int LifePoint;

    public Queens() {
        this.position = 0; // Default position
        this.LifePoint = 1; // Queens typically have 1 life point
    }

    public int move(int x, int y) {
        if(Math.abs(x) <= 8 && Math.abs(y) >= 0 || Math.abs(y) <= 8 && Math.abs(x) >= 0){
            // Valid move
            this.position += x + y;
            return this.position;
        } else {
            // Invalid move
            System.out.println("Invalid move for Quee");
            return this.position;
        }

    }
    public int attack(int x, int y){
        return 0;
   }
   public int getPosition(){
    return 0;
   }
   public int getLifePoint(){
    return LifePoint;
   }
   public void setPosition(int position){

   }
   public void setLifePoint(int lifePoint){

   }
    
}
