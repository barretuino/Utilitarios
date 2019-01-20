package elementares;

/**
 * O conceito da �lgebra para um n�mero de Armstrong 
 * diz que: � um n�mero de n d�gitos que � igual a soma 
 * de cada um dos seus d�gitos elevado a n-�sima pot�ncia .
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