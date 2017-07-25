package supposition;

import java.util.Scanner;

public class BetterThanAverage {
	
	static double Cal_BetterThanAverage(double student[],int n)
	{
		double avg = 0;
		double cnt=0;
		for(int i=0;i<n;i++)
			avg = avg + student[i];
		avg = avg / n;
		
		for(int i=0;i<n;i++)
			if(student[i]>avg)
				cnt++;
		
		return cnt/n*100;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double bta[] = new double[c];
		for(int i=0;i<c;i++)
		{
			int n = sc.nextInt();
			double student[] = new double[n];
			for(int j=0;j<n;j++)
				student[j] = sc.nextInt();
			bta[i] = Cal_BetterThanAverage(student,n);
		}
		
		for(int i=0;i<c;i++)
			System.out.printf("%.3f%% \n",bta[i]);
		
		sc.close();
	}
}
