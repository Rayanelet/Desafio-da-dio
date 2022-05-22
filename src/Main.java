
public class Main {
	
	public static void main(String[] args) {
		Cliente rayane = new Cliente();
		rayane.setNome("Rayane");
		
		
		Conta cc= new ContaCorrente(rayane);
	    Conta poupanca = new ContaPoupanca(rayane);
	    
	    cc.depositar(100);
	    cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();


}
}
