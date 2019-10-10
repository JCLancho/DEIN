package tres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3a extends JFrame {

	private JPanel contentPane;
	private JTextField jtf1;
	private JTextField jtf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3a frame = new Ejercicio3a();
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
	public Ejercicio3a() {
		setTitle("Uso de campos de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 162);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel etiqueta = new JLabel("");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(etiqueta, BorderLayout.CENTER);
		
		jtf1 = new JTextField();
		jtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiqueta.setText("ENTER pulsado en jtf1: " + jtf1.getText());
			}
		});
		panel.add(jtf1);
		jtf1.setColumns(10);
		
		jtf2 = new JTextField();
		jtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etiqueta.setText("ENTER pulsado en jtf2: " + jtf2.getText());
			}
		});
		panel.add(jtf2);
		jtf2.setColumns(10);
		
		
	}

}
