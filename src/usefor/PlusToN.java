package usefor;

import java.util.Scanner;

public class PlusToN {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++)
			cnt = cnt + i;
		
		System.out.println(cnt);
		
		sc.close();
	}
}
