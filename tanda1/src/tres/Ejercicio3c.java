package tres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Ejercicio3c extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3c frame = new Ejercicio3c();
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
	public Ejercicio3c() {
		setTitle("Entrada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(416, 241);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblImagen = new JLabel();
		ImageIcon imageIcon = new ImageIcon("java.jpg");
		Image image = imageIcon.getImage(); 
		Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);   
		imageIcon = new ImageIcon(newimg);
		contentPane.add(lblImagen, BorderLayout.WEST);
		lblImagen.setIcon(imageIcon);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblActual = new JLabel("Año actual");
		lblActual.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelCentral.add(lblActual);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelCentral.add(panel);
		
		textField = new JTextField();
		textField.setAlignmentY(Component.TOP_ALIGNMENT);
		textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(textField);
		textField.setColumns(20);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String actual = textField.getText();
					int anio = Integer.parseInt(actual);
					int anioActual = Calendar.getInstance().get(Calendar.YEAR);
					if(anioActual != anio) {
						JOptionPane.showMessageDialog(getContentPane(), "Introduce el año actual");
					}else {
						new Ejercicio3cVentana2(anio);
						dispose();
					}					
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(getContentPane(), "Introduce un año valido", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JPanel panelSur = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelSur.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panelSur.add(cancelar);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String actual = textField.getText();
					int anio = Integer.parseInt(actual);
					int anioActual = Calendar.getInstance().get(Calendar.YEAR);
					if(anioActual != anio) {
						JOptionPane.showMessageDialog(getContentPane(), "Introduce el año actual");
					}else {
						new Ejercicio3cVentana2(anio);
						dispose();
					}					
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(getContentPane(), "Introduce un año valido", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		aceptar.setBackground(Color.CYAN);
		panelSur.add(aceptar);

		
		
	}

}
