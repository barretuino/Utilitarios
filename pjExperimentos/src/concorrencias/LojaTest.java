package concorrencias;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class LojaTest {

	public static void main(String[] args) {
		Loja americanas = new Loja();
		Loja casasBahia = new Loja();
		Loja mercadoLivre = new Loja();
		Loja wallmart = new Loja();
		
		long start = System.currentTimeMillis();
		
		//Sincrono
//		System.out.println(americanas.getPreco());
//		System.out.println(casasBahia.getPreco());
//		System.out.println(mercadoLivre.getPreco());
//		System.out.println(wallmart.getPreco());
		
//		System.out.println(System.currentTimeMillis() - start + " ms");
		
		//Assincrono
		Future<Double> precoAsync = americanas.getPrecoAsync();
		Future<Double> precoAsync1 = casasBahia.getPrecoAsync();
		Future<Double> precoAsync2 = mercadoLivre.getPrecoAsync();
		Future<Double> precoAsync3 = wallmart.getPrecoAsync();
		
		System.out.println("Tempo que levou para pegar o resultado " +
				(System.currentTimeMillis() - start) + " ms");
		esperando();
		
		try {
			System.out.println("americanas " + precoAsync.get());
			System.out.println("casasBahia " + precoAsync1.get());
			System.out.println("mercadoLivre " + precoAsync2.get());
			System.out.println("wallmart " + precoAsync3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	private static void esperando() {
		long soma = 0;
		for(int i=0; i<1_000_000; i++) {
			soma += i;
		}
		System.out.println(soma);
		
	}
}