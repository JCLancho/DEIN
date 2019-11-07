package seis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Hashtable;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ejercicio6 extends JFrame {

	private JPanel contentPane;
	private String bass = "Bass: ";
	private String midrange = "Midrange: ";
	private String treble = "Treble: ";
	private String balance = "Balance: ";
	private String volumen = "Volumen: ";
	private HashMap<JSlider, Integer> valoresDefault;
	private HashMap<JSlider, Integer> valoresPreset1;
	private HashMap<JSlider, Integer> valoresPreset2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
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
	public Ejercicio6() {
		valoresDefault = new HashMap<JSlider, Integer>();
		valoresPreset1 = new HashMap<JSlider, Integer>();
		valoresPreset2 = new HashMap<JSlider, Integer>();
		setTitle("Reproductor de audio sencillo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(480, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel lblBass = new JLabel("Bass");
		panel_2.add(lblBass);
		
		Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put(-10, new JLabel("-10"));
		labelTable.put(-8, new JLabel("-8"));
		labelTable.put(-6, new JLabel("-6"));
		labelTable.put(-4, new JLabel("-4"));
		labelTable.put(-2, new JLabel("-2"));
		labelTable.put(0, new JLabel("0"));
		labelTable.put(+2, new JLabel("+2"));
		labelTable.put(+4, new JLabel("+4"));
		labelTable.put(+6, new JLabel("+6"));
		labelTable.put(+8, new JLabel("+8"));
		labelTable.put(+10, new JLabel("+10"));
		
		Hashtable<Integer, JLabel> balanceTable = new Hashtable<Integer, JLabel>();
		balanceTable.put(-5, new JLabel("L"));
		balanceTable.put(0, new JLabel("Center"));
		balanceTable.put(+5, new JLabel("R"));
	
		
		
		JSlider sliderBass = new JSlider();
		sliderBass.setPreferredSize(new Dimension(300, 50));
		sliderBass.setValue(0);
		sliderBass.setPaintTicks(true);
		sliderBass.setPaintLabels(true);
		sliderBass.setMinorTickSpacing(1);
		sliderBass.setMinimum(-10);
		sliderBass.setMaximum(10);
		sliderBass.setMajorTickSpacing(2);
		sliderBass.setLabelTable(labelTable);
		panel_2.add(sliderBass);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblMidrange = new JLabel("Midrange");
		panel_3.add(lblMidrange);
		
		JSlider sliderMidrange = new JSlider();
		sliderMidrange.setPreferredSize(new Dimension(300, 50));
		sliderMidrange.setValue(0);
		sliderMidrange.setPaintTicks(true);
		sliderMidrange.setPaintLabels(true);
		sliderMidrange.setMinorTickSpacing(1);
		sliderMidrange.setMinimum(-10);
		sliderMidrange.setMaximum(10);
		sliderMidrange.setMajorTickSpacing(2);
		sliderMidrange.setLabelTable(labelTable);
		panel_3.add(sliderMidrange);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JLabel lblTreble = new JLabel("Treble");
		panel_4.add(lblTreble);
		
		JSlider sliderTreble = new JSlider();
		sliderTreble.setPreferredSize(new Dimension(300, 50));
		sliderTreble.setValue(0);
		sliderTreble.setPaintTicks(true);
		sliderTreble.setPaintLabels(true);
		sliderTreble.setMinorTickSpacing(1);
		sliderTreble.setMinimum(-10);
		sliderTreble.setMaximum(10);
		sliderTreble.setMajorTickSpacing(2);
		sliderTreble.setLabelTable(labelTable);
		panel_4.add(sliderTreble);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JLabel lblBalance = new JLabel("Balance");
		panel_5.add(lblBalance);
		
		JSlider sliderBalance = new JSlider();
		sliderBalance.setPreferredSize(new Dimension(300, 50));
		sliderBalance.setValue(0);
		sliderBalance.setPaintTicks(true);
		sliderBalance.setPaintLabels(true);
		sliderBalance.setMinimum(-5);
		sliderBalance.setMaximum(5);
		sliderBalance.setMajorTickSpacing(1);
		sliderBalance.setLabelTable(balanceTable);
		panel_5.add(sliderBalance);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JLabel lblVolumen = new JLabel("Volumen");
		panel_6.add(lblVolumen);
		
		JSlider sliderVolumen = new JSlider();
		sliderVolumen.setPreferredSize(new Dimension(300, 50));
		sliderVolumen.setValue(0);
		sliderVolumen.setPaintTicks(true);
		sliderVolumen.setPaintLabels(true);
		sliderVolumen.setMaximum(10);
		sliderVolumen.setMajorTickSpacing(1);
		panel_6.add(sliderVolumen);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		
		JRadioButton radioDefaults = new JRadioButton("Defaults");
		panel_7.add(radioDefaults);
		
		JRadioButton radioPreset1 = new JRadioButton("Preset 1");
		panel_7.add(radioPreset1);
		
		JRadioButton radioPreset2 = new JRadioButton("Preset 2");
		panel_7.add(radioPreset2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(1, 2, 10, 0));
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		
		JButton btnGuardar = new JButton("Guardar Seleccion");
		panel_9.add(btnGuardar);
		
		btnGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(radioDefaults.isSelected()) {
					valoresDefault.put(sliderBass, sliderBass.getValue());
					valoresDefault.put(sliderMidrange, sliderMidrange.getValue());
					valoresDefault.put(sliderTreble, sliderTreble.getValue());
					valoresDefault.put(sliderBalance, sliderBalance.getValue());
					valoresDefault.put(sliderVolumen, sliderVolumen.getValue());
				}else if(radioPreset1.isSelected()) {
					valoresPreset1.put(sliderBass, sliderBass.getValue());
					valoresPreset1.put(sliderMidrange, sliderMidrange.getValue());
					valoresPreset1.put(sliderTreble, sliderTreble.getValue());
					valoresPreset1.put(sliderBalance, sliderBalance.getValue());
					valoresPreset1.put(sliderVolumen, sliderVolumen.getValue());
				}else {
					valoresPreset2.put(sliderBass, sliderBass.getValue());
					valoresPreset2.put(sliderMidrange, sliderMidrange.getValue());
					valoresPreset2.put(sliderTreble, sliderTreble.getValue());
					valoresPreset2.put(sliderBalance, sliderBalance.getValue());
					valoresPreset2.put(sliderVolumen, sliderVolumen.getValue());
				}
				
			}
		});
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.Y_AXIS));
		
		JLabel bassValor = new JLabel("Bass: +0");
		panel_8.add(bassValor);
		
		JLabel midrangeValor = new JLabel("Midrange: +0");
		panel_8.add(midrangeValor);
		
		JLabel trebleValor = new JLabel("Treble: +0");
		panel_8.add(trebleValor);
		
		JLabel balanceValor = new JLabel("Balance: Center");
		panel_8.add(balanceValor);
		
		JLabel volumenValor = new JLabel("Volumen: 0");
		panel_8.add(volumenValor);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radioDefaults);
		grupo.add(radioPreset1);
		grupo.add(radioPreset2);
		radioDefaults.setSelected(true);
		
		radioDefaults.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!valoresDefault.isEmpty()) {
					sliderBass.setValue(valoresDefault.get(sliderBass));
					sliderMidrange.setValue(valoresDefault.get(sliderMidrange));
					sliderTreble.setValue(valoresDefault.get(sliderTreble));
					sliderBalance.setValue(valoresDefault.get(sliderBalance));
					sliderVolumen.setValue(valoresDefault.get(sliderVolumen));
				}
				
			}
		});
		
		radioPreset1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!valoresPreset1.isEmpty()) {
					sliderBass.setValue(valoresPreset1.get(sliderBass));
					sliderMidrange.setValue(valoresPreset1.get(sliderMidrange));
					sliderTreble.setValue(valoresPreset1.get(sliderTreble));
					sliderBalance.setValue(valoresPreset1.get(sliderBalance));
					sliderVolumen.setValue(valoresPreset1.get(sliderVolumen));
				}
				
			}
		});
		
		radioPreset2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!valoresPreset2.isEmpty()) {
					sliderBass.setValue(valoresPreset2.get(sliderBass));
					sliderMidrange.setValue(valoresPreset2.get(sliderMidrange));
					sliderTreble.setValue(valoresPreset2.get(sliderTreble));
					sliderBalance.setValue(valoresPreset2.get(sliderBalance));
					sliderVolumen.setValue(valoresPreset2.get(sliderVolumen));
				}
				
			}
		});
		
		sliderBass.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				int a = sliderBass.getValue();
				if(labelTable.containsKey(a))
					bassValor.setText(bass + labelTable.get(a).getText());
				else
					bassValor.setText(bass + a); 
				
			}
		});

		sliderMidrange.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				int a = sliderMidrange.getValue();
				if(labelTable.containsKey(a))
					midrangeValor.setText(midrange + labelTable.get(a).getText());
				else
					midrangeValor.setText(midrange + a); 
				
			}
		});

		sliderTreble.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				int a = sliderTreble.getValue();
				if(labelTable.containsKey(a))
					trebleValor.setText(treble + labelTable.get(a).getText());
				else
					trebleValor.setText(treble + a); 
				
			}
		});
		
		sliderBalance.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				int a = sliderBalance.getValue();
				if(balanceTable.containsKey(a))
					balanceValor.setText(balance + balanceTable.get(a).getText());
				else
					balanceValor.setText(balance + a); 
				
			}
		});
		
		sliderVolumen.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				volumenValor.setText(volumen + sliderVolumen.getValue());
				
			}
		});
		
	}

}
