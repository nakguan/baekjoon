package using_string;

import java.util.Scanner;

public class Constant_number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int re_num1 = 0;
		int re_num2 = 0;
		
		for(int i=0;i<3;i++)
		{
			re_num1 = re_num1 * 10 + (num1 % 10);
			re_num2 = re_num2 * 10 + (num2 % 10);
			num1 = num1 / 10;
			num2 = num2 / 10;
		}
		
		if(re_num1<re_num2)
			System.out.println(re_num2);
		else
			System.out.println(re_num1);
		
		sc.close();
	}
}
