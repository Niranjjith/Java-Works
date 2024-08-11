
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class UserMenu { 
private static String text=""; 
private static JTextArea content;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Program");
   frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        content=new JTextArea(50,50);
        content.setFont(new Font("Serif",Font.PLAIN,20));
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

      JMenu editMenu = new JMenu("Edit");
       JMenuItem cutItem = new JMenuItem("Cut");
      JMenuItem copyItem = new JMenuItem("Copy");
      JMenuItem pasteItem = new JMenuItem("Paste");
      JMenuItem selectallItem = new JMenuItem("Select All");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(selectallItem);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

frame.setJMenuBar(menuBar);
frame.add(new JScrollPane(content));
frame.setVisible(true);

newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        content.setText("");
            }
        });

exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



 cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
  text=(String)content.getSelectedText();
     content.replaceSelection("");

            }
        });

 copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          text=(String)content.getSelectedText();

            }
        });

 pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        int pos=content.getCaretPosition();
        content.insert(text,pos);
            }
        });

 selectallItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        content.selectAll();
            }
        });
        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Menu Bar and Pull DownMenu Program");
            }
        });
    }
}