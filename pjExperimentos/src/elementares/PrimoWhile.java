package elementares;

public class PrimoWhile {
	public static void main(String[] args) {

		int num = 33, i = 2;
		boolean flag = false;
		while(i <= num/2)
		{
			//condi��o para o n�mero n�o primo
			if(num % i == 0)
			{
				flag = true;
				break;
			}

			++i;
		}

		if (!flag)
			System.out.println(num + " � um n�mero primo.");
		else
			System.out.println(num + " n�o � um n�mero primo.");
	}
}