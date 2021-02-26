import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LayoutFibonacci {

	
	private ModuloM03 module;
	private JPanel panel;
	private JTextField answer;
	private static int[] fibonacci = new int[20];
	private int a, b;
	private JLabel armar;


	private Enigma lr = new LogicalReasoning();


	/**
	 * Create the application.
	 */
	public LayoutFibonacci() {
		initialize();
	}

	/**
	 * Initialize the contents of the panel.
	 */
	private void initialize() {
		Random r = new Random();
		a = r.nextInt(19);
		b = r.nextInt(19);
		int x = fibonacci[a];
		int y = fibonacci[b];
		int total = x+y;
		String result = ""+total;
		
		panel = new JPanel();
		panel.setSize(350, 250);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIBONACCI");
		lblNewLabel.setBounds(128, 22, 108, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel);
		
		answer = new JTextField();
		answer.setBounds(133, 157, 86, 20);
		panel.add(answer);
		answer.setColumns(10);
		
		JButton confBtt = new JButton("Confirm");
		confBtt.setBounds(134, 195, 86, 23);
		confBtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				module.setEnigma(lr);
				module.incrementNumberExec();
				
				if(answer.getText().equals(result)) {
					
					confBtt.setEnabled(false);
					armar.setForeground(Color.GREEN);
					module.incrementRightAnswers();
					module.setDefused(true);
					armar.setText("Desarmado");
				}
				else {
					module.incrementWrongsAnswers();
					if (module.getWrongAnswers() == 3) {
						confBtt.setVisible(false);
					}
				}
			}
			
		});
		panel.add(confBtt);
		
		JLabel lblNewLabel_1 = new JLabel("What is the sum of item " + a);
		lblNewLabel_1.setBounds(96, 72, 439, 32);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_1);
		
		armar = new JLabel("Armardo");
		armar.setBounds(267, 13, 73, 14);
		armar.setFont(new Font("Tahoma", Font.BOLD, 11));
		armar.setForeground(Color.RED);
		panel.add(armar);
		
		JLabel lblNewLabel_2 = new JLabel("and item " + b + " of the Fibonacci sequence?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(65, 116, 295, 14);
		panel.add(lblNewLabel_2);
	}
	
	public JPanel getJPanel() {
		return this.panel;
	}
	
	public static void populaVetor(int[] x) {
		x[0] = 0;
		x[1] = 1;
		for(int i = 2; i<x.length; i++) {
			x[i] = x[i-1] + x[i-2];
		}
	}
}

