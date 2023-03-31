package finalproj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class BazGrill {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BazGrill window = new BazGrill();
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
	public BazGrill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame = new JFrame("Bazura Grill");
		frame.setForeground(Color.WHITE);
	
	    frame.setBounds(100, 100, 360, 640);
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
	    btnNewButton.setBounds(126, 424, 89, 23);
	    frame.getContentPane().add(btnNewButton);
	    
	    JLabel lblNewLabel = new JLabel("Bazura Grill System");
	    lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
	    lblNewLabel.setBounds(98, 182, 150, 33);
	    frame.getContentPane().add(lblNewLabel);
	    
	    JButton btnSignUp = new JButton("Sign Up");
	    btnSignUp.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		LandingPage L = new LandingPage();
	    		LandingPage.main(null);
	    	}
	    });
	    btnSignUp.setBounds(126, 461, 89, 23);
	    frame.getContentPane().add(btnSignUp);
	    // Set the JFrame to be visible
	    frame.setVisible(true);
	}
}
