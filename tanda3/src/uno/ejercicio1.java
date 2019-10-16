package uno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField inputApellido1;
	private JTextField inputApellido2;
	private JTextField inputNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 frame = new ejercicio1();
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
	public ejercicio1() {
		setResizable(false);
		setTitle("Datos Personales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel datosPersonales = new JPanel();
		datosPersonales.setBorder(new TitledBorder(null, "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(datosPersonales, BorderLayout.NORTH);
		datosPersonales.setLayout(new BorderLayout(0, 0));
		
		JPanel panelOeste = new JPanel();
		datosPersonales.add(panelOeste, BorderLayout.WEST);
		panelOeste.setLayout(new GridLayout(0, 1, 0, 5));
		
		JLabel apellido1 = new JLabel("Apellido Paterno:");
		apellido1.setHorizontalTextPosition(SwingConstants.CENTER);
		apellido1.setHorizontalAlignment(SwingConstants.CENTER);
		apellido1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panelOeste.add(apellido1);
		
		JLabel apellido2 = new JLabel("Apellido Materno");
		apellido2.setHorizontalAlignment(SwingConstants.CENTER);
		apellido2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panelOeste.add(apellido2);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setHorizontalTextPosition(SwingConstants.CENTER);
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panelOeste.add(nombre);
		
		JLabel estadoCivil = new JLabel("Estado Civil:");
		estadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
		estadoCivil.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panelOeste.add(estadoCivil);
		
		JPanel panelCentral = new JPanel();
		datosPersonales.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panelCentral.add(panel);
		
		inputApellido1 = new JTextField();
		inputApellido1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(inputApellido1);
		inputApellido1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panelCentral.add(panel_2);
		
		inputApellido2 = new JTextField();
		inputApellido2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(inputApellido2);
		inputApellido2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panelCentral.add(panel_3);
		
		inputNombre = new JTextField();
		inputNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(inputNombre);
		inputNombre.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panelCentral.add(panel_4);
		
		JComboBox comboBox = new JComboBox();
		panel_4.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
	}

}
