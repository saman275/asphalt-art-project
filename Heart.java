import org.code.neighborhood.*;

public class Heart extends MuralPainter {

  public void drawHeart() {
      drawFartHeart();
  }

  /*
 * The Heart class extends MuralPainter and is designed to draw a heart shape on a grid.
 * The main method `drawHeart()` calls the `drawFartHeart()` method to perform the drawing.
 * 
 * The `drawFartHeart()` method moves the painter around the grid, turning and drawing lines
 * in the color "firebrick" to create the shape of a heart. It uses a combination of move and 
 * turn methods to position the painter correctly, and the `paintLine()` method to draw the lines.
 * 
 * Specific actions in the `drawFartHeart()` method:
 * - The painter moves forward several steps to position the starting point.
 * - It turns and paints lines of various lengths in specific directions to form the outline of the heart.
 * - The heart shape is created by painting individual lines that form the curves and pointed bottom of the heart.
 */

public void drawFartHeart() {
  move();
  move();
  move();
  move();
  move();
  move();
  turnRight();
  move();
  move();
  paintLine("firebrick", 1);
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