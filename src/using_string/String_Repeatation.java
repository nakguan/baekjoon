package using_string;

import java.util.Scanner;

public class String_Repeatation {
	
	static void Repeatation(String str,int num)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int num_T = sc.nextInt();
		String[] test_case = new String[num_T];
		int[] num_R = new int[num_T];
		for(int i=0;i<num_T;i++)
		{
			num_R[i] = sc.nextInt();
			test_case[i] = sc.next();
		}
		
		for(int i = 0;i<num_T;i++)
			Repeatation(test_case[i],num_R[i]);
		
		sc.close();
	}
}
