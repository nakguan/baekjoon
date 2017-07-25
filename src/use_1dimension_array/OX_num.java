package use_1dimension_array;

import java.util.Scanner;

public class OX_num {
	
	static int cal_score(String str)
	{
		int score = 0;
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'O')
				cnt++;
			else
				cnt=0;
			
			score=score+cnt;
		}
		
		return score;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		String str;
		for(int i=0;i<n;i++)
		{
			str=sc.next();
			score[i] = cal_score(str);
		}
		
		for(int i=0;i<n;i++)
			System.out.println(score[i]);
		
		sc.close();
	}
}
