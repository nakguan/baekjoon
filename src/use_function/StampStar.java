package use_function;

import java.util.Scanner;

public class StampStar {
	
	static void Stamp(int table[][],int start,int line)
	{
		table[line][start] ++;
		table[line+1][start-1]++;
		table[line+1][start+1] ++;
		
		for(int i=0;i<5;i++)
			table[line+2][start-2+i]++;
			
	}
	
	static void Check_Stamp_where(int step,int table[][],int line,int start)
	{
		
		Stamp(table,start,line);
		
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int line = 0;
		int table[][] = new int[N][(2*N+1)];
		int start = (2*N-1)/2+1 ;
		
		Check_Stamp_where(N,table,line,start);
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<2*N+1;j++)
			{
				if(table[i][j] %2 == 0 || table[i][j]==0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
