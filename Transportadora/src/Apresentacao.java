import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfPlaca;
	private JTextField tfModelo;
	private JTextField tfData;
	private JTextField tfCod;
	private JTextField tfDias;
	private JTextField tfCusto;
	private JTextField tfDesc;
	private JTextField tfAtiv;
	private JTextField tfCodCons;
	private Veiculo atualVeic;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 373, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ve\u00EDculo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Placa:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfPlaca = new JTextField();
		tfPlaca.setBounds(45, 33, 65, 20);
		frame.getContentPane().add(tfPlaca);
		tfPlaca.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo:");
		lblNewLabel_2.setBounds(120, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfModelo = new JTextField();
		tfModelo.setBounds(162, 33, 183, 20);
		frame.getContentPane().add(tfModelo);
		tfModelo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data da Aquisi\u00E7\u00E3o:");
		lblNewLabel_3.setBounds(10, 62, 100, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfData = new JTextField();
		tfData.setBounds(101, 59, 86, 20);
		frame.getContentPane().add(tfData);
		tfData.setColumns(10);
		
		JButton btnCadVeiculo = new JButton("Cadastrar");
		btnCadVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Veiculo v = new Veiculo(tfPlaca.getText(), tfModelo.getText(), LocalDate.parse(tfData.getText(), formatter));
				atualVeic = v;
				JOptionPane.showMessageDialog(frame, "Veículo cadastrado!");
			}
		});
		btnCadVeiculo.setBounds(256, 58, 89, 23);
		frame.getContentPane().add(btnCadVeiculo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(11, 87, 334, 1);
		frame.getContentPane().add(separator);
		
		JLabel lblManutenes = new JLabel("Manuten\u00E7\u00F5es");
		lblManutenes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblManutenes.setBounds(10, 97, 100, 14);
		frame.getContentPane().add(lblManutenes);
		
		JLabel lblNewLabel_4 = new JLabel("C\u00F3digo:");
		lblNewLabel_4.setBounds(10, 122, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfCod = new JTextField();
		tfCod.setBounds(53, 119, 86, 20);
		frame.getContentPane().add(tfCod);
		tfCod.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Qtd Dias:");
		lblNewLabel_5.setBounds(149, 150, 55, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tfDias = new JTextField();
		tfDias.setBounds(203, 147, 36, 20);
		frame.getContentPane().add(tfDias);
		tfDias.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Custo:");
		lblNewLabel_6.setBounds(10, 147, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		tfCusto = new JTextField();
		tfCusto.setBounds(53, 147, 86, 20);
		frame.getContentPane().add(tfCusto);
		tfCusto.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel_7.setBounds(149, 122, 65, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		tfDesc = new JTextField();
		tfDesc.setBounds(203, 119, 106, 20);
		frame.getContentPane().add(tfDesc);
		tfDesc.setColumns(10);
		
		JButton btnSalMant = new JButton("Salvar");
		btnSalMant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manutencao m = new Manutencao(Integer.parseInt(tfCod.getText()), Float.parseFloat(tfCusto.getText()), Integer.parseInt(tfDias.getText()));
				m.setDescricao(tfDesc.getText());
				atualVeic.addManutencao(m);
				JOptionPane.showMessageDialog(frame, "Manutenção salva!");
			}
		});
		btnSalMant.setBounds(256, 146, 89, 23);
		frame.getContentPane().add(btnSalMant);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 175, 335, 1);
		frame.getContentPane().add(separator_1);
		
		JLabel lblConsultas = new JLabel("Consultas");
		lblConsultas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsultas.setBounds(10, 184, 86, 14);
		frame.getContentPane().add(lblConsultas);
		
		JLabel lblNewLabel_8 = new JLabel("Atividade:");
		lblNewLabel_8.setBounds(10, 207, 65, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		tfAtiv = new JTextField();
		tfAtiv.setBounds(63, 204, 86, 20);
		frame.getContentPane().add(tfAtiv);
		tfAtiv.setColumns(10);
		
		JButton btnAtv = new JButton("Consultar Freq Atv");
		btnAtv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qtd = atualVeic.getQtdVezesServico(tfAtiv.getText());
				JOptionPane.showMessageDialog(frame, "O serviço foi realizado "+ qtd + " vezes.");
			}
		});
		btnAtv.setBounds(162, 203, 123, 23);
		frame.getContentPane().add(btnAtv);
		
		JButton btnIndSuc = new JButton("Ver \u00CDndice Sucata");
		btnIndSuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float is = atualVeic.getIndiceSuct();
				JOptionPane.showMessageDialog(frame, "O índice de sucateamento do veículo atual é " + is);
			}
		});
		btnIndSuc.setBounds(10, 257, 129, 23);
		frame.getContentPane().add(btnIndSuc);
		
		JButton btnCompInd = new JButton("Comparar \u00CDndices");
		btnCompInd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Veiculo outro = new Veiculo(tfPlaca.getText(), tfModelo.getText(), LocalDate.parse(tfData.getText(), formatter));
				int resp = atualVeic.compararIndices(outro);
				if (resp == 404) {
					JOptionPane.showMessageDialog(frame, "Informe um veículo para comparar!!");
				}
				else if (resp > 0) {
					JOptionPane.showMessageDialog(frame, "O veículo 1 tem índice de sucateamento maior.");
				}
				else if (resp < 0) {
					JOptionPane.showMessageDialog(frame, "O veículo 2 tem índice de sucateamento maior.");
				}
				else {
					JOptionPane.showMessageDialog(frame, "Ambos os veículos possuem o mesmo índice.");
				}
			}
		});
		btnCompInd.setBounds(10, 282, 129, 23);
		frame.getContentPane().add(btnCompInd);
		
		JLabel lblNewLabel_9 = new JLabel("C\u00F3digo:");
		lblNewLabel_9.setBounds(10, 232, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		tfCodCons = new JTextField();
		tfCodCons.setBounds(53, 226, 96, 20);
		frame.getContentPane().add(tfCodCons);
		tfCodCons.setColumns(10);
		
		JButton btnConsCusto = new JButton("Ver Custo Di\u00E1rio");
		btnConsCusto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float cd = atualVeic.getCustoDiario(Integer.parseInt(tfCodCons.getText()));
				JOptionPane.showMessageDialog(frame, "O custo por dia da manutenção solicitada foi de "+ cd);
			}
		});
		btnConsCusto.setBounds(162, 228, 123, 23);
		frame.getContentPane().add(btnConsCusto);
		
		JButton btnCustoMedio = new JButton("Custo M\u00E9dio");
		btnCustoMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float cm = atualVeic.getCustoMedio();
				JOptionPane.showMessageDialog(frame, "O custo médio de manutenção do veículo é de "+ cm);
			}
		});
		btnCustoMedio.setBounds(149, 257, 136, 23);
		frame.getContentPane().add(btnCustoMedio);
		
		JButton btnTotDias = new JButton("Qtd Dias Manut");
		btnTotDias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qtdDias = atualVeic.getTotDiasManut();
				JOptionPane.showMessageDialog(frame, "O veículo atual ficou em manutenção num total de "+ qtdDias + " dias.");
			}
		});
		btnTotDias.setBounds(149, 282, 136, 23);
		frame.getContentPane().add(btnTotDias);
	}
}
