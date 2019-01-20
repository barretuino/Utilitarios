package elementares;

public class PrimoFor {
	public static void main(String[] args) {

		int num = 29;
		boolean flag = false;
		for(int i = 2; i <= num/2; ++i)
		{
			//condição para o número não primo
			if(num % i == 0)
			{
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " é um número primo.");
		else
			System.out.println(num + " não é um número primo.");
	}
}
