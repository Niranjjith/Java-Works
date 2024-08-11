
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiSelectionListbox extends JFrame  {
    public JLabel label;
    public JButton submit;
    public JList list1,list2;
    public MultiSelectionListbox()
    {
        setTitle("Multiple Selection ListBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        String values[]={"C","C++","Java","Python","R","HTML","XML","CSS","PHP"};
        label = new JLabel("Which Languages do you know?");
        list1 = new JList(values);
        list2 = new JList();
       
        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                list2.setListData(list1.getSelectedValues());
            }
        });
        add(label);
        add(new JScrollPane(list1));
        add(list1);
        add(submit);
        add(new JScrollPane(list2));
        add(list2);
        setVisible(true);
    }
    public static void main(String[] args) {
       new MultiSelectionListbox();
}
}