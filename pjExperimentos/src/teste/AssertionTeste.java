package teste;

public class AssertionTeste {
	public static void main(String[] args) {
		int value = 5; 
		assert value >= 20 : " Valor inválido"; 
		System.out.println("value is " + value); 
	}
}