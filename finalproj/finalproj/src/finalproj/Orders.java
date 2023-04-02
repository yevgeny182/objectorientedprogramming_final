package finalproj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Orders {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orders window = new Orders();
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
	public Orders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Orders");
		frame.setBounds(100, 100, 480, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(247, 370, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 224, 861);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
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
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(177, 11, 37, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Bazura Grill");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(23, 137, 71, 26);
		panel.add(lblNewLabel_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(Color.decode("#f0f0f0"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuPage.main(null);
			}
		});
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(10, 166, 204, 45);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Home");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(99, 11, 49, 23);
		panel_1.add(lblNewLabel_1_2);
		
		Image home = new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		Image iconSize = home.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon homeIcon = new ImageIcon(iconSize);
		
		JLabel lblNewLabel_6 = new JLabel(homeIcon);
		lblNewLabel_6.setBounds(35, 0, 41, 45);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				panel_1_1.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_1.setBackground(Color.decode("#f0f0f0"));
			}
		});
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBounds(10, 216, 204, 45);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Orders");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(99, 11, 49, 23);
		panel_1_1.add(lblNewLabel_1_3);
		
		Image orders = new ImageIcon(this.getClass().getResource("/order.png")).getImage();
		Image orderSize = orders.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon orderIcon = new ImageIcon(orderSize);
		
		JLabel lblNewLabel_6_1 = new JLabel(orderIcon);
		lblNewLabel_6_1.setBounds(35, 0, 41, 45);
		panel_1_1.add(lblNewLabel_6_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				panel_1_2.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_2.setBackground(Color.decode("#f0f0f0"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_1_2.setLayout(null);
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBounds(10, 265, 204, 45);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Menu");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(99, 11, 49, 23);
		panel_1_2.add(lblNewLabel_1_1);
		
		Image Menu = new ImageIcon(this.getClass().getResource("/pot.png")).getImage();
		Image menuSize = Menu.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon menuIcon = new ImageIcon(menuSize);
		
		JLabel lblNewLabel_6_1_1 = new JLabel(menuIcon);
		lblNewLabel_6_1_1.setBounds(35, 0, 41, 45);
		panel_1_2.add(lblNewLabel_6_1_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_3_1.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_3_1.setBackground(Color.decode("#f0f0f0"));
			}
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setForeground(Color.BLACK);
		panel_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3_1.setBounds(10, 314, 204, 45);
		panel.add(panel_1_3_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Transactions");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(96, 11, 98, 23);
		panel_1_3_1.add(lblNewLabel_1_4);
		
		Image trans = new ImageIcon(this.getClass().getResource("/transact.png")).getImage();
		Image transSize = trans.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon transIcon = new ImageIcon(transSize);
		
		JLabel transact = new JLabel(transIcon);
		transact.setBounds(35, 0, 41, 45);
		panel_1_3_1.add(transact);
		
		JLabel lblNewLabel_2 = new JLabel("Copyright © 2023 Bazura Grill ");
		lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(22, 808, 234, 26);
		panel.add(lblNewLabel_2);
		
		
		
		JLabel outside = new JLabel(mIcon);
		outside.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(true);
			}
		});
		outside.setBounds(11, 11, 37, 37);
		frame.getContentPane().add(outside);
		
	}

}
