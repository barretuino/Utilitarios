package teste;

import java.util.Date;

public class AcordoFornecedor {
	public int numero;
	private Date dataEmissao;
	private Date dataEntrega;

	public void inicia(int numero, Date dataEmissao, Date dataEntrega) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.dataEntrega = dataEntrega;
	}
}