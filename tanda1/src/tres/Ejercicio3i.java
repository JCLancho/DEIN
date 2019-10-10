package tres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Ejercicio3i extends JFrame {

	private JPanel contentPane;
	private boolean operacionPendiente = false;
	private boolean tocaReset = false;
	private char operacion = ' ';
	private double acumulado = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3i frame = new Ejercicio3i();
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
	public Ejercicio3i() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);
		
		JButton multiplicar = new JButton("x");
		multiplicar.setPreferredSize(new Dimension(46, 25));
		multiplicar.setFocusable(false);
		GridBagConstraints gbc_multiplicar = new GridBagConstraints();
		gbc_multiplicar.fill = GridBagConstraints.BOTH;
		gbc_multiplicar.insets = new Insets(0, 10, 5, 5);
		gbc_multiplicar.gridx = 3;
		gbc_multiplicar.gridy = 3;
		contentPane.add(multiplicar, gbc_multiplicar);
		
		JButton boton9 = new JButton("9");
		GridBagConstraints gbc_boton9 = new GridBagConstraints();
		gbc_boton9.fill = GridBagConstraints.BOTH;
		gbc_boton9.insets = new Insets(0, 0, 5, 5);
		gbc_boton9.gridx = 2;
		gbc_boton9.gridy = 1;
		contentPane.add(boton9, gbc_boton9);
		
		JButton sumar = new JButton("+");
		sumar.setPreferredSize(new Dimension(46, 25));
		sumar.setFocusable(false);
		GridBagConstraints gbc_sumar = new GridBagConstraints();
		gbc_sumar.fill = GridBagConstraints.BOTH;
		gbc_sumar.insets = new Insets(0, 0, 5, 5);
		gbc_sumar.gridx = 4;
		gbc_sumar.gridy = 2;
		contentPane.add(sumar, gbc_sumar);
		
		JButton boton1 = new JButton("1");
		GridBagConstraints gbc_boton1 = new GridBagConstraints();
		gbc_boton1.fill = GridBagConstraints.BOTH;
		gbc_boton1.insets = new Insets(0, 0, 5, 5);
		gbc_boton1.gridx = 0;
		gbc_boton1.gridy = 3;
		contentPane.add(boton1, gbc_boton1);
		
		JButton boton0 = new JButton("0");
		GridBagConstraints gbc_boton0 = new GridBagConstraints();
		gbc_boton0.gridwidth = 2;
		gbc_boton0.fill = GridBagConstraints.BOTH;
		gbc_boton0.insets = new Insets(0, 0, 5, 5);
		gbc_boton0.gridx = 0;
		gbc_boton0.gridy = 4;
		contentPane.add(boton0, gbc_boton0);
		
		JButton boton3 = new JButton("3");
		GridBagConstraints gbc_boton3 = new GridBagConstraints();
		gbc_boton3.fill = GridBagConstraints.BOTH;
		gbc_boton3.insets = new Insets(0, 0, 5, 5);
		gbc_boton3.gridx = 2;
		gbc_boton3.gridy = 3;
		contentPane.add(boton3, gbc_boton3);
		
		JButton boton2 = new JButton("2");
		GridBagConstraints gbc_boton2 = new GridBagConstraints();
		gbc_boton2.fill = GridBagConstraints.BOTH;
		gbc_boton2.insets = new Insets(0, 0, 5, 5);
		gbc_boton2.gridx = 1;
		gbc_boton2.gridy = 3;
		contentPane.add(boton2, gbc_boton2);
		JButton boton7 = new JButton("7");
		GridBagConstraints gbc_boton7 = new GridBagConstraints();
		gbc_boton7.fill = GridBagConstraints.BOTH;
		gbc_boton7.insets = new Insets(0, 0, 5, 5);
		gbc_boton7.gridx = 0;
		gbc_boton7.gridy = 1;
		contentPane.add(boton7, gbc_boton7);
		
		JButton boton6 = new JButton("6");
		GridBagConstraints gbc_boton6 = new GridBagConstraints();
		gbc_boton6.fill = GridBagConstraints.BOTH;
		gbc_boton6.insets = new Insets(0, 0, 5, 5);
		gbc_boton6.gridx = 2;
		gbc_boton6.gridy = 2;
		contentPane.add(boton6, gbc_boton6);
		
		JButton botonBack = new JButton("🔙️");
		GridBagConstraints gbc_botonBack = new GridBagConstraints();
		gbc_botonBack.fill = GridBagConstraints.BOTH;
		gbc_botonBack.insets = new Insets(0, 0, 5, 5);
		gbc_botonBack.gridx = 4;
		gbc_botonBack.gridy = 1;
		contentPane.add(botonBack, gbc_botonBack);
		
		JButton igual = new JButton("=");
		GridBagConstraints gbc_igual = new GridBagConstraints();
		gbc_igual.gridwidth = 2;
		gbc_igual.fill = GridBagConstraints.BOTH;
		gbc_igual.insets = new Insets(0, 10, 5, 5);
		gbc_igual.gridx = 3;
		gbc_igual.gridy = 4;
		contentPane.add(igual, gbc_igual);
		
		JButton boton4 = new JButton("4");
		GridBagConstraints gbc_boton4 = new GridBagConstraints();
		gbc_boton4.fill = GridBagConstraints.BOTH;
		gbc_boton4.insets = new Insets(0, 0, 5, 5);
		gbc_boton4.gridx = 0;
		gbc_boton4.gridy = 2;
		contentPane.add(boton4, gbc_boton4);
		
		JButton boton8 = new JButton("8");
		GridBagConstraints gbc_boton8 = new GridBagConstraints();
		gbc_boton8.fill = GridBagConstraints.BOTH;
		gbc_boton8.insets = new Insets(0, 0, 5, 5);
		gbc_boton8.gridx = 1;
		gbc_boton8.gridy = 1;
		contentPane.add(boton8, gbc_boton8);
		
		JButton boton5 = new JButton("5");
		GridBagConstraints gbc_boton5 = new GridBagConstraints();
		gbc_boton5.fill = GridBagConstraints.BOTH;
		gbc_boton5.insets = new Insets(0, 0, 5, 5);
		gbc_boton5.gridx = 1;
		gbc_boton5.gridy = 2;
		contentPane.add(boton5, gbc_boton5);
		
		JLabel salida = new JLabel("");
		salida.setPreferredSize(new Dimension(0, 20));
		salida.setOpaque(true);
		salida.setMinimumSize(new Dimension(0, 50));
		salida.setHorizontalAlignment(SwingConstants.RIGHT);
		salida.setFocusable(false);
		salida.setEnabled(false);
		salida.setBorder(new LineBorder(Color.LIGHT_GRAY));
		salida.setBackground(Color.YELLOW);
		GridBagConstraints gbc_salida = new GridBagConstraints();
		gbc_salida.anchor = GridBagConstraints.NORTH;
		gbc_salida.fill = GridBagConstraints.HORIZONTAL;
		gbc_salida.insets = new Insets(0, 0, 5, 5);
		gbc_salida.gridwidth = 5;
		gbc_salida.gridx = 0;
		gbc_salida.gridy = 0;
		contentPane.add(salida, gbc_salida);
		
		JButton dividir = new JButton("/");
		dividir.setPreferredSize(new Dimension(46, 25));
		dividir.setFocusable(false);
		GridBagConstraints gbc_dividir = new GridBagConstraints();
		gbc_dividir.anchor = GridBagConstraints.WEST;
		gbc_dividir.fill = GridBagConstraints.VERTICAL;
		gbc_dividir.insets = new Insets(0, 10, 5, 5);
		gbc_dividir.gridx = 3;
		gbc_dividir.gridy = 2;
		contentPane.add(dividir, gbc_dividir);
		
		JButton botonPunto = new JButton(".");
		botonPunto.setPreferredSize(new Dimension(42, 25));
		GridBagConstraints gbc_botonPunto = new GridBagConstraints();
		gbc_botonPunto.fill = GridBagConstraints.BOTH;
		gbc_botonPunto.insets = new Insets(0, 0, 5, 5);
		gbc_botonPunto.gridx = 2;
		gbc_botonPunto.gridy = 4;
		contentPane.add(botonPunto, gbc_botonPunto);
		
		JButton restar = new JButton("-");
		restar.setPreferredSize(new Dimension(46, 25));
		restar.setFocusable(false);
		GridBagConstraints gbc_restar = new GridBagConstraints();
		gbc_restar.insets = new Insets(0, 0, 5, 5);
		gbc_restar.anchor = GridBagConstraints.WEST;
		gbc_restar.fill = GridBagConstraints.VERTICAL;
		gbc_restar.gridx = 4;
		gbc_restar.gridy = 3;
		contentPane.add(restar, gbc_restar);
		
		JButton botonC = new JButton("C");
		botonC.setPreferredSize(new Dimension(46, 25));
		GridBagConstraints gbc_botonC = new GridBagConstraints();
		gbc_botonC.insets = new Insets(0, 10, 5, 5);
		gbc_botonC.anchor = GridBagConstraints.NORTH;
		gbc_botonC.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonC.gridx = 3;
		gbc_botonC.gridy = 1;
		contentPane.add(botonC, gbc_botonC);
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salida.setText("");
			}
		});
		
		JButton[] botones = {boton0,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9};
		for(JButton b : botones) {
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(tocaReset) {
						salida.setText("");
						tocaReset = false;
					}
					if(salida.getText().length() < 20) {
						salida.setText(salida.getText()+ arg0.getActionCommand());
					}
				}
			});
		}
		
		botonC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				salida.setText("");
				operacion = ' ';
				operacionPendiente = false;
				tocaReset = false;
				
			}
		});
		
		botonBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(operacionPendiente) {
					operacionPendiente = false;
					tocaReset = false;
					operacion = ' ';
				}else {
					if(salida.getText().length() > 0)
						salida.setText(salida.getText().substring(0, salida.getText().length()-1));
				}
				
			}
		});
		
		sumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(!operacionPendiente) {
					tocaReset = true;
					operacionPendiente = true;
					operacion = '+';
					acumulado = Double.parseDouble(salida.getText());
				}else {
					resolver(salida);
					tocaReset = true;
					operacionPendiente = true;
					operacion = '+';
					acumulado = Double.parseDouble(salida.getText());
				}
				
			}
		});
		
		
		restar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(!operacionPendiente) {
					tocaReset = true;
					operacionPendiente = true;
					operacion = '-';
					acumulado = Double.parseDouble(salida.getText());
				}else {
					resolver(salida);
					tocaReset = true;
					operacionPendiente = true;
					operacion = '-';
					acumulado = Double.parseDouble(salida.getText());
				}
				
			}
		});
		
		multiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(!operacionPendiente) {
					tocaReset = true;
					operacionPendiente = true;
					operacion = 'x';
					acumulado = Double.parseDouble(salida.getText());
				}else {
					resolver(salida);
					tocaReset = true;
					operacionPendiente = true;
					operacion = '*';
					acumulado = Double.parseDouble(salida.getText());
				}
				
			}
		});
		
		dividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(!operacionPendiente) {
					tocaReset = true;
					operacionPendiente = true;
					operacion = '/';
					acumulado = Double.parseDouble(salida.getText());
				}else {
					resolver(salida);
					tocaReset = true;
					operacionPendiente = true;
					operacion = '/';
					acumulado = Double.parseDouble(salida.getText());
				}
				
			}
		});
		
		igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(operacionPendiente) {
					resolver(salida);
				}
				
			}

		});
		
		botonPunto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String cadena = salida.getText();
				if(!tocaReset) {
					if(cadena.equals("")) {
						salida.setText("0.");
					}else if(!cadena.contains(".")) {
						salida.setText(salida.getText()+".");
					}
				}else {
					tocaReset = false;
					salida.setText("0.");
				}
			}
		});
	}
	
	private void resolver(JLabel salida) {
		switch (operacion) {
		case '+':
			tocaReset = true;
			operacionPendiente = false;
			salida.setText((acumulado+Double.parseDouble(salida.getText())+""));
			break;

		case '-':
			tocaReset = true;
			operacionPendiente = false;
			salida.setText((acumulado-Double.parseDouble(salida.getText())+""));
			break;
			
		case 'x':
			tocaReset = true;
			operacionPendiente = false;
			salida.setText((acumulado*Double.parseDouble(salida.getText())+""));
			break;
			
		case '/':
			tocaReset = true;
			operacionPendiente = false;
			if(!salida.getText().equals("0"))
				salida.setText((acumulado/Double.parseDouble(salida.getText())+""));					
			break;
		}
	}
}
