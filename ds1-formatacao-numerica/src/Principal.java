import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		Boletim b1;
		b1 = new Boletim();
		DecimalFormat df = new DecimalFormat("0.00");
		b1.avaliacaoPratica = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Av. Prática"));
		b1.avaliacaoTeorica = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Av. Teórica"));
		b1.exercicios = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota dos Exercícios"));
		JOptionPane.showMessageDialog(null, "Média final: " + df.format(b1.media()) + "\nResultado: " + b1.resultado());
		
	}
}
