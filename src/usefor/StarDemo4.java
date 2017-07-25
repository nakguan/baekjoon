package usefor;

import java.util.Scanner;

public class StarDemo4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j <= n-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
