package prac_rule;

import java.util.Scanner;

public class Fly_me_to_the_Alpha_Centauri {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] test_case = new int[t];
		
		for(int i=0;i<t;i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int cnt = 0;
			int rep = 1;
			int now = 0;
			int rep_rep = 0;
			int flag =0;
			while(true)
			{
				rep_rep++;
				for(int j=1;j<=rep;j++)
				{
					now++;
					if(now == (y-x))
					{
						flag=1;
						break;
					}
				}
				
				cnt++;
				
				if(flag == 1)
					break;
				
				if(rep_rep % 2 == 0)
					rep++;
				
			}
			
			test_case[i] = cnt;
		}
		
		for(int i=0;i<t;i++)
			System.out.println(test_case[i]);
		
		sc.close();
	}
}
