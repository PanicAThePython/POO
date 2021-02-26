import java.awt.EventQueue;

import javax.swing.Jpanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Telinha {

	private JPanel panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel enigmaStatus_1;

	private Enigma pl = new PredicateLogic();
	


	/**
	 * Create the application.
	 */
	public Telinha() {
		initialize();
	}

	public JPanel getJPanel() {
		return this.panel;
	}
	/**
	 * Initialize the contents of the panel.
	 */
	private void initialize() {
		
		panel = new JPanel();

		panel.setLayout(null);
		panel.setSize(350, 250);
		
		//panel vira nome do painel
		
		JLabel lblNewLabel = new JLabel("Se todo homem \u00E9 um ser racional e \r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("se todo ser racional tem enc\u00E9falo desenvolvido, ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 53, 373, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ent\u00E3o toda mulher \u00E9 racional e \r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 69, 434, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C9 evidente, atrav\u00E9s do enunciado, que:");
		lblNewLabel_3.setBounds(10, 112, 300, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				module.setEnigma(pl);
				module.incrementNumberExec();
				
				if (rdbtnNewRadioButton_2.isSelected()) {
					enigmaStatus_1.setText("DESARMADA");
					enigmaStatus_1.setForeground(Color.GREEN);
					module.incrementRightAnswers();
					module.setDefused(true);
					btnOK.setVisible(false);
				}
				else {
					module.incrementWrongsAnswers();
					if (module.getWrongAnswers() == 3) {
						btnOK.setVisible(false);
						JOptionPane.showMessageDialog(panel, "BOOM!!");
					}
					else {
						JOptionPane.showMessageDialog(panel, "Você errou");
					}
				}
			}
		});
		btnOK.setBounds(251, 218, 89, 23);
		panel.add(btnOK);
		
		enigmaStatus_1 = new JLabel("ARMADA");
		enigmaStatus_1.setForeground(Color.RED);
		enigmaStatus_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		enigmaStatus_1.setBounds(227, 11, 123, 14);
		panel.add(enigmaStatus_1);
		
		JLabel lblNewLabel_4 = new JLabel("tem enc\u00E9falo desenvolvido.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 87, 256, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Se todo homem \u00E9 um ser racional e\r\n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 36, 286, 14);
		panel.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("(\u2200x)(mulher(x) ^ homem(x))");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(0, 133, 232, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("(\u2200x)(homem(x) \u2194 mulher(x))\r\n");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(0, 159, 278, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("(\u2200x)(ser(x)^((homem(x) v mulher(x))^\u00AC(homem(x)^mulher(x))))");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(0, 185, 350, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("(\u2203x)(ser(x))");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(0, 211, 109, 23);
		panel.add(rdbtnNewRadioButton_3);
	}
}
