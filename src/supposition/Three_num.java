package supposition;

import java.util.Scanner;

public class Three_num {
	
	static void sorting(int num[])
	{
		int temp;
		for(int i=0;i<3;i++)
		{
			for(int j=i;j<3;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		
		for(int i=0;i<3;i++)
			num[i]=sc.nextInt();
		
		sorting(num);
		
		System.out.println(num[1]);
		
		sc.close();
	}
}
