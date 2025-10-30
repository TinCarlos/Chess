public interface AllPieces {
   int move(int x, int y);
   int attack(int x, int y);
   int getPosition();
   int getLifePoint();
   void setPosition(int position);
   void setLifePoint(int lifePoint);

   
}
