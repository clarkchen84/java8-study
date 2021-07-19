package sizhe.chen.jdk8;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingTest {
    public static void main(String[] args) {
        System.out.println("Hello World");
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton =new JButton("Test");
        jButton.addActionListener(e -> System.out.println("Test pressed"));
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
