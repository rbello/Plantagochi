package fr.exia.plantagochi.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame {

	private static final long serialVersionUID = 2787042749006344377L;

	private JPanel contentPane;
	private JLabel iconLuminosite;
	private JLabel labelTemperatureAir;
	private JLabel labelHumiditeAir;
	private JLabel labelHumiditeSol;
	private JLabel iconBackground;
	private JButton buttonSwitchLumiere;

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
		
		iconLuminosite = new JLabel("");
		iconLuminosite.setHorizontalAlignment(SwingConstants.CENTER);
		iconLuminosite.setIcon(new ImageIcon(Window.class.getResource("/fr/exia/plantagochi/view/icon-moon.jpg")));
		iconLuminosite.setBounds(29, 27, 63, 58);
		contentPane.add(iconLuminosite);
		
		labelTemperatureAir = new JLabel("0 T\u00B0");
		labelTemperatureAir.setHorizontalAlignment(SwingConstants.CENTER);
		labelTemperatureAir.setForeground(new Color(50, 205, 50));
		labelTemperatureAir.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelTemperatureAir.setBounds(339, 52, 106, 51);
		contentPane.add(labelTemperatureAir);
		
		labelHumiditeAir = new JLabel("0 %");
		labelHumiditeAir.setHorizontalAlignment(SwingConstants.CENTER);
		labelHumiditeAir.setForeground(new Color(65, 105, 225));
		labelHumiditeAir.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelHumiditeAir.setBounds(339, 114, 106, 51);
		contentPane.add(labelHumiditeAir);
		
		labelHumiditeSol = new JLabel("0 %");
		labelHumiditeSol.setHorizontalAlignment(SwingConstants.CENTER);
		labelHumiditeSol.setForeground(new Color(65, 105, 225));
		labelHumiditeSol.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelHumiditeSol.setBounds(247, 434, 114, 51);
		contentPane.add(labelHumiditeSol);
		
		buttonSwitchLumiere = new JButton("Allumer");
		buttonSwitchLumiere.setBounds(10, 502, 89, 23);
		contentPane.add(buttonSwitchLumiere);
		
		iconBackground = new JLabel("");
		iconBackground.setIcon(new ImageIcon(Window.class.getResource("/fr/exia/plantagochi/view/background-plante.png")));
		iconBackground.setBounds(10, 11, 351, 514);
		contentPane.add(iconBackground);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getIconLuminosite() {
		return iconLuminosite;
	}

	public JLabel getLabelTemperatureAir() {
		return labelTemperatureAir;
	}

	public JLabel getLabelHumiditeAir() {
		return labelHumiditeAir;
	}

	public JLabel getLabelHumiditeSol() {
		return labelHumiditeSol;
	}

	public JButton getButtonSwitchLumiere() {
		return buttonSwitchLumiere;
	}

	public JLabel getIconBackground() {
		return iconBackground;
	}
	
}
