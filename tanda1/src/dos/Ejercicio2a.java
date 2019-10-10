package dos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ejercicio2a extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2a frame = new Ejercicio2a();
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
	public Ejercicio2a() {
		setTitle("Ejemplo de botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 208);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton boton1 = new JButton("Primero");
		panel.add(boton1);
		Border defaultBorde = boton1.getBorder();
		
		JButton boton2 = new JButton("Segundo");
		panel.add(boton2);
		
		JLabel etiqueta = new JLabel("Presione un botón");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(etiqueta);
		
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiqueta.setText("Primer botón presionado");
				boton2.setBorder(defaultBorde);
				boton1.setBorder(BorderFactory.createLineBorder(Color.cyan, 2, true));
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiqueta.setText("Segundo botón presionado");
				boton1.setBorder(defaultBorde);
				boton2.setBorder(BorderFactory.createLineBorder(Color.cyan, 2, true));
			}
		});
		
		
		
		
	}

}
