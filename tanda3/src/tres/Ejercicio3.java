package tres;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		setTitle("Radio Buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox habilitaOpciones = new JCheckBox("Habilita opciones");
		habilitaOpciones.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(habilitaOpciones);
		
		JLabel lblOpciones = new JLabel("Opciones:");
		contentPane.add(lblOpciones);
		
		JRadioButton mayorVelocidad = new JRadioButton("Mayor velocidad");
		mayorVelocidad.setEnabled(false);
		contentPane.add(mayorVelocidad);
		
		JRadioButton menorTamano = new JRadioButton("Menor tamaño");
		menorTamano.setEnabled(false);
		contentPane.add(menorTamano);
		
		JRadioButton debug = new JRadioButton("Debug");
		debug.setEnabled(false);
		contentPane.add(debug);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(mayorVelocidad);
		grupo.add(menorTamano);
		grupo.add(debug);
		
		JPanel panel = new JPanel();
		FlowLayout fl_panel = (FlowLayout) panel.getLayout();
		fl_panel.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel);
		
		JLabel lblOpcionesSeleccionadas = new JLabel("Opcion seleccionada: ");
		panel.add(lblOpcionesSeleccionadas);
		
		JLabel opcionesSeleccionadas = new JLabel("");
		panel.add(opcionesSeleccionadas);
		
		JRadioButton[] opciones = {mayorVelocidad, menorTamano, debug};
		
		habilitaOpciones.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				for(JRadioButton c : opciones) {
					c.setEnabled(habilitaOpciones.isSelected());
				}
				
			}
		});
		
		mayorVelocidad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(mayorVelocidad.isSelected()) {
					opcionesSeleccionadas.setText("Velocidad");
				}
				
			}
		});
		menorTamano.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(menorTamano.isSelected()) {
					opcionesSeleccionadas.setText("Tamaño");
				}
				
			}
		});
		debug.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(debug.isSelected()) {
					opcionesSeleccionadas.setText("Debug");
				}
				
			}
		});
	}

}
