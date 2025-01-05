package Swing;
import javax.swing.*;

public class MyFrame3 extends JFrame {
    public MyFrame3(){
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        new MyFrame3();
    }
}
