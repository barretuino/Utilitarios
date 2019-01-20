package barretuino.carrinho;

public class TesteCarrinho {
	public static void main(String[] args) {
		Carrinho<Produto> carrinho = new Carrinho<>();
		Livro lib1 = new Livro();
		lib1.setCodigo(123);
		lib1.setDescricao("Java Como Programar");
		lib1.setQuantidade(1);
		lib1.setValor(85.11);		
		carrinho.adicionar(lib1);
		
		Celular cel = new Celular();
		cel.setCodigo(789);
		cel.setDescricao("Motorola J5");
		cel.setQuantidade(2);
		cel.setValor(1_756.00);		
		carrinho.adicionar(cel);
		
		String nota = carrinho.emitirNota();
		System.out.println(nota);
	}
}
