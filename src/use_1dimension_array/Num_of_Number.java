package use_1dimension_array;

import java.util.Scanner;

public class Num_of_Number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num[]={0,0,0,0,0,0,0,0,0,0};
		int D = A * B * C;
		
		while(D != 0)
		{
			num[D%10]++;
			D=D/10;
		}
		
		for(int i=0;i<10;i++)
			System.out.println(num[i]);
		
		sc.close();
		
	}
}
