
public abstract class Conta implements IConta {
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia1;
	protected int numero1;
	protected double saldo1;
	protected Cliente cliente;
	
	
	public void Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	
	}
		
	@Override
    public void sacar(double valor) {
		saldo -= valor;

}

   @Override
    public void depositar(double valor) {
	   saldo += valor;

}

   @Override
    public void transferir(double valor, Conta contaDestino) {
	   this.sacar(valor);
	   contaDestino.depositar(valor);
	   
   }
	
    private int agencia;
    private  int numero;
    private double saldo;
   
   
    public int getAgencia() {
	  return agencia1;
}


   public int getNumero() {
	   return numero1;
   }
   

   public double getSaldo() {
	  return saldo1;
}
     
   protected void imprimirInfosComuns() {
	System.out.println(String.format("Titular: %s", this.cliente.getNome()));
	System.out.println(String.format("Agencia: %d", this.agencia1));
	System.out.println(String.format("Conta: %d", this.numero1));
	System.out.println(String.format("Saldo: %d", this.saldo1));
	
   }

	public void imprimirInfosComuns1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}		
}


	