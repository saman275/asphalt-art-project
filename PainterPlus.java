import org.code.neighborhood.*;

public class PainterPlus extends Painter {

public void moveFast(){
while (canMove()){
  move();
}
}

void turnRight(){
turnLeft();
turnLeft();
turnLeft();
  
}

//Takes all paint from bucket//

void takeAllPaint(){
  while(isOnBucket()){
    takePaint();
  }
}

  //paints until there is no more paint. Ex. paintToEmpty(“white”)//

void paintToEmpty(String color) {
   while(hasPaint()){
     paint(color);
      move(); 
   }
  }

  //paints a donut. Ex. paintDonut(“blue”)//
 
 void paintDonut(String color){
while(hasPaint()){
  move();
  turnRight();
  paint(color);
  move();
  paint(color);
}
   
  }

  //turns 180 degrees//

 void turnAround(){
    turnLeft();
    turnLeft();
      }

}
