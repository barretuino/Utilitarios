package elementares;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompararColection {

	public static void main(String[] args) {
		List<Aula> lista = new ArrayList<Aula>();
		
		lista.add(new Aula("Java B�sico", 100));
		lista.add(new Aula("Java Intermedi�rio", 50));
		
		lista.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(lista);
	}

}
