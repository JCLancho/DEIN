package tres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Ejercicio3f extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3f frame = new Ejercicio3f();
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
	public Ejercicio3f() {
		setTitle("Convierte pesetas a euros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 90);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPesetas = new JLabel("Pesetas");
		contentPane.add(lblPesetas);
		
		JButton boton = new JButton("Cambio Pta -> €");
	
		contentPane.add(boton);
		
		JLabel lblEuros = new JLabel("€");
		contentPane.add(lblEuros);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double valor = Integer.parseInt(textField.getText());
					double resultado = (valor / 166.386); 
					lblEuros.setText(String.format("%.2f", resultado).concat("€"));
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(getContentPane(), "Introduce una cantidad numerica", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar() == '\n') {
					try {
						double valor = Integer.parseInt(textField.getText());
						double resultado = (valor / 166.386); 
						lblEuros.setText(String.format("%.2f", resultado).concat("€"));
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(getContentPane(), "Introduce una cantidad numerica", "Error", JOptionPane.ERROR_MESSAGE);
					}	
				}
			}
		});
		
	}

}
