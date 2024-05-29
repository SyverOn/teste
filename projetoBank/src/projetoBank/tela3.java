package projetoBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class tela3 {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	Double valor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela3 window = new tela3();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela3() {
		initialize();
	}
	void saque() {
		tela3 window = new tela3();
		window.frmCalculadora.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(255, 165, 0));
		frmCalculadora.getContentPane().setForeground(new Color(255, 165, 0));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 369, 444);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.setResizable(false);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setEditable(false);
		txtField.setBounds(10, 45, 328, 89);
		valor=1000.0;
		
		JButton tras = new JButton("");
		tras.setForeground(new Color(0, 0, 0));
		tras.setBackground(new Color(0, 0, 0));
		tras.setEnabled(false);
		tras.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JLabel DECA = new JLabel("");
		DECA.setBackground(new Color(240, 240, 240));
		DECA.setFont(new Font("SansSerif", Font.BOLD, 16));
		DECA.setHorizontalAlignment(SwingConstants.CENTER);
		DECA.setForeground(new Color(248, 172, 71));
		DECA.setBounds(117, 136, 128, 23);
		frmCalculadora.getContentPane().add(DECA);
		tras.setBounds(117, 136, 128, 23);
		frmCalculadora.getContentPane().add(tras);
		txtField.setText(String.valueOf(valor));
		
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 48));
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("LIMPAR");
		btnC.setBounds(202, 170, 136, 40);
		btnC.setBackground(new Color(255, 255, 255));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setForeground(new Color(0, 0, 128));
		btnC.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnSoma = new JButton("DEPOSITO");
		btnSoma.setBounds(202, 224, 136, 40);
		btnSoma.setBackground(new Color(255, 255, 255));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DECA.setText("DEPOSITANDO!");
				numero1=Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnSoma.setForeground(new Color(0, 0, 128));
		btnSoma.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btnSoma);
		
		JButton btnSub = new JButton("SAQUE");
		btnSub.setBounds(202, 273, 136, 40);
		btnSub.setBackground(new Color(255, 255, 255));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DECA.setText("SACANDO!");
				numero1=Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			
			}
		});
		btnSub.setForeground(new Color(0, 0, 128));
		btnSub.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btnSub);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(138, 275, 54, 40);
		btn3.setBackground(new Color(255, 255, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
			}
		});
		btn3.setForeground(new Color(0, 0, 128));
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnIgual = new JButton("CONTINUE");
		btnIgual.setBounds(202, 324, 136, 40);
		btnIgual.setBackground(new Color(255, 255, 255));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DECA.setText("");
				String tela = txtField.getText();
				numero2=Double.parseDouble(txtField.getText());
				try {
					
					if(operacao.equals("+")) {
						valor=valor+numero2;
						txtField.setText(String.valueOf(valor));
					}else if(operacao.equals("-")) {
						if (valor>=numero2) {
							if(valor<=0) {
								JOptionPane.showMessageDialog(null, "Saldo insuficiente","Aviso",JOptionPane.ERROR_MESSAGE);
							}else {
							valor=valor-numero2;
							txtField.setText(String.valueOf(valor));
							}
						}else {
							JOptionPane.showMessageDialog(null, "Valor maior que o saldo","Aviso",JOptionPane.ERROR_MESSAGE);
						}
						
					}
					
					}
				catch(Exception w) {
					JOptionPane.showMessageDialog(null, "Escolha se quer\nDEPOSITAR ou SACAR");
				}
			}
		
		});
		btnIgual.setForeground(new Color(0, 0, 128));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(138, 221, 54, 40);
		btn6.setBackground(new Color(255, 255, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
			}
		});
		btn6.setForeground(new Color(0, 0, 128));
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(138, 170, 54, 40);
		btn9.setBackground(new Color(255, 255, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());
			}
		});
		btn9.setForeground(new Color(0, 0, 128));
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(74, 170, 54, 40);
		btn8.setBackground(new Color(255, 255, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
			}
		});
		btn8.setForeground(new Color(0, 0, 128));
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(74, 221, 54, 40);
		btn5.setBackground(new Color(255, 255, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
			}
		});
		btn5.setForeground(new Color(0, 0, 128));
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(74, 275, 54, 40);
		btn2.setBackground(new Color(255, 255, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
			}
		});
		btn2.setForeground(new Color(0, 0, 128));
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btnC_4_6 = new JButton("0");
		btnC_4_6.setBounds(74, 326, 54, 40);
		btnC_4_6.setBackground(new Color(255, 255, 255));
		btnC_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtField.setText(txtField.getText()+btnC_4_6.getText());
			}
		});
		btnC_4_6.setForeground(new Color(0, 0, 128));
		btnC_4_6.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btnC_4_6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 170, 54, 40);
		btn7.setBackground(new Color(255, 255, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
			}
		});
		btn7.setForeground(new Color(0, 0, 128));
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 221, 54, 40);
		btn4.setBackground(new Color(255, 255, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn4.getText());
			}
		});
		btn4.setForeground(new Color(0, 0, 128));
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 275, 54, 40);
		btn1.setBackground(new Color(255, 255, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtField.setText(txtField.getText()+btn1.getText());
			}
		});
		btn1.setForeground(new Color(0, 0, 128));
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn1_1 = new JButton("#");
		btn1_1.setBounds(138, 326, 54, 40);
		btn1_1.setForeground(new Color(0, 0, 128));
		btn1_1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1_1.setBackground(Color.WHITE);
		frmCalculadora.getContentPane().add(btn1_1);
		
		JButton btn1_2 = new JButton("←");
		btn1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null,"Deseja sair?");
				if (confirm == JOptionPane.YES_OPTION) {
					tela1 tel = new tela1();
					tel.login();
					frmCalculadora.dispose();
				}
				
			}
		});
		btn1_2.setBounds(10, 326, 54, 40);
		btn1_2.setForeground(new Color(0, 0, 128));
		btn1_2.setFont(new Font("Arial", Font.BOLD, 18));
		btn1_2.setBackground(Color.WHITE);
		frmCalculadora.getContentPane().add(btn1_2);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\tela3.jpeg"));
		background.setBounds(-198, -19, 801, 444);
		frmCalculadora.getContentPane().add(background);
	}
}