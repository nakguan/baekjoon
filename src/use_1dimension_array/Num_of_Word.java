package use_1dimension_array;

import java.util.Scanner;

public class Num_of_Word {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt = 0;
		int flag = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ' && flag == 0)
				flag++;
			
			if(str.charAt(i) == ' ' && flag==1)
				flag++;
			
			if(str.charAt(i) != ' ' && flag==2)
			{
				cnt++;
				flag=1;
			}
		}
		
		if(flag == 1 || flag == 2)
			cnt++;
		
		System.out.println(cnt);
		sc.close();
	}
}
