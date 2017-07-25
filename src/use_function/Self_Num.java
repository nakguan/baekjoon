package use_function;

public class Self_Num {
	
	static void Cal_Self_Num(int checknum[], int n)
	{
		int num1000, num100, num10, num1;
		while(true)
		{
			num1000 = n / 1000;
			num100 = (n % 1000) / 100;
			num10 = (n % 100) / 10;
			num1 = n % 10;
			n = n + num1000+num100+num10+num1;
			
			if(n>10000)
				break;
			
			checknum[n] = 1;
		}
		
	}
	
	public static void main(String[] args)
	{
		int checknum[] = new int[10001];
		
		for(int i=1;i<10001;i++)
			Cal_Self_Num(checknum,i);
		
		for(int i=1;i<10001;i++)
			if(checknum[i] == 0)
				System.out.println(i);
	}
}
