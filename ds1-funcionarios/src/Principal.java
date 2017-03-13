import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		Funcionario horacio;
		horacio = new Funcionario();
		horacio.id =  Integer.parseInt(JOptionPane.showInputDialog("Digite o id do funcionário"));
		horacio.salario =  Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));
		horacio.nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
		horacio.estaNaEmpresa = true;
		JOptionPane.showMessageDialog(null, horacio.mostra());
		horacio.demite();
	}
}
