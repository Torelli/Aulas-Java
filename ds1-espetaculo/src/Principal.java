import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		double resultado;
		Espetaculo teatro;
		teatro = new Espetaculo();
		teatro.custoTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo total"));
		teatro.precoConvite = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do convite"));
		resultado = teatro.calculaQtdeConvites();
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}
