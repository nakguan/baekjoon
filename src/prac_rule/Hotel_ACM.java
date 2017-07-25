package prac_rule;

import java.util.Scanner;

public class Hotel_ACM {
	
	static int allocation(int H,int W, int N)
	{
		int col = 1;
		int row = 0;
		
		for(int i=0;i<N;i++)
		{
			if(row >= H)
			{
				col++;
				row = 0;
			}
			row++;
		}
		
		return row*100+col;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] test_case = new int[t];
		
		for(int i=0;i<t;i++)
		{
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			test_case[i] = allocation(H,W,N);
		}
		
		for(int i=0;i<t;i++)
			System.out.println(test_case[i]);
		
		sc.close();
		
	}
}
