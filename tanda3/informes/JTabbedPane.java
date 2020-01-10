

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class JTabbedPane extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTabbedPane frame = new JTabbedPane();
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
	public JTabbedPane() {		
		setTitle("Informes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		javax.swing.JTabbedPane tabbedPane = new javax.swing.JTabbedPane(javax.swing.JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel panelProductos = new JPanel();
		tabbedPane.addTab("Productos", null, panelProductos, null);
		
		JButton btnProductos = new JButton("Generar Informe");
		panelProductos.add(btnProductos);
		
		JPanel panelSeccion = new JPanel();
		tabbedPane.addTab("Seccion", null, panelSeccion, null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		panelSeccion.add(comboBox);
		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
		comboModel.addAll(cargarCombo());
		comboBox.setModel(comboModel);
		
		
		JButton btnSeccion = new JButton("Generar Informe");
		panelSeccion.add(btnSeccion);
		
		btnProductos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/examen_2019_11_13","dm2", "dm2");
					JasperReport report = JasperCompileManager.compileReport("/home/dm2/eclipse-workspace/Reports/InformeProductos.jrxml");
					JasperPrint print = JasperFillManager.fillReport(report, null, conn);
					JasperExportManager.exportReportToPdfFile(print, "/home/dm2/Escritorio/InformeProductos.pdf");
				} catch (JRException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		btnSeccion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {				
				try {
					Map<String, Object> hm = new HashMap<String, Object>();
					hm.put("seccion", comboBox.getSelectedItem().toString());
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/examen_2019_11_13","dm2", "dm2");
					JasperReport report = JasperCompileManager.compileReport("/home/dm2/eclipse-workspace/Reports/InformeSeccion.jrxml");
					JasperPrint print = JasperFillManager.fillReport(report, hm, conn);
					JasperExportManager.exportReportToPdfFile(print, "/home/dm2/Escritorio/InformeSeccion.pdf");
				} catch (JRException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	
	private ArrayList<String> cargarCombo(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/examen_2019_11_13","dm2", "dm2");
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery("SELECT DISTINCT seccion FROM productos " );
			ArrayList<String> al = new ArrayList<String>();
			while(result.next()) {
				al.add(result.getString("seccion"));
			}
			return al;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
