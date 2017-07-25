package usefor;

import java.util.Scanner;

public class Date_2007_Demo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cnt = 0;
		
		for(int i=x;i>=1;i--)
		{
			if(i != x)
				y=month[i];
				
			for(int j = y; j>=1; j--)
				cnt++;
		}
		
		
		switch(cnt % 7)
		{
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}
		
		sc.close();
	
	}

}
