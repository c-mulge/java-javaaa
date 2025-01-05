package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame3 extends JFrame {
    private JPanel panel;
    private JLabel rnolabel, namelabel, addrlabel, classlabel;
    private JTextField rnofield, namefield, addrfield, classfield;
    private JButton submit;

    // Correct constructor definition
    public MyFrame3() {
        // Set frame properties
        this.setSize(400, 300); // Set an appropriate size for the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Student Registration Form");

        // Initialize panel and components
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns with spacing

        rnolabel = new JLabel("Rno: ");
        namelabel = new JLabel("Name: ");
        addrlabel = new JLabel("Address: ");
        classlabel = new JLabel("Class: ");

        rnofield = new JTextField();
        namefield = new JTextField();
        addrfield = new JTextField();
        classfield = new JTextField();

        submit = new JButton("Submit");

        // Add action listener to the submit button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rno = rnofield.getText();
                String name = namefield.getText();
                String addr = addrfield.getText();
                String clas = classfield.getText();

                // For now, just clear the fields after submission
                rnofield.setText("");
                namefield.setText("");
                addrfield.setText("");
                classfield.setText("");

                // Display the submitted data in a dialog (optional)
                //JOptionPane.showMessageDialog(null, "Submitted:\nRno: " + rno + "\nName: " + name + "\nAddress: " + addr + "\nClass: " + clas);
            }
        });

        // Add components to the panel
        panel.add(rnolabel);
        panel.add(rnofield);
        panel.add(namelabel);
        panel.add(namefield);
        panel.add(addrlabel);
        panel.add(addrfield);
        panel.add(classlabel);
        panel.add(classfield);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submit);

        // Add the panel to the frame and center the content
        this.add(panel);
        this.setLocationRelativeTo(null); // Centers the window on the screen

        // Make the frame visible
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Instantiate the frame (This will show the form)
        new MyFrame3();
    }
}
