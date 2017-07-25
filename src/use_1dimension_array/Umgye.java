package use_1dimension_array;

import java.util.Scanner;

public class Umgye {
	
	static int judge(int um[])
	{
		int flag=0;
		for(int i=1;i<8;i++)
		{
			if(um[i-1]<um[i] && (flag==1 || flag == 0))
				flag=1;
			if(um[i-1]>um[i] && (flag==2 || flag == 0))
				flag=2;
			
			if((um[i-1]<um[i] && flag==2) || (um[i-1]>um[i] && flag==1))
			{
				flag=3;
				break;
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] um = new int[8];
		int adm;
		
		for(int i=0;i<8;i++)
			um[i] = sc.nextInt();
		
		adm = judge(um);
		
		if (adm==3)
			System.out.println("mixed");
		else if(adm == 1)
			System.out.println("ascending");
		else
			System.out.println("descending");
		
		sc.close();
		
	}
}
