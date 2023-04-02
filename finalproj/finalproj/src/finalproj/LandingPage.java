package finalproj;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LandingPage {
		
	static ArrayList<String> admin = new ArrayList<String>();
	private JFrame frame;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JLabel lblBazuraGrill;
	private JButton btnConfirm_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage window = new LandingPage();
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
	public LandingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Log-in Form");
		frame.setBounds(100, 100, 480, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(166, 697, 134, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Input Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(116, 310, 140, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 338, 235, 33);
		frame.getContentPane().add(textField);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(116, 382, 140, 33);
		frame.getContentPane().add(lblPassword);
		
		String user;
		String pass;
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 411, 235, 33);
		frame.getContentPane().add(passwordField);
		
		
		Image newimg = new ImageIcon(this.getClass().getResource("/Graphicloads-Food-Drink-Beer.256.png")).getImage();
		Image scaledImage = newimg.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(scaledImage);
		lblNewLabel_1 = new JLabel(icon);
		lblNewLabel_1.setBounds(150, 53, 150, 150);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblBazuraGrill = new JLabel("Bazura Grill");
		lblBazuraGrill.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		lblBazuraGrill.setBounds(177, 204, 150, 33);
		frame.getContentPane().add(lblBazuraGrill);
		
		btnConfirm_1 = new JButton("Confirm");
		btnConfirm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage menu = new MenuPage();
				MenuPage.main(null);
			}
		});
		btnConfirm_1.setForeground(Color.WHITE);
		btnConfirm_1.setBackground(new Color(0, 128, 0));
		btnConfirm_1.setBounds(166, 637, 134, 33);
		frame.getContentPane().add(btnConfirm_1);
		
		JLabel lblNewLabel_2 = new JLabel("Copyright © 2023 Bazura Grill ");
	    lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
	    lblNewLabel_2.setBounds(152, 807, 234, 26);
	    frame.getContentPane().add(lblNewLabel_2);
	}
}
