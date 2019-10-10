package tres;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class Ejercicio3h extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JButton btnRestar;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JLabel lblNum;
	private JTextField resul;
	private JButton limpiar;
	private JLabel lblNum_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3h frame = new Ejercicio3h();
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
	public Ejercicio3h() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{62, 105, 62, 32, 62, 62, 0};
		gbl_contentPane.rowHeights = new int[]{47, 0, 31, 17, 34, 25, 25, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setMinimumSize(new Dimension(50, 25));
		btnNewButton.setMaximumSize(new Dimension(50, 25));
		btnNewButton.setPreferredSize(new Dimension(50, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Integer resultado = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
				resul.setText(resultado.toString());
			}
		});
		
		lblNum = new JLabel("Num 1:");
		GridBagConstraints gbc_lblNum = new GridBagConstraints();
		gbc_lblNum.anchor = GridBagConstraints.EAST;
		gbc_lblNum.insets = new Insets(0, 0, 5, 5);
		gbc_lblNum.gridx = 1;
		gbc_lblNum.gridy = 0;
		contentPane.add(lblNum, gbc_lblNum);
		
		num1 = new JTextField();
		GridBagConstraints gbc_num1 = new GridBagConstraints();
		gbc_num1.gridwidth = 3;
		gbc_num1.fill = GridBagConstraints.HORIZONTAL;
		gbc_num1.insets = new Insets(0, 0, 5, 5);
		gbc_num1.gridx = 2;
		gbc_num1.gridy = 0;
		contentPane.add(num1, gbc_num1);
		num1.setColumns(10);
		
		lblNum_1 = new JLabel("Num 2:");
		GridBagConstraints gbc_lblNum_1 = new GridBagConstraints();
		gbc_lblNum_1.anchor = GridBagConstraints.EAST;
		gbc_lblNum_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNum_1.gridx = 1;
		gbc_lblNum_1.gridy = 2;
		contentPane.add(lblNum_1, gbc_lblNum_1);
		
		limpiar = new JButton("LIMPIAR");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1.setText("");
				num2.setText("");
				resul.setText("");
			}
		});
		GridBagConstraints gbc_limpiar = new GridBagConstraints();
		gbc_limpiar.gridwidth = 3;
		gbc_limpiar.insets = new Insets(0, 0, 5, 5);
		gbc_limpiar.gridx = 2;
		gbc_limpiar.gridy = 6;
		contentPane.add(limpiar, gbc_limpiar);
		
		resul = new JTextField();
		resul.setEditable(false);
		GridBagConstraints gbc_resul = new GridBagConstraints();
		gbc_resul.gridwidth = 3;
		gbc_resul.anchor = GridBagConstraints.SOUTH;
		gbc_resul.fill = GridBagConstraints.HORIZONTAL;
		gbc_resul.insets = new Insets(0, 0, 0, 5);
		gbc_resul.gridx = 2;
		gbc_resul.gridy = 7;
		contentPane.add(resul, gbc_resul);
		resul.setColumns(10);
		
		num2 = new JTextField();
		GridBagConstraints gbc_num2 = new GridBagConstraints();
		gbc_num2.gridwidth = 3;
		gbc_num2.fill = GridBagConstraints.HORIZONTAL;
		gbc_num2.insets = new Insets(0, 0, 5, 5);
		gbc_num2.gridx = 2;
		gbc_num2.gridy = 2;
		contentPane.add(num2, gbc_num2);
		num2.setColumns(10);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 4;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		btnRestar = new JButton("-");
		btnRestar.setSize(new Dimension(50, 25));
		btnRestar.setMinimumSize(new Dimension(50, 25));
		btnRestar.setMaximumSize(new Dimension(50, 25));
		btnRestar.setPreferredSize(new Dimension(50, 25));
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numero1 = Integer.parseInt(num1.getText());
				int numero2 = Integer.parseInt(num2.getText());
				resul.setText((numero1 - numero2) + "" ); 
			}
		});
		GridBagConstraints gbc_btnRestar = new GridBagConstraints();
		gbc_btnRestar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRestar.insets = new Insets(0, 0, 5, 5);
		gbc_btnRestar.gridx = 4;
		gbc_btnRestar.gridy = 4;
		contentPane.add(btnRestar, gbc_btnRestar);
		
		btnMultiplicar = new JButton("*");
		btnMultiplicar.setMinimumSize(new Dimension(50, 25));
		btnMultiplicar.setMaximumSize(new Dimension(50, 25));
		btnMultiplicar.setPreferredSize(new Dimension(50, 25));
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numero1 = Integer.parseInt(num1.getText());
				int numero2 = Integer.parseInt(num2.getText());
				resul.setText((numero1 * numero2) + "" ); 
			}
		});
		GridBagConstraints gbc_btnMultiplicar = new GridBagConstraints();
		gbc_btnMultiplicar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnMultiplicar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiplicar.gridx = 2;
		gbc_btnMultiplicar.gridy = 5;
		contentPane.add(btnMultiplicar, gbc_btnMultiplicar);
		
		btnDividir = new JButton("/");
		btnDividir.setMinimumSize(new Dimension(50, 25));
		btnDividir.setMaximumSize(new Dimension(50, 25));
		btnDividir.setPreferredSize(new Dimension(50, 25));
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numero1 = Integer.parseInt(num1.getText());
				int numero2 = Integer.parseInt(num2.getText());
				resul.setText((numero1 / numero2) + "" ); 
			}
		});
		GridBagConstraints gbc_btnDividir = new GridBagConstraints();
		gbc_btnDividir.insets = new Insets(0, 0, 5, 5);
		gbc_btnDividir.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDividir.gridx = 4;
		gbc_btnDividir.gridy = 5;
		contentPane.add(btnDividir, gbc_btnDividir);
	}
}
