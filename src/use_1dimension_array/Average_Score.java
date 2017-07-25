package use_1dimension_array;

import java.util.Scanner;

public class Average_Score {
	
	static int cal_average(int score[])
	{
		int avg=0;
		for(int i=0;i<5;i++)
		{
			if(score[i]<40)
				avg=avg+40;
			else
				avg=avg+score[i];
		}
		
		return avg/5;
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int average;	
		for(int i=0;i<5;i++)
			score[i]=sc.nextInt();
		
		average=cal_average(score);
		System.out.println(average);
		
		sc.close();
	}
}
