package java_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

public class CoVua extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoVua frame = new CoVua();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoVua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(new GridLayout(8, 8, 0, 0));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		getContentPane().add(panel_1_1);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2);
		
		JPanel panel_1_2 = new JPanel();
		getContentPane().add(panel_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		getContentPane().add(panel_1_1_1);
		
		JPanel panel_2_1 = new JPanel();
		getContentPane().add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
	}

}
