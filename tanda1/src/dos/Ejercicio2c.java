package dos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio2c extends JFrame {

	private JPanel contentPane;
	double tiempoTranscurrido = 0;
	long tiempoInicio;
	long tiempoFin;
	boolean contando;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2c frame = new Ejercicio2c();
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
	public Ejercicio2c() {
		setTitle("Un cronometrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 116);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton boton1 = new JButton("Start");
		panel.add(boton1);
		
		JButton boton2 = new JButton("Stop");
		panel.add(boton2);
		
		JLabel resultado = new JLabel("");
		panel.add(resultado);
		
		JLabel etiqueta = new JLabel("Presione start para empezar a cronometrar");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(etiqueta, BorderLayout.SOUTH);
		
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contando = true;
				resultado.setText("Cronometro en marcha");
				etiqueta.setText("");
				tiempoInicio = System.currentTimeMillis();
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(contando) {
					tiempoFin = System.currentTimeMillis();
					tiempoTranscurrido = (tiempoFin - tiempoInicio)/1000f;
					resultado.setText("Tiempo cronometrado: " + String.format("%.2f", tiempoTranscurrido));
					contando = false;
				}					
			}
		});
				
	}

}
