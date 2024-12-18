package desafio_dio_banco;

public class contaCorrente extends conta {

	public contaCorrente(cliente cliente) {
		super(cliente);
		
	}
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();

	}
	
	}