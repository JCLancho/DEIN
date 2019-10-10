package uno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txt50;
	private JTextField txt5;
	private JTextField txt20;
	private JTextField txt1;
	private JTextField txt10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setTitle("Diseño preview [New JFrame]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[] {0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblValor = new JLabel("Ingrese un valor:");
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.anchor = GridBagConstraints.WEST;
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.gridx = 0;
		gbc_lblValor.gridy = 0;
		contentPane.add(lblValor, gbc_lblValor);
		
		JLabel lbl50 = new JLabel("Monedas de 50:");
		GridBagConstraints gbc_lbl50 = new GridBagConstraints();
		gbc_lbl50.anchor = GridBagConstraints.WEST;
		gbc_lbl50.insets = new Insets(0, 0, 5, 5);
		gbc_lbl50.gridx = 0;
		gbc_lbl50.gridy = 1;
		contentPane.add(lbl50, gbc_lbl50);
		
		JButton calcular = new JButton("Calcular");
		GridBagConstraints gbc_calcular = new GridBagConstraints();
		gbc_calcular.insets = new Insets(0, 0, 5, 0);
		gbc_calcular.gridx = 2;
		gbc_calcular.gridy = 0;
		contentPane.add(calcular, gbc_calcular);
		
		txt50 = new JTextField();
		txt50.setColumns(10);
		GridBagConstraints gbc_txt50 = new GridBagConstraints();
		gbc_txt50.insets = new Insets(0, 0, 5, 5);
		gbc_txt50.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt50.gridx = 1;
		gbc_txt50.gridy = 1;
		contentPane.add(txt50, gbc_txt50);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		GridBagConstraints gbc_txt5 = new GridBagConstraints();
		gbc_txt5.insets = new Insets(0, 0, 5, 5);
		gbc_txt5.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt5.gridx = 1;
		gbc_txt5.gridy = 4;
		contentPane.add(txt5, gbc_txt5);
		
		JLabel lbl20 = new JLabel("Monedas de 20:");
		GridBagConstraints gbc_lbl20 = new GridBagConstraints();
		gbc_lbl20.anchor = GridBagConstraints.WEST;
		gbc_lbl20.insets = new Insets(0, 0, 5, 5);
		gbc_lbl20.gridx = 0;
		gbc_lbl20.gridy = 2;
		contentPane.add(lbl20, gbc_lbl20);
		
		txt20 = new JTextField();
		txt20.setColumns(10);
		GridBagConstraints gbc_txt20 = new GridBagConstraints();
		gbc_txt20.insets = new Insets(0, 0, 5, 5);
		gbc_txt20.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt20.gridx = 1;
		gbc_txt20.gridy = 2;
		contentPane.add(txt20, gbc_txt20);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.insets = new Insets(0, 0, 5, 5);
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.gridx = 1;
		gbc_txt1.gridy = 5;
		contentPane.add(txt1, gbc_txt1);
		
		JLabel lbl10 = new JLabel("Monedas de 10:");
		GridBagConstraints gbc_lbl10 = new GridBagConstraints();
		gbc_lbl10.anchor = GridBagConstraints.WEST;
		gbc_lbl10.insets = new Insets(0, 0, 5, 5);
		gbc_lbl10.gridx = 0;
		gbc_lbl10.gridy = 3;
		contentPane.add(lbl10, gbc_lbl10);
		
		txt10 = new JTextField();
		txt10.setColumns(10);
		GridBagConstraints gbc_txt10 = new GridBagConstraints();
		gbc_txt10.insets = new Insets(0, 0, 5, 5);
		gbc_txt10.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt10.gridx = 1;
		gbc_txt10.gridy = 3;
		contentPane.add(txt10, gbc_txt10);
		
		JLabel lbl5 = new JLabel("Monedas de 5:");
		GridBagConstraints gbc_lbl5 = new GridBagConstraints();
		gbc_lbl5.anchor = GridBagConstraints.WEST;
		gbc_lbl5.insets = new Insets(0, 0, 5, 5);
		gbc_lbl5.gridx = 0;
		gbc_lbl5.gridy = 4;
		contentPane.add(lbl5, gbc_lbl5);
		
		JLabel lbl1 = new JLabel("Monedas de 1:");
		GridBagConstraints gbc_lbl1 = new GridBagConstraints();
		gbc_lbl1.anchor = GridBagConstraints.WEST;
		gbc_lbl1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl1.gridx = 0;
		gbc_lbl1.gridy = 5;
		contentPane.add(lbl1, gbc_lbl1);
		
		txtValor = new JTextField();
		GridBagConstraints gbc_txtValor = new GridBagConstraints();
		gbc_txtValor.insets = new Insets(0, 0, 5, 5);
		gbc_txtValor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtValor.gridx = 1;
		gbc_txtValor.gridy = 0;
		contentPane.add(txtValor, gbc_txtValor);
		txtValor.setColumns(10);
		
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtValor.getText().length() > 0) {
					try {
						double valor = Double.parseDouble(txtValor.getText());
						txt50.setText(String.format("%.0f", Math.floor(valor/0.5))+"");
						txt20.setText(String.format("%.0f", Math.floor(valor/0.2))+"");
						txt10.setText(String.format("%.0f", Math.floor(valor/0.1))+"");
						txt5.setText(String.format("%.0f", Math.floor(valor/0.05))+"");
						txt1.setText(String.format("%.0f", Math.floor(valor/0.01))+"");
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(getContentPane(), "Introduce un numero", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		
		pack();
	}

}
