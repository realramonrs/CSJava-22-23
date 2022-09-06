package ejemplos;

import javax.swing.JOptionPane;

public class _07LecturaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Introduzca un nombre.");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduzca su salario base:"));

	}

}
