
public class Funcionario {
	public int id;
	public String nome;
	public double salario;
	public boolean estaNaEmpresa;
	public void  bonifica(double aumento){
		this.salario = this.salario + aumento;
	}
	public void demite(){
		this.estaNaEmpresa = false;
	}
	public String mostra(){
		return "ID: " + this.id + "\nNome: " + this.nome + "\nSalário" + this.salario;
	}
}