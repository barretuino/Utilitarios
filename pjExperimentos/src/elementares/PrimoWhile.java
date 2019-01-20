package elementares;

public class PrimoWhile {
	public static void main(String[] args) {

		int num = 33, i = 2;
		boolean flag = false;
		while(i <= num/2)
		{
			//condição para o número não primo
			if(num % i == 0)
			{
				flag = true;
				break;
			}

			++i;
		}

		if (!flag)
			System.out.println(num + " é um número primo.");
		else
			System.out.println(num + " não é um número primo.");
	}
}