package tres;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class ejercicio3b extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3b frame = new ejercicio3b();
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
	public ejercicio3b() {
		setTitle("JList Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		modelo.addElement("Winesap");
		modelo.addElement("Cortland");
		modelo.addElement("Red Delicious");
		modelo.addElement("Golden Delicious");
		modelo.addElement("Gala");
		modelo.addElement("Fuji");
		modelo.addElement("Pinklady");
		modelo.addElement("Granny Smith");
		modelo.addElement("Reineta");
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		JList<String> list = new JList<String>(modelo);
		scrollPane.setViewportView(list);
		list.setVisibleRowCount(5);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JButton btnComprar = new JButton("Comprar manzanas");
		panel_2.add(btnComprar);
		btnComprar.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(null);
		panel.add(scrollPane_1);
		
		JLabel lblSeleccion = new JLabel("Seleccion actual: ");
		lblSeleccion.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane_1.setViewportView(lblSeleccion);
		
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(list.getSelectedValuesList().size() == 0)
					JOptionPane.showMessageDialog(getContentPane(), "Por favor selecciona un producto");
				else {
					String valor = "<html><p>Selecion actual:</p>";
					for(String s : list.getSelectedValuesList()) {
						valor += "<p>"+s+"</p>";
					}
					valor+= "</html>";
					lblSeleccion.setText(valor);
				}
					
				
			}
		});
	}

}
