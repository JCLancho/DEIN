package dos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio2b extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2b frame = new ejercicio2b();
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
	public ejercicio2b() {
		setTitle("Editor Texto simple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setMargin(new Insets(5, 5, 5, 5));
		textArea.setRows(5);
		textArea.setLineWrap(true);
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblBuscar = new JLabel("Buscar...");
		panel_1.add(lblBuscar);
		lblBuscar.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblBuscar.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscar.setAlignmentY(Component.TOP_ALIGNMENT);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		txtFieldBuscar = new JTextField();
		txtFieldBuscar.setMinimumSize(new Dimension(10, 19));
		txtFieldBuscar.setSize(new Dimension(5, 19));
		txtFieldBuscar.setPreferredSize(new Dimension(10, 19));
		panel_2.add(txtFieldBuscar);
		txtFieldBuscar.setColumns(20);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton btnInicio = new JButton("Buscar desde inicio");
		panel_3.add(btnInicio);
		btnInicio.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JButton btnSiguiente = new JButton("Buscar siguiente");
		panel_4.add(btnSiguiente);
		btnSiguiente.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtFieldBuscar.getText().equals("") || txtFieldBuscar.getText() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Introduce algo que buscar");
				}else {
					try {
						textArea.requestFocus();
						int idx = textArea.getText().indexOf(txtFieldBuscar.getText(), 0);
						textArea.setCaretPosition(idx);
						textArea.moveCaretPosition(idx+txtFieldBuscar.getText().length());
					}
					catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(getContentPane(), "Ninguna palabra encontrada");
					}
				}
				
			}
		});
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.requestFocus();				
				if(txtFieldBuscar.getText().equals("") || txtFieldBuscar.getText() == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Introduce algo que buscar");
				}else {
					if(textArea.getSelectedText() == null || textArea.getSelectedText().equals("")) {
						textArea.setCaretPosition(0);
						try {
							int idx = textArea.getText().indexOf(txtFieldBuscar.getText(), textArea.getCaretPosition());
							textArea.setCaretPosition(idx);
							textArea.moveCaretPosition(idx+txtFieldBuscar.getText().length());
						}
						catch (IllegalArgumentException e) {
							JOptionPane.showMessageDialog(getContentPane(), "Ultima palabra alcanzada");
						}
					}else {
							try {
								int idx = textArea.getText().indexOf(txtFieldBuscar.getText(), textArea.getCaretPosition());
								textArea.setCaretPosition(idx);
								textArea.moveCaretPosition(idx+txtFieldBuscar.getText().length());
						}
						catch (IllegalArgumentException e) {
							JOptionPane.showMessageDialog(getContentPane(), "Ultima palabra alcanzada");
						}
					}
				}
			}
		});
	}

}
