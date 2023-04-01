package finalproj;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;


public class MenuPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPage window = new MenuPage();
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
	public MenuPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public JSplitPane splitPane;
	public JToggleButton toggle;
	private void initialize() {
		frame = new JFrame("Main Menu");
		frame.setBounds(100, 100, 480, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
	
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBackground(SystemColor.textHighlightText);
		panel.setBounds(0, 0, 224, 861);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setForeground(SystemColor.textText);
		panel_1.setBounds(10, 166, 204, 45);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Home");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(99, 11, 49, 23);
		panel_1.add(lblNewLabel_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBounds(10, 216, 204, 45);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Orders");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(99, 11, 49, 23);
		panel_1_1.add(lblNewLabel_1_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBounds(10, 265, 204, 45);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Menu");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(99, 11, 49, 23);
		panel_1_2.add(lblNewLabel_1_1);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main M = new Main();
				Main.main(null);
			}
			
		});
		panel_1_3.setForeground(Color.BLACK);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBounds(10, 362, 204, 45);
		panel.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Logout");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Main M = new Main();
				Main.main(null);
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(99, 11, 49, 23);
		panel_1_3.add(lblNewLabel_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setForeground(Color.BLACK);
		panel_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3_1.setBounds(10, 314, 204, 45);
		panel.add(panel_1_3_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Transactions");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(96, 11, 98, 23);
		panel_1_3_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2 = new JLabel("Copyright © 2023 Bazura Grill ");
		lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(23, 808, 234, 26);
		panel.add(lblNewLabel_2);
		
		Image newimg = new ImageIcon(this.getClass().getResource("/Graphicloads-Food-Drink-Beer.256.png")).getImage();
		Image scaledImage = newimg.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(scaledImage);
		
		JLabel lblNewLabel_3 = new JLabel(icon);
		lblNewLabel_3.setBounds(10, 11, 119, 115);
		panel.add(lblNewLabel_3);
		
		Image menuicon = new ImageIcon(this.getClass().getResource("/iconbasic.png")).getImage();
		Image scaledImage2 = menuicon.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon mIcon = new ImageIcon(scaledImage2);
		
		JLabel lblNewLabel = new JLabel(mIcon);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
			}
		});
		
		lblNewLabel.setBounds(177, 11, 37, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Bazura Grill");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(23, 137, 71, 26);
		panel.add(lblNewLabel_2_1);
		
		

		
		JLabel outside = new JLabel(mIcon);
		outside.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(true);
			}
		});
		outside.setBounds(11, 11, 37, 37);
		frame.getContentPane().add(outside);
		
		JLabel lblNewLabel_4 = new JLabel("Home Page");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(186, 17, 110, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		
		
		
	}


}
