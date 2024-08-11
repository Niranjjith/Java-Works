import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MouseDraw extends JFrame {
    private Point clickPoint;
    private String selectedShape;

    public MouseDraw() {
        setTitle("MouseDrawer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());           

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                clickPoint = e.getPoint();
                repaint();  //calls paint method
            }
        });

        String[] shapes = {"Circle", "Square", "Ellipse", "Rectangle"};
        

        JComboBox<String> shapeCB = new JComboBox<String>(shapes);
        shapeCB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            selectedShape = (String) shapeCB.getSelectedItem();
           repaint();
}
        });


      
        add(new JLabel("Select Shape: "));
        add(shapeCB);

        
    }

    public void paint(Graphics g) {
       super.paint(g);
        if (clickPoint != null) {
            int size = 50;
            if (selectedShape.equals("Circle")) {
                g.drawOval(clickPoint.x - size / 2, clickPoint.y - size / 2, size, size);
            } else if (selectedShape.equals("Square")) {
                g.drawRect(clickPoint.x - size / 2, clickPoint.y - size / 2, size, size);
            } else if (selectedShape.equals("Ellipse")) {
                g.drawOval(clickPoint.x - size, clickPoint.y - size / 2, size * 2, size);
            } else if (selectedShape.equals("Rectangle")) {
                g.drawRect(clickPoint.x - size, clickPoint.y - size / 2, size * 2, size);
            }
        }

    }

    public static void main(String[] args) {

            MouseDraw shapes = new MouseDraw();
            shapes.setVisible(true);
    }
}
