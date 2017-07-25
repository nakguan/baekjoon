package prac_rule;

import java.util.Scanner;

public class Room_Number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[10];
		int cnt=0;
		
		while(N != 0)
		{
			if(num[N % 10] == 0)
			{
				if(N % 10 == 9 && num[6] > 0)
					num[6]--;
				else if(N % 10 == 6 && num[9] >0 )
					num[9]--;
				else
				{
					cnt++;
					for(int i=0;i<10;i++)
						num[i]++;
					num[N % 10]--;
				}
			}
			else
				num[N % 10]--;
			
			N=N/10;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}