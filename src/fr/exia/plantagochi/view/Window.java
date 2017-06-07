package fr.exia.plantagochi.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setTitle("Plantagochi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 574);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel iconLuminosite = new JLabel("");
		iconLuminosite.setHorizontalAlignment(SwingConstants.CENTER);
		iconLuminosite.setIcon(new ImageIcon(Window.class.getResource("/fr/exia/plantagochi/view/icon-moon.jpg")));
		iconLuminosite.setBounds(29, 27, 63, 58);
		contentPane.add(iconLuminosite);
		
		JLabel labelTemperatureAir = new JLabel("0 T\u00B0");
		labelTemperatureAir.setHorizontalAlignment(SwingConstants.CENTER);
		labelTemperatureAir.setForeground(new Color(50, 205, 50));
		labelTemperatureAir.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelTemperatureAir.setBounds(354, 52, 77, 51);
		contentPane.add(labelTemperatureAir);
		
		JLabel labelHumiditeAir = new JLabel("0 %");
		labelHumiditeAir.setHorizontalAlignment(SwingConstants.CENTER);
		labelHumiditeAir.setForeground(new Color(65, 105, 225));
		labelHumiditeAir.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelHumiditeAir.setBounds(354, 114, 77, 51);
		contentPane.add(labelHumiditeAir);
		
		JLabel labelHumiditeSol = new JLabel("0 %");
		labelHumiditeSol.setHorizontalAlignment(SwingConstants.CENTER);
		labelHumiditeSol.setForeground(new Color(65, 105, 225));
		labelHumiditeSol.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelHumiditeSol.setBounds(247, 434, 77, 51);
		contentPane.add(labelHumiditeSol);
		
		JButton buttonSwitchLumiere = new JButton("Allumer");
		buttonSwitchLumiere.setBounds(10, 502, 89, 23);
		contentPane.add(buttonSwitchLumiere);
		
		JLabel iconBackground = new JLabel("");
		iconBackground.setIcon(new ImageIcon(Window.class.getResource("/fr/exia/plantagochi/view/background-plante.png")));
		iconBackground.setBounds(10, 11, 351, 514);
		contentPane.add(iconBackground);
	}
}
