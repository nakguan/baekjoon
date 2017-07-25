package supposition;

import java.util.Scanner;

public class Average {
	
	static void camouflage(double num[],int n){
		double max = 0;
		
		for(int i=0;i<n;i++)
			if(max<num[i])
				max=num[i];
		
		for(int i=0;i<n;i++)
			num[i]=num[i] / max * 100;
	}
	
	static double cal_average(double num[],int n){
		double average = 0;
		for(int i=0;i<n;i++)
			average = average + num[i];
		
		average = average / n;
		
		return average;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double num[] = new double[n];
		double ave;
		for(int i=0;i<n;i++)
			num[i] = sc.nextInt();
		
		camouflage(num,n);
		ave=cal_average(num,n);
		System.out.printf("%.2f", ave);
		sc.close();
		
	}
}
