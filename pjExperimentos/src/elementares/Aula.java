package elementares;

public class Aula {

	private String nome;
	private int tempo;
	
	public Aula(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	@Override
	public String toString() {
		return "[" + getNome() + ", " + getTempo() + "]";
	}
}