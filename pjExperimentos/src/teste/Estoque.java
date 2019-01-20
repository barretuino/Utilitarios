package teste;

public class Estoque {

	public static void imprimir(Long saldo) {
		System.out.print("Long ");
	}
	
	public static void imprimir(int saldo) {
		System.out.print("int ");
	}
	
	public static void imprimir(Short saldo) {
		System.out.print("Short ");
	}

	public static void main(String[] args) {
		short shortSaldo = 10;
		int intSaldo = 3;
		
		imprimir(shortSaldo);
		imprimir(intSaldo);
	}
}
