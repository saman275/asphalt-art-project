import org.code.neighborhood.*;

public class Heart extends MuralPainter {

  public void drawHeart() {
      drawFartHeart();
  }
public void drawFartHeart() // Calls the method to draw a heart shape
 {
  move();
  move();
  move();
  move();
  move();
  move();
  turnRight();
  move();
  move();
  paintLine("firebrick", 1); // Paints the first segment of the heart shape
  turnLeft();
  turnLeft();
  move();
  move();
  turnLeft();
  move();
  paintLine("firebrick", 1);
  paintLine("firebrick", 1);
  turnLeft();
  move();
  paintLine("firebrick", 1);
  turnRight();
  move();
  turnLeft();
  paintLine("firebrick", 2);
  turnLeft();
  move();
  turnRight();
  paintLine("firebrick", 1);
  turnLeft();
  move();
  paintLine("firebrick", 1);
  turnRight();
  move();
  paintLine("firebrick", 1);
  turnLeft();
  move();
  paintLine("firebrick", 1);
  turnLeft();
  move();
  paintLine("firebrick", 1);
  turnRight();
  move();
  paintLine("firebrick", 1);
  turnLeft();
  move();
  paintLine("firebrick", 1);
  turnRight();
  move();
  turnLeft();
  paintLine("firebrick", 2);
  turnLeft();
  move();
  paintLine("firebrick", 1);
  turnRight();
  move();
  paintLine("firebrick", 1);
  turnLeft();
  turnLeft();
  move();
  turnRight();
  move();
  paintLine("firebrick", 1);
}
  
}