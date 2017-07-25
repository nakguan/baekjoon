package sorting_number;

import java.util.Scanner;

public class Cal_median {
	static void sort(int k_num[],int K)
	{
		int temp;
		for(int i=0;i<K;i++)
		{
			for(int j=i;j<K;j++)
			{
				if(k_num[i]>k_num[j])
				{
					temp = k_num[i];
					k_num[i] = k_num[j];
					k_num[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		long sum = 0;
		
		
		int[] num = new int[N];
		
		for(int i = 0;i<N;i++)
			num[i] = sc.nextInt();
		
		
		for(int i = 0;i<N-K+1;i++)
		{
			int[] k_num = new int[K];
			for(int j = 0;j<K;j++)
				k_num[j] = num[i+j];
			sort(k_num,K);
			sum = sum + k_num[K/2];
		}
		
		System.out.println(sum);
		sc.close();
	}
}
