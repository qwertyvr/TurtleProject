import java.awt.*;

import javax.swing.*;

/** 
 * TurtleWorld provides a high level drawing context for a Turtle
 */
public class TurtleWorld {

  /**
   * Instance Variables
   */
  JFrame frame;
  TurtlePanel tPanel;

  /**
   * Constructor for a TurtleWorld "context".
   */
  public TurtleWorld(){
    /**
     * A swing JFrame and TurtlePanel (JPanel) 
     * are created and initially painted
     */
    frame = new JFrame();
    tPanel = new TurtlePanel();
    frame.getContentPane().add (tPanel);
    frame.pack();
    frame.setVisible(true);
  }
  
  /**
   * Draw a line on the TurtleWorld "context".
   */
  public void  doDrawLine(double x1, double y1, double x2, double y2){
    tPanel.doDrawLine(x1,y1,x2,y2);
  }
    
}