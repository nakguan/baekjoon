package usefor;

import java.util.Scanner;

public class PlusDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String num=sc.next();
		int cnt = 0;
		
		for(int i=0;i<N;i++)
			cnt=cnt+(num.charAt(i)-'0');
		
		System.out.println(cnt);
		
		sc.close();
	}
}
