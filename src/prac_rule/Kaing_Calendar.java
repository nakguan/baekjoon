package prac_rule;

import java.util.Scanner;

public class Kaing_Calendar {
	static int cal_kaing_calendar(int m, int n, int x, int y)
	{
		int cnt = 1;
		int flag = 0;
		int i=1,j=1;
		
		while(true)
		{
			if(i>=m)
				i=1;
			else
				i++;
			
			if(j>=n)
				j=1;
			else
				j++;
			
			cnt++;
			if(i == x && j==y)
			{
				flag=1;
				break;
			}
			if(i==m && j==n)
				break;
		}
		if(flag==1)
			return cnt;
		else
			return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] test_case = new int[t];
		
		for(int i=0;i<t;i++)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			test_case[i] = cal_kaing_calendar(m,n,x,y);
		}
		
		for(int i=0;i<t;i++)
			System.out.println(test_case[i]);
		
		sc.close();
	}
}
