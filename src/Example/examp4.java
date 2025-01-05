import java.lang.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class examp4 extends JFrame implements ActionListener
{
    JFrame j1;
    JTextArea t1;
    JButton b[] = new JButton[16];
    int i;
    String eval="";
    JPanel p1, p2;
    examp4 ()
    {
        j1 = new JFrame ("Hello");
        b[0] = new JButton ("1");
        b[1] = new JButton ("2");
        b[2] = new JButton ("3");
        b[3] = new JButton ("+");
        b[4] = new JButton ("4");
        b[5] = new JButton ("5");
        b[6] = new JButton ("6");
        b[7] = new JButton ("-");
        b[8] = new JButton ("7");
        b[9] = new JButton ("8");
        b[10] = new JButton ("9");
        b[11] = new JButton ("*");
        b[12] = new JButton ("0");
        b[13] = new JButton (".");
        b[14] = new JButton ("=");
        b[15] = new JButton ("/");

        for(i=0;i<16;i++)
            b[i].addActionListener(this);

        t1=new JTextArea();
        t1.setEditable(false);

        p1=new JPanel();
        p2=new JPanel();
        p2.setLayout(new GridLayout(4,4));
        p1.add(t1);
        for(i=0;i<16;i++)
            p2.add(b[i]);

        j1.add(p1);
        j1.add(p2);
        j1.setLayout(new GridLayout(2,1));
        j1.setSize(400,400);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){
        int font=Font.BOLD;
        Font f1=new Font("Ariel",font,20);
        String name=((JButton) ae.getSource()).getText();
        eval+=name;
        t1.setFont(f1);
        t1.setText(eval);
    }

    public static void main (String[]args)
    {
        examp4 q=new examp4();
    }
}