package elementares;

/**
 * O conceito da Álgebra para um número de Armstrong 
 * diz que: é um número de n dígitos que é igual a soma 
 * de cada um dos seus dígitos elevado a n-ésima potência .
 * @author Paulo Barreto
 */

public class NumeroArmstrong {
	public static void main(String[] args) {

		int number = 371, originalNumber, remainder, result = 0;

		originalNumber = number;

		while (originalNumber != 0)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}
}