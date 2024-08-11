import java.awt.*;  
import java.applet.*;  

public class Shapes extends Applet
{
 public void paint(Graphics g)
 {
  g.setFont(new Font("Calibri", Font.BOLD,30));
  g.drawString("Different Shapes in Applet", 20, 20);
  g.drawOval(50,50,80,100);   
  g.setColor(Color.RED);  
  g.fillOval(50,50,80,100);	
  g.drawRect(150,150,120,100);	
  g.drawLine(270,270,350,350);
  g.drawArc(60,280,100,80,180,180);  
 }
}
/* <applet code="Shapes.class" width="400" height="400"> 
</applet>
*/