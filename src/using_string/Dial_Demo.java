package using_string;

import java.util.Scanner;

public class Dial_Demo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		int cnt = 0;
		for(int i=0;i<dial.length();i++)
		{
			if(dial.charAt(i) == 'A' ||dial.charAt(i) == 'B'||dial.charAt(i) == 'C')
				cnt=cnt+3;
			else if(dial.charAt(i) == 'D' || dial.charAt(i) == 'E' || dial.charAt(i) == 'F')
				cnt=cnt+4;
			else if(dial.charAt(i) == 'G' || dial.charAt(i) == 'H' || dial.charAt(i) == 'I')
				cnt=cnt+5;
			else if(dial.charAt(i) == 'J' || dial.charAt(i) == 'K' || dial.charAt(i) == 'L')
				cnt=cnt+6;
			else if(dial.charAt(i) == 'M' || dial.charAt(i) == 'N' || dial.charAt(i) == 'O')
				cnt=cnt+7;
			else if(dial.charAt(i) == 'P' || dial.charAt(i) == 'Q' || dial.charAt(i) == 'R' || dial.charAt(i) == 'S')
				cnt=cnt+8;
			else if(dial.charAt(i) == 'T' || dial.charAt(i) == 'U' || dial.charAt(i) == 'V')
				cnt=cnt+9;
			else
				cnt=cnt+10;
		}
		System.out.println(cnt);
		
		sc.close();
	}
}
