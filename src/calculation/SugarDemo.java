package calculation;

import java.util.Scanner;

public class SugarDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = num/5;
		int min = 1001;
	
		for(int i = 0;i<=cnt;i++)
		{
			if((num-i*5) % 3 == 0)
			{
				if(min>(i+(num-i*5)/3))
					min=i+(num-i*5)/3;
			}
		}		
		
		if(min == 1001)
			System.out.println(-1);
		else
			System.out.println(min);
		
		sc.close();
	}
}
