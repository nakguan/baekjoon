package using_string;

import java.util.Scanner;

public class Find_Alphabet {
	
	static void find_alphabet(String str, int alphabet[])
	{
		for(int i=0;i<str.length();i++)
		{
			int n = str.charAt(i) - 'a';
			if(alphabet[n] == -1)
				alphabet[n] = i;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[26];
		String str = sc.nextLine();
		for(int i=0;i<26;i++)
			alphabet[i] = -1;
		
		find_alphabet(str,alphabet);
		
		for(int i=0;i<26;i++)
			System.out.print(alphabet[i] + " ");
		
		sc.close();
	}
}
