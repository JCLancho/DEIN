package dos;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private ArrayList<String> listaSeleccionados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		listaSeleccionados = new ArrayList<String>();
		setTitle("Cajas de texto");
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
		
		JCheckBox mayorVelocidad = new JCheckBox("Mayor velocidad");
		mayorVelocidad.setEnabled(false);
		contentPane.add(mayorVelocidad);
		
		JCheckBox menorTamano = new JCheckBox("Menor tamaño");
		menorTamano.setEnabled(false);
		contentPane.add(menorTamano);
		
		JCheckBox debug = new JCheckBox("Debug");
		debug.setEnabled(false);
		contentPane.add(debug);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel);
		
		JLabel ultimaSeleccion = new JLabel("Ultima seleción: ");
		ultimaSeleccion.setHorizontalAlignment(SwingConstants.LEFT);
		ultimaSeleccion.setHorizontalTextPosition(SwingConstants.LEFT);
		ultimaSeleccion.setAlignmentX(LEFT_ALIGNMENT);
		panel.add(ultimaSeleccion);
		
		JLabel seleccionado = new JLabel("");
		panel.add(seleccionado);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1);
		
		JLabel lblOpcionesSeleccionadas = new JLabel("Opciones seleccionadas: ");
		panel_1.add(lblOpcionesSeleccionadas);
		
		JLabel opcionesSeleccionadas = new JLabel("");
		panel_1.add(opcionesSeleccionadas);
		
		JCheckBox[] opciones = {mayorVelocidad, menorTamano, debug};
		
		habilitaOpciones.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				for(JCheckBox c : opciones) {
					c.setEnabled(habilitaOpciones.isSelected());
				}
				
			}
		});
		
		mayorVelocidad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(mayorVelocidad.isSelected()) {
					opcionesSeleccionadas.setText(opcionesSeleccionadas.getText()+ "Velocidad ");
					listaSeleccionados.add("Mayor velocidad seleccionado");
				}else {
					String str = opcionesSeleccionadas.getText();
					if(str.contains("Velocidad")) {
						str = str.replace("Velocidad ", "");
						opcionesSeleccionadas.setText(str);
					}
					listaSeleccionados.remove("Mayor velocidad seleccionado");
				}
				if(listaSeleccionados.size() > 0) {
					seleccionado.setText(listaSeleccionados.get(listaSeleccionados.size()-1));
				}else {
					seleccionado.setText("");
				}
				
			}
		});
		menorTamano.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(menorTamano.isSelected()) {
					opcionesSeleccionadas.setText(opcionesSeleccionadas.getText()+ "Tamaño ");
					listaSeleccionados.add("Menor tamaño seleccionado");
				}else {
					String str = opcionesSeleccionadas.getText();
					if(str.contains("Tamaño")) {
						str = str.replace("Tamaño ", "");
						opcionesSeleccionadas.setText(str);
					}
					listaSeleccionados.remove("Menor tamaño seleccionado");
				}
				if(listaSeleccionados.size() > 0) {
					seleccionado.setText(listaSeleccionados.get(listaSeleccionados.size()-1));
				}else {
					seleccionado.setText("");
				}
				
			}
		});
		debug.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(debug.isSelected()) {
					opcionesSeleccionadas.setText(opcionesSeleccionadas.getText()+ "Debug ");
					listaSeleccionados.add("Debug seleccionado");
				}else {
					String str = opcionesSeleccionadas.getText();
					if(str.contains("Debug")) {
						str = str.replace("Debug ", "");
						opcionesSeleccionadas.setText(str);
					}
					listaSeleccionados.remove(debug.getName());
				}
				if(listaSeleccionados.size() > 0) {
					seleccionado.setText("Debug seleccionado");
				}else {
					seleccionado.setText("");
				}
				
			}
		});
	
		
	}

}
