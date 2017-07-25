package prac_rule;

import java.util.Scanner;

public class President_of_Women_Association {
	
	static int num_resident(int k, int n)
	{
		int[][] resident = new int[k+1][n+1];
		
		for(int i=0;i<k+1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==0)
					resident[i][j] = j;
				else
				{
					for(int l=0;l<=j;l++)
						resident[i][j]=resident[i][j]+resident[i-1][l];
				}
			}
		}
		return resident[k][n];
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] test_case = new int[t];
		for(int i=0;i<t;i++)
		{
			int k = sc.nextInt();
			int n = sc.nextInt();
			test_case[i] = num_resident(k,n);
		}
		
		for(int i=0;i<t;i++)
			System.out.println(test_case[i]);
		
		sc.close();
	}
}
