
public class BancoDoBrasil {
	int conta;
	double saldo;
	int numero;              //atributos
	String titular;
	
	void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public boolean  saca(double valor) {
	if(	this.saldo >=  valor) {
		this.saldo = this.saldo - valor;
		return true;
	}else{
		return false;
	}
		
	}
	
	
	public boolean transfere(double valor, BancoDoBrasil destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
	}
	

	
}
