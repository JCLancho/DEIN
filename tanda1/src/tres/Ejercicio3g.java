package tres;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;

public class Ejercicio3g extends JFrame {

	private JPanel contentPane;
	private ButtonGroup grupo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3g frame = new Ejercicio3g();
					frame.setLocationRelativeTo(null);
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
	public Ejercicio3g() {
		grupo = new ButtonGroup();
		setTitle("Mini Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSO = new JLabel("Elige un sistema operativo");
		contentPane.add(lblSO);
		
		JRadioButton radioWindows = new JRadioButton("Windows");
		contentPane.add(radioWindows);
		grupo.add(radioWindows);
		
		JRadioButton radioLinux = new JRadioButton("Linux");
		contentPane.add(radioLinux);
		grupo.add(radioLinux);
		
		JRadioButton radioMac = new JRadioButton("Mac");
		contentPane.add(radioMac);
		grupo.add(radioMac);
		
		JRadioButton[] radios = {radioWindows,radioLinux,radioMac};
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator);
		
		JLabel lblEspecialidad = new JLabel("Elige tu especialidad");
		contentPane.add(lblEspecialidad);
		
		JCheckBox checkProgramacion = new JCheckBox("Programación");
		contentPane.add(checkProgramacion);
		
		JCheckBox checkDiseno = new JCheckBox("Diseño gráfico");
		contentPane.add(checkDiseno);
		
		JCheckBox checkAdministracion = new JCheckBox("Administración");
		contentPane.add(checkAdministracion);
		
		JCheckBox[] checks = {checkAdministracion,checkDiseno,checkProgramacion};
		
		JSeparator separator_1 = new JSeparator();
		contentPane.add(separator_1);
		
		JLabel lblHoras = new JLabel("Horas que dedicas en el ordenador");
		contentPane.add(lblHoras);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNum = new JLabel("0");
		lblNum.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNum.setHorizontalAlignment(SwingConstants.LEFT);
		lblNum.setPreferredSize(new Dimension(20, 15));
		panel.add(lblNum);
		
		JSlider slider = new JSlider();
		panel.add(slider);
		slider.setSize(new Dimension(200, 16));
		slider.setValue(0);
		slider.setMaximum(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnGenerar = new JButton("Generar");
		panel_1.add(btnGenerar);
		btnGenerar.setHorizontalTextPosition(SwingConstants.CENTER);
		
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String so = "";
				for(JRadioButton r : radios) {
					if(r.isSelected()) {
						so = r.getText();
						break;
					}
				}
				String especialidades = "";
				for(JCheckBox c : checks) {
					if(c.isSelected()) {
						especialidades += c.getText()+", ";
					}
				}
				if(!so.equals("") && !especialidades.equals("")) {
					if(especialidades.length() > 0)
						especialidades = especialidades.substring(0, especialidades.length()-2);
					
					String mostrar = "Tu sistema operativo preferido es " + so + ",\n"
							+ "tus especialidades son " + especialidades + "\n"
							+ "y el numero de horas dedicadas al ordenador son " +  slider.getValue();
					JOptionPane.showMessageDialog(getContentPane(), mostrar, "Muestra de datos",JOptionPane.INFORMATION_MESSAGE);
				}else {
					if(so.equals("")) {
						JOptionPane.showMessageDialog(getContentPane(), "Selecciona un Sistema Operativo");
					}
					if(especialidades.equals("")) {
						JOptionPane.showMessageDialog(getContentPane(), "Selecciona alguna especialidad");
					}
				}
				
				
			}
		});
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				
				lblNum.setText(slider.getValue()+"");
				
			}
		});
	}

}
