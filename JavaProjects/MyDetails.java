import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyDetails extends JFrame {
    private JTextField name;
    private JTextField street;
    private JTextField city;
    private JTextField pincode;
    private JButton myDetailsButton;
    private JTable detailsTable;
    public MyDetails() {
        setTitle("My Details");
        setSize(580, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        // Create components
        name = new JTextField(20);
        street = new JTextField(20);
        city = new JTextField(20);
        pincode = new JTextField(20);
        myDetailsButton = new JButton("My Details");
        // Create table with sample data
        String[] columnNames = {"Name", "Street", "City", "Pincode"};
        String[][] data = {
            {"xxx", "1 Main St", "Chennai", "641801"},
            {"yyy", "4 Raja St", "Coimbatore", "641007"},
            {"zzz", "63 Ram Nagar", "Erode", "638507"}, 
            
            // Add more rows as needed
        };
        
        detailsTable = new JTable(data, columnNames);
        // Add action listener to the button
        myDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = detailsTable.getSelectedRow();
                if (selectedRow >= 0) {
                    name.setText((String) detailsTable.getValueAt(selectedRow, 0));
                    street.setText((String) detailsTable.getValueAt(selectedRow, 1));
                    city.setText((String) detailsTable.getValueAt(selectedRow, 2));
                    pincode.setText((String) detailsTable.getValueAt(selectedRow, 3));
                }
            }
        });
add(new JLabel("Name:"));
add(name);
add(new JLabel("Street:"));
add(street);
add(new JLabel("City:"));
add(city);
add(new JLabel("Pincode:"));
add(pincode);
add(myDetailsButton);
add(detailsTable);
add(new JScrollPane(detailsTable));
        setVisible(true);
    }
    public static void main(String[] args) {
        
                new MyDetails();
         
    }
}