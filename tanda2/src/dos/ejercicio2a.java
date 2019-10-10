package dos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Scrollbar;
import java.util.StringTokenizer;
import java.awt.Dimension;

public class ejercicio2a extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2a frame = new ejercicio2a();
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
	public ejercicio2a() {
		setTitle("Area de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		

		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setRows(10);
		textArea.setColumns(15);
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scroll);
		
		JLabel lblCuentaActual = new JLabel("Cuenta actual: ");
		contentPane.add(lblCuentaActual);
		
		textArea.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				
				String texto = textArea.getText().trim();
				StringTokenizer st = new StringTokenizer(texto);
				lblCuentaActual.setText("Cuenta actual: " + st.countTokens());
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				
				String texto = textArea.getText().trim();
				StringTokenizer st = new StringTokenizer(texto);
				lblCuentaActual.setText("Cuenta actual: " + st.countTokens());
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
