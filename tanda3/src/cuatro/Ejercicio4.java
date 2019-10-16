package cuatro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField mTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		setResizable(false);
		setTitle("Imitador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panelOriginal = new JPanel();
		panelOriginal.setBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "Original", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelOriginal);
		panelOriginal.setLayout(new GridLayout(3, 3, 0, 0));
		
		JRadioButton opcion1 = new JRadioButton("Opcion 1");
		panelOriginal.add(opcion1);
		
		JCheckBox opcion4 = new JCheckBox("Opcion 4");
		panelOriginal.add(opcion4);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panelOriginal.add(panel_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JRadioButton opcion2 = new JRadioButton("Opcion 2");
		panelOriginal.add(opcion2);
		
		JCheckBox opcion5 = new JCheckBox("Opcion 5");
		panelOriginal.add(opcion5);
		
		JPanel panel_3 = new JPanel();
		panelOriginal.add(panel_3);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"}));
		panel_3.add(comboBox);
		
		JRadioButton opcion3 = new JRadioButton("Opcion 3");
		panelOriginal.add(opcion3);
		
		JCheckBox opcion6 = new JCheckBox("Opcion 6");
		panelOriginal.add(opcion6);
		
		JPanel panel_4 = new JPanel();
		panelOriginal.add(panel_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		panel_4.add(spinner);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(opcion1);
		grupo.add(opcion2);
		grupo.add(opcion3);
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator);
		
		JRadioButton[] radiosOriginales = {opcion1, opcion2, opcion3};
		JCheckBox[] checksOriginales = {opcion4, opcion5, opcion6};
		
		
		
		//Mirrro
		JPanel panelEspejo = new JPanel();
		panelEspejo.setBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "Espejo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelEspejo);
		panelEspejo.setLayout(new GridLayout(3, 3, 0, 0));
		
		JRadioButton mOpcion1 = new JRadioButton("Opcion 1");
		mOpcion1.setEnabled(false);
		panelEspejo.add(mOpcion1);
		
		JCheckBox mOpcion4 = new JCheckBox("Opcion 4");
		mOpcion4.setEnabled(false);
		panelEspejo.add(mOpcion4);
		
		JPanel panel_5 = new JPanel();
		panelEspejo.add(panel_5);
		
		mTextField = new JTextField();
		mTextField.setEnabled(false);
		mTextField.setHorizontalAlignment(SwingConstants.CENTER);
		mTextField.setColumns(10);
		panel_5.add(mTextField);
		
		JRadioButton mOpcion2 = new JRadioButton("Opcion 2");
		mOpcion2.setEnabled(false);
		panelEspejo.add(mOpcion2);
		
		JCheckBox mOpcion5 = new JCheckBox("Opcion 5");
		mOpcion5.setEnabled(false);
		panelEspejo.add(mOpcion5);
		
		JPanel panel_6 = new JPanel();
		panelEspejo.add(panel_6);
		
		JComboBox<String> mComboBox = new JComboBox<String>();
		mComboBox.setEnabled(false);
		mComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"}));
		panel_6.add(mComboBox);
		
		JRadioButton mOpcion3 = new JRadioButton("Opcion 3");
		mOpcion3.setEnabled(false);
		panelEspejo.add(mOpcion3);
		
		JCheckBox mOpcion6 = new JCheckBox("Opcion 6");
		mOpcion6.setEnabled(false);
		panelEspejo.add(mOpcion6);
		
		JPanel panel_7 = new JPanel();
		panelEspejo.add(panel_7);
		
		JSpinner mSpinner = new JSpinner();
		mSpinner.setEnabled(false);
		mSpinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		panel_7.add(mSpinner);
		
		ButtonGroup mGrupo = new ButtonGroup();
		mGrupo.add(mOpcion1);
		mGrupo.add(mOpcion2);
		mGrupo.add(mOpcion3);
		
		JRadioButton[] radiosEspejo = {mOpcion1, mOpcion2, mOpcion3};
		JCheckBox[] checksEspejo = {mOpcion4, mOpcion5, mOpcion6};
		
		for(JRadioButton r : radiosOriginales) {
			r.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					for(int i = 0; i < radiosOriginales.length; i++) {
						if(radiosOriginales[i].isSelected()) {
							radiosEspejo[i].setSelected(true);
						}
					}
					
				}
			});
		}
		
		for(JCheckBox c : checksOriginales) {
			c.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					for(int i = 0; i < checksOriginales.length; i++) {
						if(checksOriginales[i].isSelected()) {
							checksEspejo[i].setSelected(true);
						}else {
							checksEspejo[i].setSelected(false);
						}
					}
					
				}
			});
		}
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				mComboBox.setSelectedIndex(comboBox.getSelectedIndex());
				
			}
		});
		
		textField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				mTextField.setText(textField.getText());
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				mTextField.setText(textField.getText());
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				mTextField.setText(textField.getText());
			}
		});
		
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				
				mSpinner.setValue(spinner.getValue());
				
			}
		});
		
	}

}
