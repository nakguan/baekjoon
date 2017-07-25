package using_string;

import java.util.Scanner;

public class Print_Ascii {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String asc = sc.next();
		
		int n = asc.charAt(0);
		System.out.println(n);
		
		sc.close();
	}
}
