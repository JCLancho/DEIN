package cinco;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Ejercicio5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
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
	public Ejercicio5() {
		setTitle("Panel de pestañas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("File manager");
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel panel1 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel1.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("File Manager", null, panel1, null);
		
		JLabel lblPanel1 = new JLabel("Pestaña de File Manager");
		panel1.add(lblPanel1);
		
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Desarrollo", null, panel2, null);
		
		JLabel lblPanel2 = new JLabel("Pestaña de Desarrollo");
		panel2.add(lblPanel2);
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Informes", null, panel3, null);
		
		JLabel lblPanel3 = new JLabel("Pestaña de Informes");
		panel3.add(lblPanel3);
		
		JPanel panel4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel4.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Administración", null, panel4, null);
		
		JLabel lblPanel4 = new JLabel("Pestaña de Adeministración");
		panel4.add(lblPanel4);
		
		JPanel panel5 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel5.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Proyectos", null, panel5, null);
		
		JLabel lblPanel5 = new JLabel("Pestaña de Proyectos");
		panel5.add(lblPanel5);
	}
}
