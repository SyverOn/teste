package projetoBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class tela2 {

	private JFrame frame;
	private JFormattedTextField txtTELE;
	private JFormattedTextField txtCPF;
	private JFormattedTextField txtCEP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela2 window = new tela2();
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
	public tela2() {
		initialize();
	}
	
	void cadastro() {
		tela2 window = new tela2();
		window.frame.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		banco_de_dados banc = new banco_de_dados();
		banc.conectar();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setTitle("CADASTRO");
		frame.setBounds(100, 100, 564, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JButton VAZA = new JButton("MANDAR EMBORA");
		JFormattedTextField txtSENHA = new JFormattedTextField();
		VAZA.setVisible(false);
		JButton btnNewButton_1 = new JButton("CHAMAR JUSSARA");
		btnNewButton_1.setVisible(false);
		MaskFormatter maskTELE;
		
		try {
			maskTELE = new MaskFormatter("(##) 9#### - ####");
			txtTELE = new JFormattedTextField(maskTELE);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MaskFormatter maskCPF;
		try {
			maskCPF = new MaskFormatter("###.###.### - ##");
			txtCPF = new JFormattedTextField(maskCPF);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MaskFormatter maskCEP;
		try {
			maskCEP = new MaskFormatter("#####-###");
			txtCEP = new JFormattedTextField(maskCEP);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean click = false;
		JLabel background = new JLabel("");
		ValidaCPF val = new ValidaCPF();
		
		JLabel lblSexo = new JLabel("SEXO");
		lblSexo.setBackground(new Color(255, 255, 255));
		lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexo.setForeground(new Color(255, 255, 255));
		lblSexo.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblSexo.setBounds(377, 42, 102, 17);
		frame.getContentPane().add(lblSexo);
		
		
		
		JFormattedTextField txtNOME = new JFormattedTextField();
		txtNOME.setFont(new Font("Dialog", Font.BOLD, 14));
		txtNOME.setBounds(135, 76, 179, 20);
		frame.getContentPane().add(txtNOME);
		
		JFormattedTextField txtEMAIL = new JFormattedTextField();
		txtEMAIL.setFont(new Font("Dialog", Font.BOLD, 14));
		txtEMAIL.setBounds(135, 245, 179, 20);
		frame.getContentPane().add(txtEMAIL);
		
		JFormattedTextField txtUSUARIO = new JFormattedTextField();
		txtUSUARIO.setFont(new Font("Dialog", Font.BOLD, 14));
		txtUSUARIO.setBounds(135, 184, 179, 20);
		frame.getContentPane().add(txtUSUARIO);
		
		//JFormattedTextField txtTELE = new JFormattedTextField();
		txtTELE.setFont(new Font("Dialog", Font.BOLD, 14));
		txtTELE.setBounds(135, 137, 179, 20);
		frame.getContentPane().add(txtTELE);
		
		//JFormattedTextField txtCPF = new JFormattedTextField();
		txtCPF.setFont(new Font("Dialog", Font.BOLD, 14));
		txtCPF.setBounds(135, 107, 179, 20);
		frame.getContentPane().add(txtCPF);
		
		JFormattedTextField txtENDE = new JFormattedTextField();
		txtENDE.setFont(new Font("Dialog", Font.BOLD, 14));
		txtENDE.setBounds(135, 287, 179, 20);
		frame.getContentPane().add(txtENDE);
		
		//JFormattedTextField txtCEP = new JFormattedTextField();
		txtCEP.setFont(new Font("Dialog", Font.BOLD, 14));
		txtCEP.setBounds(135, 316, 179, 20);
		frame.getContentPane().add(txtCEP);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBounds(23, 76, 102, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblEmail.setBounds(23, 246, 102, 17);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblUsurio = new JLabel("USUÁRIO:");
		lblUsurio.setForeground(new Color(255, 255, 255));
		lblUsurio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsurio.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblUsurio.setBounds(23, 184, 102, 17);
		frame.getContentPane().add(lblUsurio);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setForeground(new Color(255, 255, 255));
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblTelefone.setBounds(23, 138, 102, 17);
		frame.getContentPane().add(lblTelefone);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(new Color(255, 255, 255));
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblCpf.setBounds(23, 108, 102, 17);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblEndereo = new JLabel("ENDEREÇO:");
		lblEndereo.setForeground(new Color(255, 255, 255));
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblEndereo.setBounds(23, 285, 102, 17);
		frame.getContentPane().add(lblEndereo);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(new Color(255, 255, 255));
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblCep.setBounds(23, 313, 102, 17);
		frame.getContentPane().add(lblCep);
		
		JRadioButton FEM = new JRadioButton("FEMININO");
		FEM.setForeground(new Color(255, 255, 255));
		FEM.setBackground(new Color(255, 255, 255));
		FEM.setContentAreaFilled(false);
		JRadioButton MAS = new JRadioButton("MASCULINO");
		MAS.setForeground(new Color(255, 255, 255));
		MAS.setBackground(new Color(255, 255, 255));
		MAS.setContentAreaFilled(false);
		MAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (MAS.isSelected()) {
				FEM.setSelected(false);
			}
			}
		});
		MAS.setFont(new Font("Tahoma", Font.BOLD, 13));
		MAS.setBounds(332, 59, 102, 39);
		frame.getContentPane().add(MAS);
		
		FEM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (FEM.isSelected()) {
				MAS.setSelected(false);
			}
			}
		});
		FEM.setFont(new Font("Tahoma", Font.BOLD, 13));
		FEM.setBounds(436, 59, 85, 39);
		frame.getContentPane().add(FEM);
		
		JButton btnCadastro = new JButton("CADASTRAR");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String senha = txtSENHA.getText();
			String email = txtEMAIL.getText();
			String tele = txtTELE.getText();//32
			String cep = txtCEP.getText();//32
			String nome = txtNOME.getText();
			String cpf = txtCPF.getText();//323
			String ende = txtENDE.getText();
			String usuario = txtUSUARIO.getText();
			
			if (email.isEmpty()||tele.isEmpty()||cep.isEmpty()||nome.isEmpty()||cpf.isEmpty()||ende.isEmpty()||usuario.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Por favor, preencha tudo!","ERROR",0);
				
			}
			else {
				banco_de_dados banc = new banco_de_dados();
				banc.conectar();
				if (nome.matches("[A-Za-z ]+")) {
					
						if (email.matches("[A-Za-z0-9.-_]+@[A-Za-z.]+\\.[A-Za-z]{2,}")){
							if(FEM.isSelected()==true||MAS.isSelected()==true) {
									JOptionPane.showMessageDialog(null,"CADASTRO CONCLUÍDO!\nCPF: "+txtCPF.getText());
									banc.inserirCadastro(nome, cpf, tele, usuario, senha, email, ende, cep);
									tela1 tel = new tela1();
									tel.login();
									frame.dispose();
							}
							else {
								JOptionPane.showMessageDialog(null,"Por favor, selecione o seu SEXO!!");
							}
						}
						else {
							JOptionPane.showMessageDialog(null,"E-MAIL INVÁLIDO!!","ERROR",0);
							txtEMAIL.setText("");
						}
					
				}
				else {
					JOptionPane.showMessageDialog(null,"O nome só pode conter LETRAS!!","ERROR",0);
					txtNOME.setText("");
				}
				
				
				
				
			}
			
			
			}
		});
		
		btnCadastro.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnCadastro.setBounds(145, 366, 158, 39);
		frame.getContentPane().add(btnCadastro);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastra-se");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		lblNewLabel_1.setBounds(135, 30, 179, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		txtSENHA.setFont(new Font("Dialog", Font.BOLD, 14));
		txtSENHA.setBounds(135, 214, 179, 20);
		frame.getContentPane().add(txtSENHA);
		
		JLabel lbSENHA = new JLabel("SENHA:");
		lbSENHA.setForeground(new Color(255, 255, 255));
		lbSENHA.setHorizontalAlignment(SwingConstants.RIGHT);
		lbSENHA.setFont(new Font("SansSerif", Font.BOLD, 18));
		lbSENHA.setBounds(23, 215, 102, 17);
		frame.getContentPane().add(lbSENHA);
		
		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela1 tel = new tela1();
				tel.login();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(20, 422, 85, 20);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal"}));
		comboBox.setBounds(331, 285, 191, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setForeground(new Color(0, 0, 0));
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblEstado.setBounds(377, 265, 102, 17);
		frame.getContentPane().add(lblEstado);
		
		JLabel jussara = new JLabel("JUSSARA");
		jussara.setHorizontalAlignment(SwingConstants.CENTER);
		jussara.setFont(new Font("SimSun", Font.BOLD, 26));
		jussara.setForeground(new Color(0, 0, 0));
		jussara.setBounds(362, 200, 130, 36);
		
		
		JLabel atenddido = new JLabel("atendido(a) pela");
		atenddido.setHorizontalAlignment(SwingConstants.CENTER);
		atenddido.setForeground(new Color(0, 0, 0));
		atenddido.setFont(new Font("Tahoma", Font.BOLD, 16));
		atenddido.setBounds(352, 173, 157, 39);
		
		
		JLabel voceesta = new JLabel("Você está sendo ");
		voceesta.setHorizontalAlignment(SwingConstants.CENTER);
		voceesta.setBackground(new Color(64, 0, 64));
		voceesta.setForeground(new Color(255, 255, 255));
		voceesta.setFont(new Font("Tahoma", Font.BOLD, 19));
		voceesta.setBounds(342, 143, 179, 46);
		
		
		
		JButton btnATETE = new JButton("ATENDIMENTO");
		btnATETE.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnATETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnATETE.setVisible(false);
				VAZA.setVisible(true);
				frame.getContentPane().add(voceesta);
				frame.getContentPane().add(atenddido);
				frame.getContentPane().add(jussara);
				frame.getContentPane().add(background);
				background.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\tela2.jpeg"));
				background.setBounds(0, 0, 995, 453);
				
			}
		});
		btnATETE.setBounds(364, 173, 130, 28);
		frame.getContentPane().add(btnATETE);
		
		
		VAZA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voceesta.setVisible(false);
				atenddido.setVisible(false);
				jussara.setVisible(false);
				background.setVisible(false);
				VAZA.setVisible(false);
				btnNewButton_1.setVisible(true);
				
				
			}
		});
		VAZA.setFont(new Font("Tahoma", Font.BOLD, 10));
		VAZA.setBounds(364, 341, 130, 39);
		frame.getContentPane().add(VAZA);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Jussara está triste,\nEla não irá te atender\nNinguém irá mais...","JUSSARA",0);
				btnNewButton_1.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.PLAIN, 9));
		btnNewButton_1.setBounds(364, 137, 130, 24);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
	}
}