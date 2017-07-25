package sorting_number;

import java.util.Scanner;

public class Sorting_num {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for(int i=0;i<N;i++)
			num[i] = sc.nextInt();
		int temp;
		for(int i=0;i<N;i++)
		{
			for(int j = i;j<N;j++)
			{
				if(num[i]>num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] =temp;
				}
			}
		}
		
		for(int i=0;i<N;i++)
			System.out.println(num[i]);
		
		sc.close();
	}
}
