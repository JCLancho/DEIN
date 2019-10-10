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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio2b extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2b frame = new Ejercicio2b();
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
	public Ejercicio2b() {
		setTitle("Manejador de eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 208);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton boton1 = new JButton("Primero");
		panel.add(boton1);
		
		JButton boton2 = new JButton("Segundo");
		panel.add(boton2);
		
		JLabel etiqueta = new JLabel("Presione un botón");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(etiqueta);
		
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiqueta.setText("Segundo botón habilitado");
				boton1.setEnabled(false);
				boton2.setEnabled(true);
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiqueta.setText("Primer botón habilitado");
				boton1.setEnabled(true);
				boton2.setEnabled(false);
			}
		});
		
		boton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(boton1.isEnabled())
					etiqueta.setText("Primer boton presionado");
			}
		});
		
		boton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(boton2.isEnabled())
					etiqueta.setText("Segundo boton presionado");
			}
		});
		
		
		
		
	}

}
