import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Janela {

	private JFrame frame;
	private JTextField tfQtdVetor;
	private JTextField tfValor;
	private JTextField tfPosicao;
	private VetorDeReais vetor;
	private VetorDeReais armz;
	private JButton btnOK;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qtd vetor:");
		lblNewLabel.setBounds(35, 29, 82, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfQtdVetor = new JTextField();
		tfQtdVetor.setBounds(119, 26, 86, 20);
		frame.getContentPane().add(tfQtdVetor);
		tfQtdVetor.setColumns(10);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				armz = vetor;
				vetor = new VetorDeReais(Integer.parseInt(tfQtdVetor.getText()));
				tfValor.setEditable(true);
				tfPosicao.setEditable(true);
				btnOK.setEnabled(true);
			}
		});
		btnCriar.setBounds(215, 25, 89, 23);
		frame.getContentPane().add(btnCriar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 54, 391, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Inserir");
		lblNewLabel_1.setBounds(35, 84, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfValor = new JTextField();
		tfValor.setEditable(false);
		tfValor.setBounds(91, 81, 86, 20);
		frame.getContentPane().add(tfValor);
		tfValor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("valor");
		lblNewLabel_2.setBounds(119, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfPosicao = new JTextField();
		tfPosicao.setEditable(false);
		tfPosicao.setBounds(218, 81, 86, 20);
		frame.getContentPane().add(tfPosicao);
		tfPosicao.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("posi\u00E7\u00E3o");
		lblNewLabel_3.setBounds(240, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("na");
		lblNewLabel_4.setBounds(187, 84, 21, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnOK = new JButton("OK");
		btnOK.setEnabled(false);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vetor.setValor(Double.parseDouble(tfValor.getText()), Integer.parseInt(tfPosicao.getText()));
			}
		});
		btnOK.setBounds(334, 80, 67, 23);
		frame.getContentPane().add(btnOK);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 122, 391, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnPares = new JButton("Qtd Pares");
		btnPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(String.valueOf(vetor.getQtdPares()));
			}
		});
		btnPares.setBounds(10, 130, 107, 23);
		frame.getContentPane().add(btnPares);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(vetor.toString());
			}
		});
		btnExibir.setBounds(127, 130, 89, 23);
		frame.getContentPane().add(btnExibir);
		
		JButton btnInverter = new JButton("Inverter");
		btnInverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor.inverterVetor();
			}
		});
		btnInverter.setBounds(228, 130, 89, 23);
		frame.getContentPane().add(btnInverter);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 201, 391, 107);
		frame.getContentPane().add(textArea);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(""+vetor.dividirReais(armz));
			}
		});
		btnDividir.setBounds(10, 164, 107, 23);
		frame.getContentPane().add(btnDividir);
		
		JButton btnDif = new JButton("Maior Diferenca");
		btnDif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(""+vetor.calcularMaiorDiferenca());
			}
		});
		btnDif.setBounds(119, 164, 142, 23);
		frame.getContentPane().add(btnDif);
		
		JButton btnMult = new JButton("Multiplicar");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(""+vetor.multiplicarReais(armz));
			}
		});
		btnMult.setBounds(265, 164, 89, 23);
		frame.getContentPane().add(btnMult);
	}
}
