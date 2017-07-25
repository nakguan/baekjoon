package supposition;

import java.util.Scanner;

public class LittleThanX {
	
	static void FindLittleThan(int num[], int x)
	{
		for(int i=0;i<num.length;i++)
			if(num[i]<x)
				System.out.print(num[i]+" ");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int num[] = new int[N];
		
		for(int i=0;i<N;i++)
			num[i]=sc.nextInt();
		
		FindLittleThan(num,x);
		
		sc.close();
	}
}
