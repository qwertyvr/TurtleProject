/**
 * A Turtle for a Turtle Graphics system.
 */

import java.lang.*;

public class Turtle extends BasicTurtle {

  /**
   * Instance variables
   */      
  private TurtleWorld TW;
  private boolean penDown;

  // Constructors:
 
  /**
   * Using a TurtleWorld drawing "context", create a new Turtle 
   * with heading due north (0 degrees), and position at the origin (0,0)
   */  
  public Turtle(TurtleWorld TW) {
    super();
    this.TW = TW;
    penDown = false;
  }

  /**
   * Using a TurtleWorld drawing "context", create a new Turtle 
   * with specified heading and position.
   */ 
  public Turtle (TurtleWorld TW, double inith, double x, double y) {
    super(inith,x,y);
    this.TW = TW;
    penDown = false;
  }

  /**
   * Using a TurtleWorld drawing "context", create a new Turtle
   * with specified heading and position at the origin (0,0)
   */ 
  public Turtle (TurtleWorld TW, double inith) {
    super(inith);
    this.TW = TW;
    penDown = false;
  }

  /**
   * Using a TurtleWorld drawing "context", create a new Turtle
   * with heading due north (0 degrees) and specified position
   */ 
  public Turtle (TurtleWorld TW, double x, double y) {
    super(x,y);
    this.TW = TW;
    penDown = false;
  }

  // Commands:

   /**
   * set the pen down. 
   */ 
  public void pd () {
    penDown = true;
  } 
  
   /**
   * set the pen up. 
   */ 
  public void pu () {
    penDown = false;
  }

  /**
   * Move forward dist steps.  fd is exactly the opposite of bk.  The Turtle position
   * is changed but the Turtle heading stays the same.
   */  
  public void fd (double dist) {  
    double prevX = xcor();
    double prevY = ycor();
    super.fd(dist);  
    
    if (penDown)
      TW.doDrawLine(prevX,prevY,xcor(),ycor());    
  }

  // Queries:

  /**
   * Return status of pen.
   */ 
  public boolean isPenDown () {
    return penDown;
  }  
  
}
