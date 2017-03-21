import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		Calculadora calc;
		calc = new Calculadora();
		DecimalFormat df = new DecimalFormat("0.00");
		calc.numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
		calc.numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
		JOptionPane.showMessageDialog(null, "Soma = " + df.format(calc.soma()) + "\n Subtração = " + df.format(calc.subtracao()) + "\n Muliplicação = " + df.format(calc.multiplicacao()) + "\n Divisão = " + df.format(calc.divisao()));
	}
}
