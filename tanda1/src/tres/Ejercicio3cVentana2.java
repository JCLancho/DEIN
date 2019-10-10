package tres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ejercicio3cVentana2 extends JFrame{

	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Create the frame.
	 */
	public Ejercicio3cVentana2(int anioActual) {
		setTitle("Entrada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(416, 241);
		setLocationRelativeTo(null);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblImagen = new JLabel();
		ImageIcon imageIcon = new ImageIcon("/home/dm2/eclipse-workspace/tanda1/src/java.jpg");
		Image image = imageIcon.getImage(); 
		Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);   
		imageIcon = new ImageIcon(newimg);
		contentPane.add(lblImagen, BorderLayout.WEST);
		lblImagen.setIcon(imageIcon);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblActual = new JLabel("Año nacimiento");
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
					String nacimiento = textField.getText();
					int anioNacimiento = Integer.parseInt(nacimiento);
					if(anioActual < anioNacimiento) {
						JOptionPane.showMessageDialog(getContentPane(), "Introduce un año valido");
					}else {
						new Ejercicio3cResultado(anioActual, anioNacimiento);
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
					String nacimiento = textField.getText();
					int anioNacimiento = Integer.parseInt(nacimiento);
					if(anioActual < anioNacimiento) {
						JOptionPane.showMessageDialog(getContentPane(), "Introduce un año valido");
					}else {
						new Ejercicio3cResultado(anioActual, anioNacimiento);
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
