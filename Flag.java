import org.code.neighborhood.*;

public class Flag extends MuralPainter {


  public void drawFlag() {
    drawStripFlag();
  }
public void drawStripFlag(){
turnRight();
    paintLine("black", 12);
turnLeft();
turnLeft();
  moveFast();
turnRight();
  move();
    paintLine("dodgerblue", 11);
  turnRight();
  move();
  turnRight();
  paintLine("dodgerblue", 11);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("palevioletred", 11);
  turnRight();
  move();
  turnRight();
  paintLine("palevioletred", 11);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("white", 11);
  turnRight();
  move();
  turnRight();
  paintLine("white", 11);
   turnLeft();
  move();
  turnLeft();
  move();
  paintLine("palevioletred", 11);
  turnRight();
  move();
  turnRight();
  paintLine("palevioletred", 11);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("dodgerblue", 11);
  turnRight();
  move();
  turnRight();
  paintLine("dodgerblue", 11);
  
 
  }
}