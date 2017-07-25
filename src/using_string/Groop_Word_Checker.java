package using_string;

import java.util.Scanner;

public class Groop_Word_Checker {
	static int Groop_Word(String str)
	{
		int cnt = 1;
		int check;
		int[] check_word = new int[26];
		
		for(int i = 0; i<str.length();i++)
		{
			check = str.charAt(i) - 97;
			if(check_word[check] == 0)
				check_word[check] ++;
			else
			{
				if(check != (str.charAt(i-1)-97))
				{
					cnt=0;
					break;
				}
			}
		}
		
		return cnt;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < N; i++)
		{
			String str = sc.next();
			cnt = cnt + Groop_Word(str);
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
