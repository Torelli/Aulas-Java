
public class Trapezio {
	public double baseMaior;
	public double baseMenor;
	public double altura;
	public double calculaArea(){
		double resultado;
		resultado = this.altura*(this.baseMaior+this.baseMenor)/2;
		return resultado;
	}
}