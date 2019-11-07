package siete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ejercicio7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
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
	public Ejercicio7() {
		setTitle("Barras de progreso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JProgressBar progressBarHorizontal = new JProgressBar();
		panel.add(progressBarHorizontal);
		progressBarHorizontal.setStringPainted(true);
		
		JProgressBar progressBarVertical = new JProgressBar();
		panel.add(progressBarVertical);
		progressBarVertical.setStringPainted(true);
		progressBarVertical.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblHorizontal = new JLabel("Valor horizontal de la barra de progreso:  ");
		contentPane.add(lblHorizontal);
		
		JLabel lblValorHorizontal = new JLabel("");
		contentPane.add(lblValorHorizontal);
		
		JLabel lblVertical = new JLabel("Valor vertical de la barra de progreso:  ");
		contentPane.add(lblVertical);
		
		JLabel lblValorVertical = new JLabel("");
		contentPane.add(lblValorVertical);
		
		JButton btnPulsar = new JButton("Pulsar");
		contentPane.add(btnPulsar);
		
		btnPulsar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int a = progressBarHorizontal.getValue() + 10;
				if(a <= 100) {
					progressBarHorizontal.setValue(a);
					lblValorHorizontal.setText(a + "");
				}
				
				int b = progressBarVertical.getValue() + 10;
				if(b <= 100) {
					progressBarVertical.setValue(a);
					lblValorVertical.setText(b + "");
				}
				
				
				
			}
		});
		
	}

}
