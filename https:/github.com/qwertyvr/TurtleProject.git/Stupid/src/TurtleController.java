
/**
 * Controller object for the TurtleGraphics system
 */
public class TurtleController {
  
  /**
   * instance variables
   */
  private Turtle t;
  private TurtleWorld TW;
  
  /**
   * Construct a TurtleController object
   */
  public TurtleController(){
    /**
     * A TurtleController object is created with a Turtle
     * and an associated TurtleWorld context.
     */
    TW = new TurtleWorld();
    t = new Turtle(TW,90,0,0);
  }
  
  /**
   * The drawStuff method completely draws a series of turtle 
   * shapes.
   */ 
  public void drawStuff(){
    /* 
     * This method uses a Turtle to draw it's own Turtle shapes
     */
    t.pu();
    
    t.setx(5);
    t.sety(5);
    t.setHeading(90);

    TurtleDrawings.Square(t,200);

    t.fd(100);
    t.rt(90);
    t.fd(50);
    t.lt(90);
    
    TurtleDrawings.Circle(t,30,20);

    t.setx(200);
    t.sety(200);
    t.setHeading(0);
    TurtleDrawings.Spiral(t,60,10);
    
    t.setx(330);
    t.sety(330);
    t.setHeading(0);
    TurtleDrawings.SpiralSquare(t,30);
    
    t.setx(300);
    t.sety(100);
    t.setHeading(0);
    TurtleDrawings.SpiralIncreasing(t,20);
    
    t.setx(50);
    t.sety(300);
    t.setHeading(80);
    TurtleDrawings.Rectangle(t,100,60);

  }

}