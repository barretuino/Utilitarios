package concorrencias;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest {
	public static ExecutorService executorService = Executors.newFixedThreadPool(1);
	
	public static void main(String[] args) {
		Future<Double> future = executorService.submit(new Callable<Double>() {
			public Double call() throws Exception{
				TimeUnit.SECONDS.sleep(2);
				return 2000D;
			}
		});		
		esperando();
		try {
			Double resultado = future.get(2, TimeUnit.SECONDS);
			System.out.println(resultado);
		}catch(InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}finally {
			executorService.shutdown();
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