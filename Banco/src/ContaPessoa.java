
public class ContaPessoa {
	public static void main(String[] args) {
		BancoDoBrasil exemplo = new BancoDoBrasil();
		exemplo.saldo = 500;
		System.out.println("saldo em conta: "+ exemplo.saldo);
		
		exemplo.depositar(1000);
		System.out.println("Saldo após o depósito "+exemplo.saldo);
		
		System.out.println("ok");
	}
}
