package common.src.main.GUI.src.WinBuilder;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

public class endScreen {

	private JFrame frmEndScreen;
	private JLabel score_1, score_2, actualLevelLabel;
	private JButton btnNewButton, btnNewButton_1;
	private JLabel atLevel;
	private JPanel panel = new JPanel();
	private JPanel panel_1 = new JPanel();
	private JPanel panel_2 = new JPanel();
	private JPanel panel_3 = new JPanel();

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					endScreen window = new endScreen();
					window.frmEndScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public endScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEndScreen = new JFrame();
		frmEndScreen.setVisible(true);
		frmEndScreen.setTitle("End Screen");
		frmEndScreen.setBounds(100, 100, 450, 300);
		frmEndScreen.setSize(1000,700);
		frmEndScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEndScreen.getContentPane().setLayout(null);
		frmEndScreen.setResizable(false);
		
		JLabel lblNewLabel_7 = new JLabel("HIGH SCORE");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_7.setBounds(41, 5, 104, 16);
		panel_3.add(lblNewLabel_7);
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_5 = new JLabel("PLAYER 1");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(6, 43, 71, 16);
		panel_3.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		
		// Player1 score
		score_1 = new JLabel("0");
		score_1.setBounds(115, 39, 16, 26);
		panel_3.add(score_1);
		score_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));

		JLabel lblNewLabel_6 = new JLabel("PLAYER 2");
		lblNewLabel_6.setBounds(6, 85, 61, 16);
		panel_3.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		
		// Player2 score
		score_2 = new JLabel("0");
		score_2.setBounds(115, 85, 16, 16);
		panel_3.add(score_2);

		
		btnNewButton = new JButton("Restart");
		btnNewButton.setBounds(115, 156, 88, 29);
		btnNewButton.setVisible(false);
		btnNewButton.setEnabled(false);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back to Menu");
		btnNewButton_1.setBounds(98, 197, 128, 29);
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setEnabled(false);
		panel.add(btnNewButton_1);

		// Level number
		actualLevelLabel = new JLabel("");
		panel.add(actualLevelLabel);

		// "Level" text
		
		atLevel = new JLabel("New label");
		atLevel.setBounds(128, 288, 61, 16);
		panel.add(atLevel);
		atLevel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel levelLabel = new JLabel("");
		levelLabel.setBounds(128, 261, 61, 60);
		Image img1 = new ImageIcon(this.getClass().getResource("/imgLevel.png")).getImage();
		levelLabel.setIcon(new ImageIcon(img1));
		panel.add(levelLabel);
		
		JLabel lblNewLabel_4 = new JLabel("LEVEL");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_4.setBounds(137, 252, 80, 16);
		panel.add(lblNewLabel_4);

		panel_3.setBackground(new Color(47, 79, 79));
		panel_3.setBounds(418, 50, 175, 114);
		frmEndScreen.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		panel_2.setBounds(76, 85, 80, 16);
		panel_3.add(panel_2);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);

		panel_1.setBounds(76, 43, 80, 16);
		panel_3.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);

		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(339, 176, 324, 370);
		frmEndScreen.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/bg.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(-15, 0, 832, 684);
		frmEndScreen.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(817, 70, 61, 16);
		frmEndScreen.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(781, 0, 256, 684);
		lblNewLabel_2.setIcon(new ImageIcon(img));
		frmEndScreen.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(209, 46, 80, 16);
		frmEndScreen.getContentPane().add(lblNewLabel_8);
	
	}

	public void setScore(int player, int score) {
		if (player == 1) {
			score_1.setText("" + score);
			score_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		} else if (player == 2) {
			score_2.setText("" + score);
			score_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		}
	}

	public void setLevel(int level) {
		atLevel.setText("" + level);
		atLevel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
	}
	public void closeWindow() {
		frmEndScreen.setVisible(false);
	}

	public void createResetButton() {
		btnNewButton.setVisible(true);
		btnNewButton.setEnabled(true);
	}

	public void createBackButton() {
		btnNewButton_1.setVisible(true);
		btnNewButton_1.setEnabled(true);
	}

	public JButton getBackButton() {
		return btnNewButton_1;
	}
}
