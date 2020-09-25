import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;
	private JTextField tfPlaca;
	private JTextField tfMotor;
	private JTextField tfData;
	private JTextField tfHora;
	private JTextField tfNome;
	private JTextField tfTel;
	private JTextField tfRg;
	private JTextField tfEscola;
	private JTextField tfPlcConsulta;
	private JTextField tfDatCons;
	private JTextField tfHrCons;
	private Empresa empresa = new Empresa();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Viagem viagemAtual, viagemCons;
	private JButton btnValTot;
	private JButton btnQtdPass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Viagem:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 68, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setBounds(10, 38, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Municipal", "Intermunicipal"}));
		cbTipo.setBounds(49, 35, 98, 20);
		frame.getContentPane().add(cbTipo);
		
		JLabel lblNewLabel_2 = new JLabel("Placa:");
		lblNewLabel_2.setBounds(10, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfPlaca = new JTextField();
		tfPlaca.setBounds(59, 60, 86, 20);
		frame.getContentPane().add(tfPlaca);
		tfPlaca.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Motorista:");
		lblNewLabel_3.setBounds(157, 38, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfMotor = new JTextField();
		tfMotor.setBounds(219, 35, 105, 20);
		frame.getContentPane().add(tfMotor);
		tfMotor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data:");
		lblNewLabel_4.setBounds(157, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfData = new JTextField();
		tfData.setBounds(190, 60, 60, 20);
		frame.getContentPane().add(tfData);
		tfData.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Hora:");
		lblNewLabel_5.setBounds(260, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tfHora = new JTextField();
		tfHora.setBounds(297, 60, 68, 20);
		frame.getContentPane().add(tfHora);
		tfHora.setColumns(10);
		
		JButton btnViagem = new JButton("OK");
		btnViagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cbTipo.getSelectedIndex() == 0) {
					Municipal m = new Municipal(tfPlaca.getText(), tfMotor.getText(), LocalDate.parse(tfData.getText(), formatter), LocalTime.parse(tfHora.getText()));
					empresa.addViagens(m);
					viagemAtual = m;
					JOptionPane.showMessageDialog(frame, "Viagem Municipal registrada com sucesso!");
				}
				else if (cbTipo.getSelectedIndex() == 1) {
					Intermunicipal i = new Intermunicipal(tfPlaca.getText(), tfMotor.getText(), LocalDate.parse(tfData.getText(), formatter), LocalTime.parse(tfHora.getText()));
					empresa.addViagens(i);
					viagemAtual = i;
					JOptionPane.showMessageDialog(frame, "Viagem Intermunicipal registrada com sucesso!");
				}
			}
		});
		btnViagem.setBounds(368, 59, 57, 23);
		frame.getContentPane().add(btnViagem);
		
		JLabel lblNewLabel_6 = new JLabel("Passageiros:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(8, 106, 99, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Tipo:");
		lblNewLabel_7.setBounds(8, 131, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JComboBox cbPass = new JComboBox();
		cbPass.setModel(new DefaultComboBoxModel(new String[] {"Regular", "Estudante", "Idoso"}));
		cbPass.setBounds(53, 126, 98, 20);
		frame.getContentPane().add(cbPass);
		
		JLabel lblNewLabel_8 = new JLabel("Nome:");
		lblNewLabel_8.setBounds(10, 155, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		tfNome = new JTextField();
		tfNome.setBounds(65, 153, 86, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Telefone:");
		lblNewLabel_9.setBounds(10, 177, 68, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		tfTel = new JTextField();
		tfTel.setBounds(75, 178, 76, 20);
		frame.getContentPane().add(tfTel);
		tfTel.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Idade:");
		lblNewLabel_10.setBounds(163, 131, 46, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JSpinner spIdade = new JSpinner();
		spIdade.setModel(new SpinnerNumberModel(0, null, 130, 1));
		spIdade.setBounds(212, 127, 50, 20);
		frame.getContentPane().add(spIdade);
		
		JLabel lblNewLabel_11 = new JLabel("RG:");
		lblNewLabel_11.setBounds(161, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		tfRg = new JTextField();
		tfRg.setBounds(212, 154, 86, 20);
		frame.getContentPane().add(tfRg);
		tfRg.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Escola:");
		lblNewLabel_12.setBounds(162, 178, 46, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		tfEscola = new JTextField();
		tfEscola.setBounds(212, 180, 86, 20);
		frame.getContentPane().add(tfEscola);
		tfEscola.setColumns(10);
		
		JButton btnPass = new JButton("Salvar");
		btnPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cbPass.getSelectedIndex() == 0) {
					Passageiro p = new Passageiro(tfNome.getText(), tfTel.getText(), Integer.parseInt(spIdade.getValue().toString()));
					viagemAtual.addPassageiro(p);
					JOptionPane.showMessageDialog(frame, "Passageiro "+ p.getNome()+" adicionado com sucesso!");
				}
				else if (cbPass.getSelectedIndex() == 1) {
					Estudante e = new Estudante(tfNome.getText(), tfTel.getText(), Integer.parseInt(spIdade.getValue().toString()), tfEscola.getText());
					viagemAtual.addPassageiro(e);
					JOptionPane.showMessageDialog(frame, "Estudante "+ e.getNome()+" adicionado com sucesso!");
				}
				else if (cbPass.getSelectedIndex() == 2) {
					if ( Integer.parseInt(spIdade.getValue().toString()) < 60) {
						JOptionPane.showMessageDialog(frame, "Você não pode cadastrar um Idoso com menos de 60 anos!!");
					}
					else {
						Idoso i = new Idoso(tfRg.getText(), tfNome.getText(), tfTel.getText(), Integer.parseInt(spIdade.getValue().toString()));
						viagemAtual.addPassageiro(i);
						JOptionPane.showMessageDialog(frame, "Idoso "+ i.getNome()+" adicionado com sucesso!");
					}	
				}
			}
		});
		btnPass.setBounds(311, 177, 89, 23);
		frame.getContentPane().add(btnPass);
		
		JButton btnMaisVelhos = new JButton("Exibir Mais Velhos");
		btnMaisVelhos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Passageiros com a maior idade:\n"+empresa.getPassageirosMaisVelhos());
			}
		});
		btnMaisVelhos.setBounds(287, 103, 137, 23);
		frame.getContentPane().add(btnMaisVelhos);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(9, 215, 414, 3);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 92, 414, 3);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_13 = new JLabel("Consultar Viagem:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setBounds(10, 228, 138, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_2_1 = new JLabel("Placa:");
		lblNewLabel_2_1.setBounds(10, 253, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		tfPlcConsulta = new JTextField();
		tfPlcConsulta.setColumns(10);
		tfPlcConsulta.setBounds(61, 253, 86, 20);
		frame.getContentPane().add(tfPlcConsulta);
		
		JLabel lblNewLabel_4_1 = new JLabel("Data:");
		lblNewLabel_4_1.setBounds(10, 278, 46, 14);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		tfDatCons = new JTextField();
		tfDatCons.setColumns(10);
		tfDatCons.setBounds(61, 275, 86, 20);
		frame.getContentPane().add(tfDatCons);
		
		JLabel lblNewLabel_5_1 = new JLabel("Hora:");
		lblNewLabel_5_1.setBounds(10, 300, 46, 14);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		tfHrCons = new JTextField();
		tfHrCons.setColumns(10);
		tfHrCons.setBounds(61, 297, 86, 20);
		frame.getContentPane().add(tfHrCons);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalTime hora = LocalTime.parse(tfHrCons.getText());
				LocalDate data = LocalDate.parse(tfDatCons.getText(), formatter);
				boolean entrou = false;
				for (int i = 0; i < empresa.getLista().size(); i++) {
					if (tfPlcConsulta.getText().contentEquals(empresa.getLista().get(i).getPlaca()) && data.equals(empresa.getLista().get(i).getData()) && hora.equals(empresa.getLista().get(i).getHora())) {
						btnValTot.setEnabled(true);
						btnQtdPass.setEnabled(true);
						viagemCons = empresa.getLista().get(i);
						entrou = true;
					}
				}
				if (!entrou) {
					JOptionPane.showMessageDialog(frame, "Não há viagens com esses dados!");
				}
			}
		});
		btnConsulta.setBounds(10, 325, 137, 23);
		frame.getContentPane().add(btnConsulta);
		
		btnValTot = new JButton("Valor Total Arrecadado");
		btnValTot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "O valor total arrecadado foi de "+viagemCons.getValorTotal());
			}
		});
		btnValTot.setEnabled(false);
		btnValTot.setBounds(209, 263, 203, 23);
		frame.getContentPane().add(btnValTot);
		
		btnQtdPass = new JButton("QtdPassageiros e Ociosidade");
		btnQtdPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (viagemCons.getClass().getName().contentEquals("Municipal")) {
					JOptionPane.showMessageDialog(frame, "Essa viagem teve " + 
														viagemCons.getQtdPassageiros()+ 
														" passageiros e ociosidade igual a "+ 
														(55 - viagemCons.getQtdPassageiros()));
				}
				else if (viagemCons.getClass().getName().contentEquals("Intermunicipal")) {
					JOptionPane.showMessageDialog(frame, "Essa viagem teve " +
														viagemCons.getQtdPassageiros()+ 
														" passageiros e ociosidade igual a "
														+ (20 - viagemCons.getQtdPassageiros()));
				}
				
			}
		});
		btnQtdPass.setEnabled(false);
		btnQtdPass.setBounds(209, 296, 203, 23);
		frame.getContentPane().add(btnQtdPass);
	}
}
