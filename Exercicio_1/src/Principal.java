import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		double resultado;
		Trapezio trap;
		trap = new Trapezio();
		trap.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		trap.baseMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a base maior"));
		trap.baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite a base menor"));
		resultado = trap.calculaArea();
		JOptionPane.showMessageDialog(null, resultado);
	}
}