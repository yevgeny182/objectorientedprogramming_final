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
import javax.swing.JMenuItem;
import java.awt.Button;
import java.awt.List;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		panel_1.setBackground(UIManager.getColor("Button.background"));
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuPage.main(null);
				panel.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(Color.decode("#f0f0f0"));
			}
		});
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(10, 166, 204, 45);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
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
			@Override
			public void mouseClicked(MouseEvent e) {
				Orders.main(null);
				panel.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_1.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_1.setBackground(Color.decode("#f0f0f0"));
			}
		});
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBounds(10, 216, 204, 45);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
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
			@Override
			public void mouseClicked(MouseEvent e) {
				BazMenu.main(null);
				panel.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_2.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_2.setBackground(Color.decode("#f0f0f0"));
			}
		});
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBounds(10, 265, 204, 45);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		
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
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main M = new Main();
				Main.main(null);
				panel.setVisible(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_3.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_3.setBackground(Color.decode("#f0f0f0"));
			}
		});
		panel_1_3.setForeground(Color.BLACK);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBounds(10, 362, 204, 45);
		panel.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Logout");
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(99, 11, 49, 23);
		panel_1_3.add(lblNewLabel_1);
		
		
		Image Logout = new ImageIcon(this.getClass().getResource("/logout-icon.png")).getImage();
		Image LogoutSize = Logout.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon LogoutIcon = new ImageIcon(LogoutSize);
		
		JLabel logout = new JLabel(LogoutIcon);
		logout.setBounds(37, 0, 41, 45);
		panel_1_3.add(logout);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transactions.main(null);
				panel.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_3_1.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_3_1.setBackground(Color.decode("#f0f0f0"));
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
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.decode("#6d6d6d"));
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
		
		Image addbutton = new ImageIcon(this.getClass().getResource("/addbutton.png")).getImage();
		Image imgSize = addbutton.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
		ImageIcon addB = new ImageIcon(imgSize);
		
		JLabel lblNewLabel_5 = new JLabel(addB);
		lblNewLabel_5.setToolTipText("Add New Orders");
		lblNewLabel_5.setBounds(354, 716, 100, 100);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Activity Yesterday:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(27, 89, 166, 31);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(19, 121, 435, 84);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("<date>");
		lblNewLabel_7.setBounds(10, 11, 50, 27);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Orders");
		lblNewLabel_7_1.setBounds(102, 46, 41, 27);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Revenue");
		lblNewLabel_7_1_1.setBounds(165, 46, 61, 27);
		panel_2.add(lblNewLabel_7_1_1);
		
		JButton btnDownload = new JButton("Download");
		btnDownload.setForeground(new Color(255, 255, 255));
		btnDownload.setBackground(SystemColor.textHighlight);
		btnDownload.setBounds(235, 46, 96, 26);
		panel_2.add(btnDownload);
		
		JButton btnNewButton_1_1 = new JButton("Close");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(255, 69, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(347, 46, 67, 27);
		panel_2.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_8 = new JLabel("<dummy>");
		lblNewLabel_8.setBounds(92, 32, 84, 14);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("<dummy>");
		lblNewLabel_8_1.setBounds(165, 32, 61, 14);
		panel_2.add(lblNewLabel_8_1);
		
		
		
		
		
	}
}
