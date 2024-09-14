import org.code.neighborhood.*;

public class PainterPlus extends Painter {

   public void turnRight(){
     turnLeft();
     turnLeft();
     turnLeft();
   }
  public void takeAllPaint(){
    while (isOnBucket()){
      takePaint();
    }
  }
  public void moveFast(){
    while (canMove()) {
      move();
    }
  }
  public void paintToEmpty(){
    while (hasPaint()){
      paint("white)");
      move();
    }
  }
  public void paintDonut(String color){
    while (hasPaint()) {
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
  }
      
    
  }
}