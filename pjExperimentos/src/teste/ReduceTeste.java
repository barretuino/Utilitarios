package teste;

import java.util.Arrays;
import java.util.List;

public class ReduceTeste {
	public static void main(String[] args) {
		//Reduce Array to sum.
		int nValores = 100_000_000;
		double array[] = new double[nValores];
		for(int i=0; i<nValores; i++) {
			array[i] = Math.random() * 100;
		}
		double sum = 0;
		for(int i=0; i<nValores; i++) {
			sum += Math.random() * 100;
		}
		System.out.println("Soma usando for: "+ sum);
		
		sum=0;
		//Otimizado
		sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
		System.out.println("Sum of Array: "+ sum);
		//Reduce List to sum.
		List<Integer> list = Arrays.asList(30, 10, 20, 40);
		sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum of List: "+ sum);
	}
} 