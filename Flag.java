import org.code.neighborhood.*;

public class Flag extends MuralPainter {


  public void drawFlag() {
    drawStripFlag();
  }
  /*
 * The Flag class extends MuralPainter and is designed to draw a striped flag pattern on a grid.
 * The main method `drawFlag()` calls the `drawStripFlag()` method to create the flag.
 * 
 * The `drawStripFlag()` method uses a series of movement and painting commands to draw horizontal 
 * stripes in specific colors. The flag consists of alternating stripes of black, dodger blue, pale violet red, and white.
 * /
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