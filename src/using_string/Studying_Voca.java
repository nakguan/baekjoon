package using_string;

import java.util.Scanner;

public class Studying_Voca {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] alphabet = new int[26];
		int max = -999;
		int index = 0;
		int cnt = 0;
		for(int i=0;i<word.length();i++)
		{
			int asci;
			asci = word.charAt(i);
			if(asci>=97)
				alphabet[asci - 97]++;
			else
				alphabet[asci - 65]++;
		}
		
		
		for(int i=0;i<26;i++)
		{
			if(max<alphabet[i])
			{
				max = alphabet[i];
				index = i;
			}
		}
		
		for(int i=0;i<26;i++)
		{
			if(max == alphabet[i])
				cnt++;
		}
		
		if (cnt >= 2)
			System.out.println("?");
		else
			System.out.println((char)(index+65));
		
		sc.close();
	}
}
//a= 97
//A=65