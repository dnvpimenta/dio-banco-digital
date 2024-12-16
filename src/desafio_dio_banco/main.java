package desafio_dio_banco;

public class main {
	
	public static void main(String[] args) {
		cliente diego = new cliente();
		diego.setNome("Diego");
		
		conta cc = new contaCorrente(diego);
		conta poupanca = new contaCorrente(diego);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		}
}
