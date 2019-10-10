package tres;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3b extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3b frame = new Ejercicio3b();
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
	public Ejercicio3b() {
		setTitle("Copiar y pegar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton cortar = new JButton("Cortar");
		panel.add(cortar);
		
		JButton pegar = new JButton("Pegar");
		panel.add(pegar);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel todo = new JLabel("Todo el texto: ");
		panel_2.add(todo);
		
		JLabel lblTodo = new JLabel("");
		panel_2.add(lblTodo);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel selected = new JLabel("Texto seleccionado: ");
		panel_3.add(selected);
		
		JLabel lblSelected = new JLabel("");
		panel_3.add(lblSelected);
		
		textField = new JTextField();
		textField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				lblTodo.setText(textField.getText());
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				
				lblTodo.setText(textField.getText());
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {

				System.out.println((textField.getSelectedText()));
			}
		});
		
		textField.addMouseMotionListener(new MouseAdapter() {
		
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				lblSelected.setText(textField.getSelectedText());
				
			}
			
		
		});
		
		textField.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				// TODO Auto-generated method stub
				lblSelected.setText(textField.getSelectedText());
			}
		});
		
		
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(20);
		panel_1.add(textField);
		
		cortar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getSelectedText() != null && !textField.getSelectedText().equals("")) {
					textField.cut();					
				}
			}
		});
		
		pegar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.paste();
			}
		});
		
		
		
	}

}
