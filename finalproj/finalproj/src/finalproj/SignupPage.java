package finalproj;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.UIManager;

public class SignupPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtDddd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage window = new SignupPage();
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
	public SignupPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Sign Up");
		frame.setBounds(100, 100, 480, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter a username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(116, 214, 184, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 239, 235, 33);
		frame.getContentPane().add(textField);
		
		JLabel lblEnterAPassword = new JLabel("Enter a password");
		lblEnterAPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterAPassword.setBounds(116, 283, 136, 18);
		frame.getContentPane().add(lblEnterAPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 312, 235, 33);
		frame.getContentPane().add(passwordField);
		
		txtDddd = new JTextField();
		
		txtDddd.setText("example@gmail.com");
		txtDddd.setToolTipText("example@gmail.com");
		txtDddd.setColumns(10);
		txtDddd.setBounds(116, 391, 235, 33);
		frame.getContentPane().add(txtDddd);
		
		JLabel lblEnterYourEmail = new JLabel("Enter your email address");
		lblEnterYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourEmail.setBounds(116, 362, 198, 18);
		frame.getContentPane().add(lblEnterYourEmail);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LandingPage.main(null);
			}
		});
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setBackground(new Color(0, 128, 0));
		btnConfirm.setBounds(166, 644, 134, 33);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(166, 701, 134, 33);
		frame.getContentPane().add(btnNewButton);
		
		
		Image newimg = new ImageIcon(this.getClass().getResource("/Graphicloads-Food-Drink-Beer.256.png")).getImage();
		Image scaledImage = newimg.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(scaledImage);
		JLabel lblNewLabel_1 = new JLabel(icon);
		lblNewLabel_1.setBounds(150, 53, 150, 150);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
