package java_project;

import javax.swing.*;

public class MySwingApp {
	public static void main(String[] args) {
        
        JFrame frame = new JFrame("My First Swing App");

        
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Căn giữa màn hình

        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }

}
