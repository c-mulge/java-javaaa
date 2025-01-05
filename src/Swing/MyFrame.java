package Swing;

//Buttons In Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    private static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MyFrame.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public MyFrame(){

        ImageIcon icon = createImageIcon("/Images/icon5.png");
        label=new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button=new JButton();
        button.setBounds(125,125,250,80);   //size and position of button
        button.addActionListener(this);   // do this after clicking button
        button.setText("Click me");         //adds text to button
        button.setForeground(Color.white);
        button.setFocusable(false);         //removes focus from button
        button.setIcon(icon);
        button.setBackground(Color.BLACK);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(0);    //adds gap between icon and text
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);    //disables a button if set to false


//        ImageIcon icon2 =new ImageIcon("/Images/icon5.png");
//        button.setIcon(icon2);         //not working
//        button.addActionListener(e-> System.out.println("heyyyyyyy"));

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
//        this.setIconImage(icon);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Hey, you pressed button");
            label.setVisible(true);
//            button.setEnabled(false);     //just to pressed once
        }
    }
}
