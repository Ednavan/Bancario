
public class ContaPessoa {
	public static void main(String[] args) {
		BancoDoBrasil exemplo = new BancoDoBrasil();
		exemplo.saldo = 500;
		System.out.println("saldo em conta: "+ exemplo.saldo);
		
		exemplo.depositar(1000);
		System.out.println("Saldo ap�s o dep�sito "+exemplo.saldo);
		
	 	boolean saque =  exemplo.saca(300);
		System.out.println("informa��es apos o saque"+ exemplo.saldo);
		
		System.out.println(saque);
	}
}
