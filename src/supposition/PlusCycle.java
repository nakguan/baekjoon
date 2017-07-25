package supposition;

import java.util.Scanner;

public class PlusCycle {
	
	static int Cal_PlusCycle(int s)
	{
		int left,right,new_num;
		right = s % 10;
		left = s / 10;
		new_num = left + right;
		
		return right * 10 + (new_num % 10);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = n, cnt = 0;
		while(true)
		{
			s = Cal_PlusCycle(s);
			cnt++;
			if(s == n)
				break;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
