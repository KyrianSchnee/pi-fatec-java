import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewConta extends JFrame {

	private JPanel contentPane;
	private JTextField text_numhidro;
	private JTextField text_dateleitura;
	private JTextField text_datevencimento;
	private JTextField text_consumo;
	private JTextField text_watervalue;
	private JTextField text_sewervalue;
	private JTextField text_pollution;
	private JTextField text_PISCOFINS;
	private JTextField text_othervalue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewConta frame = new ViewConta();
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
	public ViewConta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204,223,214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		
		JLabel lblCadastroConta = new JLabel("CADASTRO CONTA - \u00C1GUA");
		lblCadastroConta.setForeground(Color.WHITE);
		lblCadastroConta.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(lblCadastroConta);
		
		JLabel lblNewLabel_1 = new JLabel("Hidr\u00F4metro");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_numhidro = new JTextField();
		text_numhidro.setColumns(10);
		
		text_dateleitura = new JTextField();
		text_dateleitura.setForeground(Color.LIGHT_GRAY);
		text_dateleitura.setFont(new Font("Arial", Font.PLAIN, 11));
		text_dateleitura.setText("00/00/0000");
		text_dateleitura.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Leitura Atual");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Vencimento");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_datevencimento = new JTextField();
		text_datevencimento.setText("00/00/0000");
		text_datevencimento.setForeground(Color.LIGHT_GRAY);
		text_datevencimento.setFont(new Font("Arial", Font.PLAIN, 11));
		text_datevencimento.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Consumo (m\u00B3)");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_consumo = new JTextField();
		text_consumo.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Valor \u00C1gua (R$)");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_watervalue = new JTextField();
		text_watervalue.setColumns(10);
		
		text_sewervalue = new JTextField();
		text_sewervalue.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Fator Polui\u00E7\u00E3o (R$)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_pollution = new JTextField();
		text_pollution.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Valor Esgoto (R$)");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Al\u00EDquota PIS/COFINS (%)");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_PISCOFINS = new JTextField();
		text_PISCOFINS.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Outros (R$)");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		text_othervalue = new JTextField();
		text_othervalue.setColumns(10);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMain voltamenu = new ViewMain();
				voltamenu.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(331)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(92)
							.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_1_1_1_1_1_1_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(text_PISCOFINS, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
								.addGap(33)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(text_othervalue, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addGap(56)
										.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(text_sewervalue, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
										.addGap(33)
										.addComponent(text_pollution, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addGap(56)
											.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(text_consumo, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
											.addGap(33)
											.addComponent(text_watervalue, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
													.addComponent(text_dateleitura, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
													.addComponent(text_datevencimento, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
											.addComponent(text_numhidro, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)))))))
					.addGap(320))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(72, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(6)
					.addComponent(text_numhidro, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(text_dateleitura, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1)
							.addGap(6)
							.addComponent(text_datevencimento, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_2)
						.addComponent(lblNewLabel_1_1_1_1))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(text_consumo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(text_watervalue, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_1_1_1)
						.addComponent(lblNewLabel_1_1_1_1_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(text_sewervalue, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(text_pollution, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1_1_1_1_1)
						.addComponent(lblNewLabel_1_1_1_1_1_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(text_PISCOFINS, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(text_othervalue, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnVoltar))
					.addGap(62))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
