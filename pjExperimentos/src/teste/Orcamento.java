package teste;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private String anoMes;
	private List valores;

	public Orcamento(String anoMes, Float...valores){
		this. anoMes = anoMes;
		this.valores = new ArrayList<Float>();
		for(Float valor : valores)
			this.valores.add(valor);
	}

	public Orcamento() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Orcamento orc = new Orcamento("201801", (float)100.50, (float)200.00, (float)13.26);
		System.out.println("Ano Mês " + orc.anoMes + " - " + "Valores " + orc.valores);
	}

}
