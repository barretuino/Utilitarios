package barretuino.carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho<P extends Produto> {
	private List<P> colecao;
	public Carrinho() {
		colecao = new ArrayList<P>();
	}
	
	public void adicionar(P produto) {
		colecao.add(produto);
	}
	
	public String emitirNota() {
		String notaFiscal = "";
		double total = 0;
		for(P item : colecao) {
			notaFiscal += "Nome " + item.getDescricao() + "\n";
			notaFiscal += "Quantidade " + Utils.formatarCasas(item.getQuantidade(),2) + "\n";
			notaFiscal += "Valor R$ " + Utils.formatarCasas(item.getValor(), 2) + "\n";
			notaFiscal += "---------------------------------------\n";
			total += item.getValor();
		}
		notaFiscal += "Valor Total R$ " + Utils.formatarCasas(total, 2);
		return notaFiscal;
	}

}