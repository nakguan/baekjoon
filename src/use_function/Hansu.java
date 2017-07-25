package use_function;

import java.util.Scanner;

public class Hansu {
	
	static boolean is_Hansu(int i)
	{
		int num100,num10,num1;
		
		if(i<100)
			return true;
		else
		{
			num100=i / 100;
			num10 = (i % 100) / 10;
			num1 = i % 10;
			if((num100-num10) == (num10 - num1))
				return true;
			else
				return false;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt=0;
		for(int i=1;i<=N;i++)
			if(is_Hansu(i))
				cnt++;
		
		System.out.println(cnt);
		
		sc.close();
	}
}
