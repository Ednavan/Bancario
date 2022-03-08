
public class BancoDoBrasil {
	int conta;
	double saldo;
	int numero;              //atributos
	String titular;
	
	void depositar(double valor) {
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
	

	
}
