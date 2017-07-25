package prac_rule;

import java.util.Scanner;

public class Fraction_num {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int n=0;
		int cnt = 0;
		int cnt1 = 0;
		int flag = 0;
		for(int i=0;;i++)
		{
			n=n+i;
			if(X > n && X <= (n+i+1))
			{
				cnt = i;
				break;
			}
		}
		
		if (cnt % 2 == 0)
			flag = 1;
		else
			flag = 2;
		
		cnt=cnt+2;
		
		for(int i=n+1; i<=X ;i++)
		{
				cnt--;
				cnt1++;
		}
		
		if(flag == 1)
			System.out.printf("%d/%d\n",cnt,cnt1);
		else
			System.out.printf("%d/%d\n", cnt1, cnt);
		
		sc.close();
	}
}
