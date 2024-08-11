import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("User Profile Form");
        frame.setSize(320, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,25));

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField name = new JTextField(20);

        JLabel ageLabel = new JLabel("Age:");
        JTextField age = new JTextField(20);

        JLabel qualificationLabel = new JLabel("Qualification:");
        JTextField qualification = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea address = new JTextArea(5, 20);

        // Create a button to trigger the action
        JButton submit = new JButton("Submit");

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(name);
        frame.add(ageLabel);
        frame.add(age);
        frame.add(qualificationLabel);
        frame.add(qualification);
        frame.add(addressLabel);
        frame.add(new JScrollPane(address));
        frame.add(submit);

        // Create ActionListener for the button
        submit.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                
                // Display all values in a dialog box
                String message = "Name: " + name.getText() + "\nAge: " + age.getText() + "\nQualification: " + qualification.getText() + "\nAddress:\n" + address.getText();
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}