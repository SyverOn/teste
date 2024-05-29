package projetoBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class tela4 {

	private JFrame frmRecuperarSenha;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela4 window = new tela4();
					window.frmRecuperarSenha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela4() {
		initialize();
	}
	
	void rec() {
		tela4 window = new tela4();
		window.frmRecuperarSenha.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRecuperarSenha = new JFrame();
		frmRecuperarSenha.setTitle("Recuperar senha");
		frmRecuperarSenha.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aluno\\Pictures\\-7NV2sRJ_400x400.jpg"));
		frmRecuperarSenha.setBounds(100, 100, 450, 300);
		frmRecuperarSenha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRecuperarSenha.setResizable(false);
		JButton btnrecSenha = new JButton("confirmar");
		btnrecSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrecSenha.setBounds(115, 152, 208, 30);
		btnrecSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String recSenha = textField.getText();
				if (recSenha.matches("[A-Za-z0-9.-_]+@[A-Za-z.]+\\.[A-Za-z]{2,}")){
					if(recSenha.equals("adm@gmail.com")) {
						JOptionPane.showMessageDialog(null, "USUÁRIO: admin\nSENHA: 123");
					}
					
					else {
					JOptionPane.showMessageDialog(null,"E-mail inexistente!");
					textField.setText("");				}
				}
				else if (recSenha.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Por favor, Digite o e-mail!");
				}
				else {
					JOptionPane.showMessageDialog(null,"Formato de e-mail incorreto!!","ERROR",0);
				}
			}
		});
		frmRecuperarSenha.getContentPane().setLayout(null);
		frmRecuperarSenha.getContentPane().add(btnrecSenha);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textField.setBounds(86, 98, 257, 30);
		frmRecuperarSenha.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite o seu e-mail");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(76, 39, 275, 48);
		frmRecuperarSenha.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela1 tel = new tela1();
				tel.login();
				frmRecuperarSenha.dispose();
			}
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		frmRecuperarSenha.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\tela4.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frmRecuperarSenha.getContentPane().add(lblNewLabel_1);
	}
}