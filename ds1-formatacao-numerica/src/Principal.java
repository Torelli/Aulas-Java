import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		Boletim b1;
		b1 = new Boletim();
		DecimalFormat df = new DecimalFormat("0.00");
		b1.avaliacaoPratica = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Av. Pr�tica"));
		b1.avaliacaoTeorica = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Av. Te�rica"));
		b1.exercicios = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota dos Exerc�cios"));
		JOptionPane.showMessageDialog(null, "M�dia final: " + df.format(b1.media()) + "\nResultado: " + b1.resultado());
		
	}
}
