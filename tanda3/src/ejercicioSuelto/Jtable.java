package ejercicioSuelto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Jtable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtable frame = new Jtable();
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
	public Jtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Tabla", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 51, 51)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//DefaultTableColumnModel
		
		table = new JTable();
		table.setAutoscrolls(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null},
		},
		new String[] {
				"Nombre", "DNI", "Edad", "Fecha Nacimiento", "Hobby", "Nombre", "DNI", "Edad", "Fecha Nacimiento", "Hobby"
		});
		table.setModel(modelo);
		for(int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setPreferredWidth(150);
		}
		scrollPane.setViewportView(table);
	}

}
