package uno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;

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
		setSize(580, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(null);
		contentPane.add(panelDatos, BorderLayout.CENTER);
		panelDatos.setLayout(new BorderLayout(0, 0));
		
		JPanel panelOeste = new JPanel();
		panelOeste.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatos.add(panelOeste, BorderLayout.CENTER);
		GridBagLayout gbl_panelOeste = new GridBagLayout();
		gbl_panelOeste.columnWidths = new int[]{100, 420};
		gbl_panelOeste.rowHeights = new int[]{46, 46, 46, 46};
		gbl_panelOeste.columnWeights = new double[]{0.0, 0.0};
		gbl_panelOeste.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		panelOeste.setLayout(gbl_panelOeste);
		
		JLabel apellido1 = new JLabel("Apellido Paterno:");
		apellido1.setHorizontalTextPosition(SwingConstants.CENTER);
		apellido1.setHorizontalAlignment(SwingConstants.CENTER);
		apellido1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_apellido1 = new GridBagConstraints();
		gbc_apellido1.fill = GridBagConstraints.BOTH;
		gbc_apellido1.insets = new Insets(0, 0, 5, 5);
		gbc_apellido1.gridx = 0;
		gbc_apellido1.gridy = 0;
		panelOeste.add(apellido1, gbc_apellido1);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panelOeste.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		inputApellido1 = new JTextField();
		inputApellido1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_2.add(inputApellido1);
		inputApellido1.setHorizontalAlignment(SwingConstants.LEFT);
		inputApellido1.setColumns(40);
		
		JLabel apellido2 = new JLabel("Apellido Materno");
		apellido2.setHorizontalAlignment(SwingConstants.CENTER);
		apellido2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_apellido2 = new GridBagConstraints();
		gbc_apellido2.fill = GridBagConstraints.BOTH;
		gbc_apellido2.insets = new Insets(0, 0, 5, 5);
		gbc_apellido2.gridx = 0;
		gbc_apellido2.gridy = 1;
		panelOeste.add(apellido2, gbc_apellido2);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		panelOeste.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		inputApellido2 = new JTextField();
		panel_3.add(inputApellido2);
		inputApellido2.setHorizontalAlignment(SwingConstants.LEFT);
		inputApellido2.setColumns(40);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setHorizontalTextPosition(SwingConstants.CENTER);
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.fill = GridBagConstraints.BOTH;
		gbc_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_nombre.gridx = 0;
		gbc_nombre.gridy = 2;
		panelOeste.add(nombre, gbc_nombre);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 2;
		panelOeste.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		inputNombre = new JTextField();
		panel_4.add(inputNombre);
		inputNombre.setHorizontalAlignment(SwingConstants.LEFT);
		inputNombre.setColumns(40);
		
		JLabel estadoCivil = new JLabel("Estado Civil:");
		estadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
		estadoCivil.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_estadoCivil = new GridBagConstraints();
		gbc_estadoCivil.fill = GridBagConstraints.BOTH;
		gbc_estadoCivil.insets = new Insets(0, 0, 5, 5);
		gbc_estadoCivil.gridx = 0;
		gbc_estadoCivil.gridy = 3;
		panelOeste.add(estadoCivil, gbc_estadoCivil);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 3;
		panelOeste.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Casad@", "Solter@"}));
		panel_5.add(comboBox);
		
		JPanel panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(200, 61));
		panel_6.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setMinimumSize(new Dimension(200, 61));
		panel_6.setMaximumSize(new Dimension(200, 61));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.anchor = GridBagConstraints.WEST;
		gbc_panel_6.gridx = 1;
		gbc_panel_6.gridy = 4;
		panelOeste.add(panel_6, gbc_panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton radioMasculino = new JRadioButton("Masculino");
		panel_6.add(radioMasculino);
		
		JRadioButton radioFemenino = new JRadioButton("Femenino");
		panel_6.add(radioFemenino);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radioMasculino);
		grupo.add(radioFemenino);
		
		JPanel panelBotones = new JPanel();
		panelDatos.add(panelBotones, BorderLayout.SOUTH);
		panelBotones.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelBotones.add(panel);
		
		JButton btnGuardar = new JButton("Guardar");
		panel.add(btnGuardar);
		btnGuardar.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panelBotones.add(panel_1);
		
		JButton btnSalir = new JButton("Salir");
		panel_1.add(btnSalir);
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panelListado = new JPanel();
		panelListado.setBorder(new TitledBorder(null, "Listado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelListado, BorderLayout.SOUTH);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setRows(15);
		textArea.setColumns(52);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		panelListado.add(scrollPane);
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(inputApellido1.getText().equals("")) {
					JOptionPane.showMessageDialog(getContentPane(), "Debe rellenar el apellido paterno");
				}else if(inputApellido2.getText().equals("")) {
					JOptionPane.showMessageDialog(getContentPane(), "Debe rellenar el apellido materno");
				}else if(inputNombre.getText().equals("")) {
					JOptionPane.showMessageDialog(getContentPane(), "Debe rellenar el nombre");
				}else if(!radioMasculino.isSelected() && !radioFemenino.isSelected()){
					JOptionPane.showMessageDialog(getContentPane(), "Debe seleccionar un sexo");
				}else {
					String str = inputApellido1.getText() + " " + 
								inputApellido2.getText() + ", " + 
								inputNombre.getText() + " " + 
								comboBox.getSelectedItem().toString() + " " + 
								(radioMasculino.isSelected() ? radioMasculino.getText() : radioFemenino.getText())
								+ "\n";
					textArea.setText(textArea.getText() + str);
					inputApellido1.setText("");
					inputApellido2.setText("");
					inputNombre.setText("");
					
				}
				
			}
		});
	}

}
