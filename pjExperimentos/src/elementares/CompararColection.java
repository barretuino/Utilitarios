package elementares;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompararColection {

	public static void main(String[] args) {
		List<Aula> lista = new ArrayList<Aula>();
		
		lista.add(new Aula("Java Básico", 100));
		lista.add(new Aula("Java Intermediário", 50));
		
		lista.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(lista);
	}

}
