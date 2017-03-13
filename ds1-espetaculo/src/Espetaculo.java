
public class Espetaculo {
	public double custoTotal;
	public double precoConvite;
	public int calculaQtdeConvites(){
		int result;
		result = (int)this.custoTotal/(int)this.precoConvite;
		return result;
	}
}