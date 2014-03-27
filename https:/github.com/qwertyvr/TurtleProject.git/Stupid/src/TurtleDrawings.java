import java.awt.*;

import javax.swing.*;

public class TurtleDrawings {

  /**
   * Use the turtle to draw a "Circle" (actually a "sides" sided polygon,
   * where each side is of length "side")
   */      
  public static void Circle (Graphics g, Turtle t, int sides, int size) {
	  for (int i = 0; i < 20; i++) {
		 t.rt(18);
		 t.prevx = t.xcoord;
		 t.prevy = t.ycoord;
		 t.fd(size);
		 g.drawLine((int)t.prevx,(int)t.prevy,(int)t.xcoord,(int)t.ycoord);
		 while ((t.xcoord < 0) || (t.xcoord > 400) || (t.ycoord < 0 ) || (t.ycoord > 400)){
			 t.wrap();
			 g.drawLine((int)t.prevx,(int)t.prevy,(int)t.xcoord,(int)t.ycoord);
		 }
		 
	  }
  }

  /**
   * Use the turtle to draw a Spiral of "circles" number of circles.  Each 
   * circle is actually a 20 sided polygon, where the side of the circle is
   * of length "size"
   */  
  public static void Spiral (Graphics g, Turtle t, int circles, int size) {
	  for (int p = 0; p < 18; p++){
		  t.heading = (t.heading + 20) % 360;
		  Circle (g, t, 20, size);
		  
	  }
  }

  /**
   * Use the turtle to draw a Spiral of 20 circles.  Each 
   * circle is actually a 20 sided polygon, where the side of each circle is
   * of increasing length, from 0 to "size".
   */ 
  public static void SpiralIncreasing (Graphics g, Turtle t, int size) {
	  for (int p = 0; p < 20; p++){
		  t.heading = (t.heading + 18) % 360;
		  size = size + 3;
		  Circle (g, t, 20, size);
		  
	  }
      
  }

  /**
   * Use the turtle to draw a Spiral of 20 Squares, where the sides of each square 
   * are of length "size".  
   */ 
  public static void SpiralSquare (Graphics g, Turtle t, int size) {
	  for (int p = 0; p < 20; p++){
		  t.heading = (t.heading + 18) % 360;
		  Square(g, t, size);
	  }
  }

  /**
   * Use the turtle to draw a Square, where each side is of length "size".  
   */ 
  public static void Square(Graphics g, Turtle t, int size) {
	  for (int i = 0; i < 4; i++) {
	     t.lt(90);
	     t.prevx = t.xcoord;
	     t.prevy = t.ycoord;
	     t.fd(size);
	     g.drawLine((int)t.prevx,(int)t.prevy,(int)t.xcoord,(int)t.ycoord);
	     while ((t.xcoord < 0) || (t.xcoord > 400) || (t.ycoord < 0 ) || (t.ycoord > 400)){
			 t.wrap();
			 g.drawLine((int)t.prevx,(int)t.prevy,(int)t.xcoord,(int)t.ycoord);
		 }
	  }
  }
  
}