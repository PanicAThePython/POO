import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;

public class LayoutSolvingOrder {
	private int numberOfSolvingSteps = 5;
	private boolean isArmed = true;

	private Enigma pl = new PredicateLogic();

	private JPanel panel;
	private JLabel lblWarning;
	private ModuloM03 module;

	/**
	 * Create the application.
	 */
	public LayoutSolvingOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the panel.
	 */
	private void initialize() {
		panel = new JPanel();
		panel.setLayout(null);
		
		final BlinkLabel lblArmed = new BlinkLabel("ARMED");
		lblArmed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblArmed.setForeground(Color.RED);
		lblArmed.setBounds(307, 11, 133, 14);
		panel.add(lblArmed);
		
		JLabel lblFirstPremise = new JLabel("B -> (A -> C)");
		lblFirstPremise.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstPremise.setBounds(14, 54, 238, 14);
		panel.add(lblFirstPremise);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-16, 48, 567, 2);
		panel.add(separator);
		
		JLabel lblFirstSolving = new JLabel("A -> C");
		lblFirstSolving.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstSolving.setBounds(14, 85, 238, 14);
		panel.add(lblFirstSolving);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(-14, 78, 573, 2);
		panel.add(separator_2);
		
		JLabel lblSecondSolving = new JLabel("B");
		lblSecondSolving.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecondSolving.setBounds(14, 117, 238, 14);
		panel.add(lblSecondSolving);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(-16, 110, 289, 2);
		panel.add(separator_1_1);
		
		JLabel lblNewLabel = new JLabel("With the given premises, choose the correct solving order.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(37, 27, 405, 20);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Premises");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(342, 43, 99, 39);
		panel.add(lblNewLabel_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(-16, 142, 289, 2);
		panel.add(separator_1_1_1);
		
		JLabel lbThirdSolving = new JLabel("C");
		lbThirdSolving.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbThirdSolving.setBounds(14, 147, 238, 14);
		panel.add(lbThirdSolving);
		
		JLabel lbFourthSolving = new JLabel("B ^ C");
		lbFourthSolving.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbFourthSolving.setBounds(14, 180, 238, 14);
		panel.add(lbFourthSolving);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(-16, 172, 289, 2);
		panel.add(separator_1_1_1_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(-17, 236, 573, 2);
		panel.add(separator_2_1);
		
		JLabel lblConclusion = new JLabel("B ^ C -> A");
		lblConclusion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConclusion.setBounds(14, 248, 238, 14);
		panel.add(lblConclusion);
		
		JLabel lblNewLabel_1_1 = new JLabel("Conclusion");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(342, 236, 108, 39);
		panel.add(lblNewLabel_1_1);

		String[] solvingSteps = new String[numberOfSolvingSteps];
		
		for (int i = 0; i < numberOfSolvingSteps; i++) {
			solvingSteps[i] = Integer.toString(i + 1);
		}
		
		int[] correctAnswers_1 = {3, 2, 4, 1, 5};
		int[] correctAnswers_2 = {4, 2, 3, 1, 5};
		int[] correctAnswers_3 = {4, 3, 2, 1, 5};
		
 		JComboBox firstComboBox = new JComboBox(solvingSteps);
		firstComboBox.setBounds(342, 84, 62, 20);
		firstComboBox.setSelectedIndex(-1);
		panel.add(firstComboBox);
		
		
		JComboBox secondComboBox = new JComboBox(solvingSteps);
		secondComboBox.setBounds(342, 116, 62, 20);
		secondComboBox.setSelectedIndex(-1);
		panel.add(secondComboBox);
		
		JComboBox thirdComboBox = new JComboBox(solvingSteps);
		thirdComboBox.setBounds(342, 146, 62, 20);
		thirdComboBox.setSelectedIndex(-1);
		panel.add(thirdComboBox);
		
		JComboBox fourthComboBox = new JComboBox(solvingSteps);
		fourthComboBox.setBounds(342, 179, 62, 20);
		fourthComboBox.setSelectedIndex(-1);
		panel.add(fourthComboBox);
		
		JComboBox FifthComboBox = new JComboBox(solvingSteps);
		FifthComboBox.setSelectedIndex(-1);
		FifthComboBox.setBounds(342, 212, 62, 20);
		panel.add(FifthComboBox);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				module.setEnigma(pl);
				module.incrementNumberExec();
				int[] answers = new int[numberOfSolvingSteps];
				JComboBox[] comboBoxes = {firstComboBox, secondComboBox, thirdComboBox, fourthComboBox, FifthComboBox};
				boolean fieldIsEmpty = false;
				
				for (int i = 0; i < comboBoxes.length; i++) {
					try {
						answers[i] = Integer.parseInt(comboBoxes[i].getSelectedItem().toString());
					}
					catch (NullPointerException npe) {
						fieldIsEmpty = true;
					}
				}
						
				if (Arrays.equals(answers, correctAnswers_1) || Arrays.equals(answers, correctAnswers_2) || Arrays.equals(answers, correctAnswers_3)) {
					module.incrementRightAnswers();
					module.setDefused(true);
					isArmed = false;
					lblArmed.setText("UNARMED");
					lblArmed.setBlinking(false);
					lblArmed.setForeground(Color.GREEN);
					lblArmed.setArmed(isArmed);
					btnConfirm.setVisible(false);

				}
				else if (fieldIsEmpty) {
					lblWarning.setText("Incomplete fields");
					lblWarning.setVisible(true);
				}
				
				else {
					module.incrementWrongAnswers();

				}
			
			}
		});
		btnConfirm.setBounds(342, 266, 89, 23);
		panel.add(btnConfirm);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setBounds(14, 213, 238, 14);
		panel.add(lblA);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setBounds(-16, 205, 289, 2);
		panel.add(separator_1_1_1_1_1);
		
		lblWarning = new JLabel("New label");
		lblWarning.setForeground(Color.RED);
		lblWarning.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWarning.setBounds(14, 270, 328, 14);
		lblWarning.setVisible(false);
		panel.add(lblWarning);

	}
	
	public JPanel getJPanel() {
		return this.panel;
	}

	

	
}
