package tres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio3cResultado extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;

	public Ejercicio3cResultado(int anioActual, int anioNacimiento) {
		setTitle("Mensaje");
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
		
		int edad = anioActual - anioNacimiento;
		String edadMostrar = "<html><p>Tienes:</p>"
				+ "<p>"+edad+" años cumplidos</p>"
				+ "<p>"+(edad*12)+" meses cumplidos</p>"
				+ "<p>"+(edad*365)+" dias cumplidos</p>"
				+ "<p>"+(edad*365*24)+" horas cumplidos</p>"
				+ "<p>"+(edad*365*24*60)+" minutos cumplidos</p>"
				+ "<p>"+(edad*365*24*60*60)+" segundos cumplidos</p>"
				+ "</html>";
		JLabel lblActual = new JLabel(edadMostrar);
		lblActual.setText(lblActual.getText() + anioActual + anioNacimiento);
		panelCentral.add(lblActual);
		
		JPanel panelSur = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelSur.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		aceptar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar()=='\n') {
					dispose();
				}				
			}
		});
		aceptar.setBackground(Color.CYAN);
		panelSur.add(aceptar);

	}
	
}
