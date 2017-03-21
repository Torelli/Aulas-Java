
public class Boletim {
	public double avaliacaoPratica;
	public double avaliacaoTeorica;
	public double exercicios;
	
	public double media(){
		double result;
		result = (avaliacaoPratica + avaliacaoTeorica + exercicios)/3;
		return result;
		
	}
	public String resultado(){
		
		if(media()>7){
			return "Aprovado";
		}
		else{
			return "Reprovado";
		}
	}
	
}
