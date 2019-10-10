package tres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Dimension;

public class ejercicio3c extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private HashSet<String> peliculas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3c frame = new ejercicio3c();
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
	public ejercicio3c() {
		peliculas = new HashSet<String>();
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblTitulo = new JLabel("Escribe el titulo de una pelicula");
		contentPane.add(lblTitulo);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeliculas.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(lblPeliculas);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 19));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		textField.setColumns(15);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		DefaultComboBoxModel<String> combo = new DefaultComboBoxModel<String>();
		
		JComboBox<String> comboBox = new JComboBox<String>(combo);
		comboBox.setPreferredSize(new Dimension(200, 24));
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JButton btnAnadir = new JButton("Añadir");
		panel_2.add(btnAnadir);
		
		btnAnadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().equals("") || textField.getText() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Introduce el nombre de una pelicula a añadir");
				}else {
					if(peliculas.contains(textField.getText())) {
						JOptionPane.showMessageDialog(getContentPane(), "La pelicula ya esta añadida, no se añadirá");
						textField.setText("");
					}
					else {
						combo.addElement(textField.getText());
						peliculas.add(textField.getText());
						textField.setText("");
						JOptionPane.showMessageDialog(getContentPane(), "Añadido");
					}
				}
			}
		});
	}

}
