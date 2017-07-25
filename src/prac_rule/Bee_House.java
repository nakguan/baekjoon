package prac_rule;

import java.util.Scanner;

public class Bee_House {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt=1;
		
		for(int i=1;; i++)
		{
			if(N==1)
				break;
			
			if(2 + 3 * i * (i-1)<= N && N < 2 + 3 * (i+1) * i )
			{
				cnt = i+1;
				break;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
