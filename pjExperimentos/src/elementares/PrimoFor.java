package elementares;

public class PrimoFor {
	public static void main(String[] args) {

		int num = 29;
		boolean flag = false;
		for(int i = 2; i <= num/2; ++i)
		{
			//condi��o para o n�mero n�o primo
			if(num % i == 0)
			{
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " � um n�mero primo.");
		else
			System.out.println(num + " n�o � um n�mero primo.");
	}
}
