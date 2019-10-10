package tres;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ejercicio3e {

	public static void main(String[] args) {
		
		int primerValor;
		int segundoValor;
		ImageIcon imageIcon = new ImageIcon("/home/dm2/eclipse-workspace/tanda1/src/java.jpg");
		Image image = imageIcon.getImage(); 
		Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);   
		imageIcon = new ImageIcon(newimg);
		try {
			String primero = (String) JOptionPane.showInputDialog(null, "Introduce el #1", "Entrada", JOptionPane.DEFAULT_OPTION, imageIcon, null, null);
			primerValor = Integer.parseInt(primero);
			String segundo = (String) JOptionPane.showInputDialog(null, "Introduce el #2", "Entrada", JOptionPane.DEFAULT_OPTION, imageIcon, null, null);
			segundoValor = Integer.parseInt(segundo);
			String resultado = "La resta de " + primerValor + "-" + segundoValor + "=" + (primerValor-segundoValor);
			JOptionPane.showMessageDialog(null, resultado, "Mensaje", JOptionPane.DEFAULT_OPTION, imageIcon);
		}catch (NumberFormatException e) {
			String error = e.getMessage().substring(e.getMessage().indexOf('"')+1, e.getMessage().lastIndexOf('"'));
			JOptionPane.showMessageDialog(null, error + " no es un numero", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
