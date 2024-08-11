import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClicks extends JFrame {
    
    public MouseClicks() {
        setTitle("Mouse Events ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
         JLabel l=new JLabel();  

        add(l);  
        
        addMouseListener(new MouseAdapter() {
           
            public void mouseClicked(MouseEvent e) {
                l.setText("Mouse Clicked");
            }
                        
          
            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse Entered");
            } 
         
            public void mousePressed(MouseEvent e) {
                l.setText("Mouse Pressed");
            }
          
            public void mouseExited(MouseEvent e) {
                l.setText("Mouse Exited");
            }

      
            public void mouseReleased(MouseEvent e) {
                l.setText("Mouse Released");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
       
            new MouseClicks();
            
        }
    }