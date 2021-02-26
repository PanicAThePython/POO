import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfRua;
	private JTextField tfNumeroEndereco;
	private JTextField tfCidade;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JComboBox<String> comboBoxEstado;
	private JTextField tfNome;
	private JTextField tfNumeroTelefone;
	private JTextField tfDataInstalacao;
	private final JSeparator separator = new JSeparator();
	private JTextField tfConsulta;
	private JTextField tfQtdOcorrencias;
	private JLabel lblConexao;
	private JCheckBox chckbxConexao;
	private JLabel lblRamo;
	private JTextField tfRamo;
	private JLabel lblQtdOcorrencias;
	
	private HashMap<String, Telefone> telefones = new HashMap<>(); 
	private JTextField tfDataInstalacao1;
	private JTextField tfDataInstalacao2;

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
		frame.setBounds(100, 100, 931, 911);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de telefone");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(320, 11, 271, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do usu\u00E1rio");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 77, 115, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00FAmero do telefone");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(32, 121, 127, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Rua");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(589, 77, 115, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o de instala\u00E7\u00E3o");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEndereo.setBounds(634, 26, 271, 40);
		frame.getContentPane().add(lblEndereo);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("N\u00FAmero");
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(589, 121, 60, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Cidade");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(589, 169, 115, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		lblNewLabel_1_1_1_1_1_1 = new JLabel("Estado");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(589, 217, 60, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		tfRua = new JTextField();
		tfRua.setBounds(659, 79, 225, 20);
		frame.getContentPane().add(tfRua);
		tfRua.setColumns(10);
		
		tfNumeroEndereco = new JTextField();
		tfNumeroEndereco.setColumns(10);
		tfNumeroEndereco.setBounds(659, 123, 225, 20);
		frame.getContentPane().add(tfNumeroEndereco);
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(659, 171, 225, 20);
		frame.getContentPane().add(tfCidade);
		
		String[] estados = new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" };
		comboBoxEstado = new JComboBox(estados);
		comboBoxEstado.setBounds(659, 219, 71, 20);
		frame.getContentPane().add(comboBoxEstado);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(168, 79, 225, 20);
		frame.getContentPane().add(tfNome);
		
		tfNumeroTelefone = new JTextField();
		tfNumeroTelefone.setColumns(10);
		tfNumeroTelefone.setBounds(168, 123, 86, 20);
		frame.getContentPane().add(tfNumeroTelefone);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Data da instala\u00E7\u00E3o");
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(32, 169, 127, 20);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		tfDataInstalacao = new JFormattedTextField();
		tfDataInstalacao.setBounds(168, 171, 22, 20);
		frame.getContentPane().add(tfDataInstalacao);
		tfDataInstalacao.setColumns(2);
		
		
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Tipo de linha");
		lblNewLabel_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(32, 217, 127, 20);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		String[] opcoesLinha = new String[] {"Residencial", "Comercial", "Especializada"};
		JComboBox comboBoxLinha = new JComboBox(opcoesLinha);
		comboBoxLinha.setSelectedIndex(-1);
		comboBoxLinha.setBounds(168, 219, 137, 20);
		frame.getContentPane().add(comboBoxLinha);
		comboBoxLinha.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[0])) {
					lblConexao.setEnabled(true);
					chckbxConexao.setEnabled(true);
					lblRamo.setEnabled(false);
					tfRamo.setEnabled(false);
					lblQtdOcorrencias.setEnabled(false);
					tfQtdOcorrencias.setEnabled(false);
				}
				else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[1])) {
					lblConexao.setEnabled(false);
					chckbxConexao.setEnabled(false);
					lblRamo.setEnabled(true);
					tfRamo.setEnabled(true);
					lblQtdOcorrencias.setEnabled(false);
					tfQtdOcorrencias.setEnabled(false);
				}
				else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[2])) {
					lblConexao.setEnabled(false);
					chckbxConexao.setEnabled(false);
					lblRamo.setEnabled(false);
					tfRamo.setEnabled(false);
					lblQtdOcorrencias.setEnabled(true);
					tfQtdOcorrencias.setEnabled(true);
				}
			}
		});
		

		
		chckbxConexao = new JCheckBox("");
		chckbxConexao.setEnabled(false);
		chckbxConexao.setBounds(183, 261, 29, 23);
		frame.getContentPane().add(chckbxConexao);
		
		lblConexao = new JLabel("Conexão com Internet");
		lblConexao.setEnabled(false);
		lblConexao.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblConexao.setBounds(32, 260, 148, 20);
		frame.getContentPane().add(lblConexao);
		separator.setBounds(0, 446, 915, 31);
		frame.getContentPane().add(separator);
		
		JLabel lblConsultaDeTelefone = new JLabel("Consulta de telefone");
		lblConsultaDeTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblConsultaDeTelefone.setBounds(320, 470, 271, 40);
		frame.getContentPane().add(lblConsultaDeTelefone);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("N\u00FAmero do telefone para consulta");
		lblNewLabel_1_1_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_3.setBounds(330, 536, 219, 20);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		tfConsulta = new JTextField();
		tfConsulta.setColumns(10);
		tfConsulta.setBounds(330, 583, 120, 20);
		frame.getContentPane().add(tfConsulta);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(3, 641, 915, 31);
		frame.getContentPane().add(separator_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int day = Integer.parseInt(tfDataInstalacao.getText());
					int month = Integer.parseInt(tfDataInstalacao1.getText());
					int year = Integer.parseInt(tfDataInstalacao2.getText());
					if (day <= 31 && month <= 12 && year <= 2100 && year >= 1900) {
						//Data validada
						if (comboBoxLinha.getSelectedIndex() > -1) {
							try {
								//Tipo de linah validado
								DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
								String formattedData = tfDataInstalacao.getText() + "/" + tfDataInstalacao1.getText() + "/" + tfDataInstalacao2.getText();
								LocalDate data = LocalDate.parse(formattedData, formatter);
								String nomeUsuario = tfNome.getText();
								Endereco endereco = new Endereco();
								
								endereco.setRua(tfRua.getText());
								endereco.setCidade(tfCidade.getText());
								endereco.setUf(comboBoxEstado.getSelectedItem().toString());
								
								String numeroTelefone = tfNumeroTelefone.getText();
								
								try {
									Long.parseLong(numeroTelefone);
									if (!tfNumeroEndereco.getText().isEmpty()) {
										try {
											int nmr = Integer.parseInt(tfNumeroEndereco.getText());
											endereco.setNumero(nmr);
										} catch (Exception e) {
											JOptionPane.showMessageDialog(frame, "Erro no valor inserido em número de endereço");
										}

									}
									else {
										JOptionPane.showMessageDialog(frame, "O número informado no endereço é inválido");
									}

									
									Cliente cliente = new Cliente();
									cliente.setEndereco(endereco);
									cliente.setUsuario(nomeUsuario);

									
									
									if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[0])) {
										//Residencial
										Residencial telefoneResidencial = new Residencial(cliente, data, numeroTelefone, chckbxConexao.isSelected());
										if (!telefones.containsKey(numeroTelefone)) {
											telefones.put(numeroTelefone, telefoneResidencial);
											JOptionPane.showMessageDialog(frame, "O telefone " + telefoneResidencial.getNumero() + " foi cadastrado.");
										}
										else {
											JOptionPane.showMessageDialog(frame, "Este telefone já está cadastrado");
										}

									}
									else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[1])) {
										//Comercial	
										String ramoAtividade = tfRamo.getText();
										Comercial telefoneComercial = new Comercial(cliente, data, numeroTelefone, ramoAtividade);

										if (!telefones.containsKey(numeroTelefone)) {
											telefones.put(numeroTelefone, telefoneComercial);
											JOptionPane.showMessageDialog(frame, "O telefone " + telefoneComercial.getNumero() + " foi cadastrado.");
										}
										else {
											JOptionPane.showMessageDialog(frame, "Este telefone já está cadastrado");
										}
										
									}
									else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[2])) {
										//Especializada
										try {
											if (!tfQtdOcorrencias.getText().isEmpty()) {
												try {
													int qtdOcor = Integer.parseInt(tfQtdOcorrencias.getText());
													Especializada telefoneEspecializada = new Especializada(cliente, data, numeroTelefone, qtdOcor);

													if (!telefones.containsKey(numeroTelefone)) {
														telefones.put(numeroTelefone, telefoneEspecializada);
														JOptionPane.showMessageDialog(frame, "O telefone " + telefoneEspecializada.getNumero() + " foi cadastrado.");
													}
													else {
														JOptionPane.showMessageDialog(frame, "Este telefone já está cadastrado");
													}
												} catch (Exception e) {
													JOptionPane.showMessageDialog(frame, "Informe um número em quantidade de ocorrências");
												}
												
											}
											else {
												JOptionPane.showMessageDialog(frame, "Informe um valor em quantidade de ocorrências");
											}

										} catch (IllegalArgumentException e) {
											//JOptionPane.showMessageDialog(frame, "Erro no valor inserido em quantidade de ocorrências");
											JOptionPane.showMessageDialog(frame, e.getMessage());
										}
									}
										
									
								} catch (Exception e) {
									JOptionPane.showMessageDialog(frame, "Erro no número de telefone inserido");
								}
								
								

							} catch (IllegalArgumentException iae) {
								JOptionPane.showMessageDialog(frame, iae.getMessage());
							}
						}
						else {
							JOptionPane.showMessageDialog(frame, "Selecione um tipo de linha");
						}
					}
					else {
						JOptionPane.showMessageDialog(frame, "Erro na data inserida");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, "Erro na data inserida");
				}
				
				
			}
		});
		btnCadastrar.setBounds(707, 377, 133, 30);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!tfConsulta.getText().isEmpty() || tfConsulta.getText().length() != 10 && tfConsulta.getText().length() != 0) {
					String numeroConsulta = tfConsulta.getText();
					Telefone telefoneConsultado;
					if (telefones.containsKey(numeroConsulta)) {
						telefoneConsultado = telefones.get(numeroConsulta);
						JOptionPane.showMessageDialog(frame, telefoneConsultado.toString());
					}
					else {
						JOptionPane.showMessageDialog(frame, "O telefone informado não foi encontrado");
					}

				}
				else {
					JOptionPane.showMessageDialog(frame, "Erro no valor inserido para consulta");
				}
				

			}
		});
		btnConsultar.setBounds(460, 582, 89, 23);
		frame.getContentPane().add(btnConsultar);
		
		JLabel lblVerificarPotencialFaturamento = new JLabel("Verificar potencial faturamento da empresa");
		lblVerificarPotencialFaturamento.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblVerificarPotencialFaturamento.setBounds(204, 660, 500, 40);
		frame.getContentPane().add(lblVerificarPotencialFaturamento);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "A soma dos custos fixos de todos os telefones cadastrados é: R$";
				double faturamento = 0;
				
				for (Telefone tel : telefones.values()) {
					faturamento += tel.getCustoMensal();
				}
				
				msg += faturamento;
				
				JOptionPane.showMessageDialog(frame, msg);
			}
		});
		btnVerificar.setBounds(382, 723, 133, 30);
		frame.getContentPane().add(btnVerificar);
		
		lblRamo = new JLabel("Ramo de atividade");
		lblRamo.setEnabled(false);
		lblRamo.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblRamo.setBounds(32, 304, 127, 20);
		frame.getContentPane().add(lblRamo);
		
		tfRamo = new JTextField();
		tfRamo.setEnabled(false);
		tfRamo.setColumns(10);
		tfRamo.setBounds(168, 306, 86, 20);
		frame.getContentPane().add(tfRamo);
		
		lblQtdOcorrencias = new JLabel("Quantidade de ocorr\u00EAncias");
		lblQtdOcorrencias.setEnabled(false);
		lblQtdOcorrencias.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblQtdOcorrencias.setBounds(32, 352, 180, 20);
		frame.getContentPane().add(lblQtdOcorrencias);
		
		tfQtdOcorrencias = new JTextField();
		tfQtdOcorrencias.setEnabled(false);
		tfQtdOcorrencias.setColumns(10);
		tfQtdOcorrencias.setBounds(222, 354, 86, 20);
		frame.getContentPane().add(tfQtdOcorrencias);
		
		tfDataInstalacao1 = new JFormattedTextField();
		tfDataInstalacao1.setColumns(2);
		tfDataInstalacao1.setBounds(200, 171, 22, 20);
		frame.getContentPane().add(tfDataInstalacao1);
		
		tfDataInstalacao2 = new JFormattedTextField();
		tfDataInstalacao2.setColumns(2);
		tfDataInstalacao2.setBounds(232, 171, 32, 20);
		frame.getContentPane().add(tfDataInstalacao2);
		
		JLabel lblNewLabel_2 = new JLabel("/");
		lblNewLabel_2.setBounds(193, 173, 13, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("/");
		lblNewLabel_2_1.setBounds(224, 174, 40, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Desenvolvido por Jo\u00E3o Vitor de Oliveira, Nat\u00E1lia");
		lblNewLabel_3.setBounds(602, 822, 303, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sens Weise e Paulo Rubens de Moraes Leme J\u00FAnior");
		lblNewLabel_4.setBounds(602, 835, 303, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BCC FURB 2020");
		lblNewLabel_5.setBounds(602, 847, 303, 14);
		frame.getContentPane().add(lblNewLabel_5);
		

	}
}