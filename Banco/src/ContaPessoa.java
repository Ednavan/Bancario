
public class ContaPessoa {
	public static void main(String[] args) {
		BancoDoBrasil exemplo = new BancoDoBrasil();
		BancoDoBrasil pessoa = new BancoDoBrasil();
		
	
		
		pessoa.deposita(3000);
		exemplo.deposita(1000);
		
		pessoa.transfere(10, exemplo);
		System.out.println(pessoa.saldo);
		System.out.println(exemplo.saldo);
	
		
		
	}
}
