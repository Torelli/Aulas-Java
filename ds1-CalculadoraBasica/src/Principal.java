import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		Calculadora calc;
		calc = new Calculadora();
		DecimalFormat df = new DecimalFormat("0.00");
		calc.numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		calc.numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		JOptionPane.showMessageDialog(null, "Soma = " + df.format(calc.soma()) + "\n Subtra��o = " + df.format(calc.subtracao()) + "\n Muliplica��o = " + df.format(calc.multiplicacao()) + "\n Divis�o = " + df.format(calc.divisao()));
	}
}
