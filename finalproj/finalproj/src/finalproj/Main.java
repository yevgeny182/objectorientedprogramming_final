package finalproj;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame = new JFrame("Bazura Grill");
		frame.setForeground(Color.WHITE);
	
	    frame.setBounds(100, 100, 480, 900);
	    // Set the JFrame to exit the application when closed
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    
	    JButton btnNewButton = new JButton("Login");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	LandingPage L = new LandingPage();
	    	LandingPage.main(null);
	    	}
	    });
	    btnNewButton.setBounds(166, 637, 134, 33);
	    frame.getContentPane().add(btnNewButton);
	    
	    JLabel lblNewLabel = new JLabel("Bazura Grill");
	    lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
	    lblNewLabel.setBounds(183, 303, 150, 33);
	    frame.getContentPane().add(lblNewLabel);
	    
	    JButton btnSignUp = new JButton("Sign Up");
	    btnSignUp.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		SignupPage S = new SignupPage();
	    		SignupPage.main(null);
	    	}
	    });
	    btnSignUp.setBounds(166, 690, 134, 33);
	    frame.getContentPane().add(btnSignUp);
	    
	    Image newimg = new ImageIcon(this.getClass().getResource("/Graphicloads-Food-Drink-Beer.256.png")).getImage();
		Image scaledImage = newimg.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(scaledImage);
	    JLabel lblNewLabel_1 = new JLabel(icon);
	    lblNewLabel_1.setBounds(152, 142, 150, 150);
	    frame.getContentPane().add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_2 = new JLabel("Copyright © 2023 Bazura Grill ");
	    lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
	    lblNewLabel_2.setBounds(152, 807, 234, 26);
	    frame.getContentPane().add(lblNewLabel_2);
	    // Set the JFrame to be visible
	    frame.setVisible(true);
	}
}
