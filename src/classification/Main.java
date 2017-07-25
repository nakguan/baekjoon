package classification;

import java.util.Scanner;

public class Main {
	public static int loopnum(int r1, int c1, int r2, int c2){
		if(r1<0)
			r1=r1 * -1;
		if(c1<0)
			c1=c1 * -1;
		if(r2<0)
			r2=r2 * -1;
		if(c2<0)
			c2=c2 * -1;
		
		int max=0;
		
		if(r1>max)
			max=r1;
		if(c1>max)
			max=c1;
		if(r2>max)
			max=r2;
		if(c2>max)
			max=c2;
		
		int num=max*2+1;
		
		return num;
	}
	
	public static int findmax(int v[][],int cent, int r1, int c1, int r2, int c2)
	{
		int max=0;
		for(int i=cent+r1;i<cent+r2+1;i++)
		{
			for(int j=cent+c1;j<cent+c2+1;j++)
			{
				if(max<v[i][j])
					max=v[i][j];
			}
		}
		return max;
	}
	
	public static int finddot(int num)
	{
		int dot = 0;
		while(num!=0)
		{
			num=num/10;
			dot++;
		}
		return dot;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r1,c1,r2,c2;
		int farray=0;
		int cnt=1,fcnt=0,ffcnt=0;
		int[][] array;
		
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		
		int num = loopnum(r1,c1,r2,c2);

		array = new int[num+1][num+1];
		int cent = num/2+1;
		int nr = cent;
		int nc = cent;
		
		int num1=num*num;
		
		for(int i=1;i<num1+1;i++)
		{
			array[nr][nc]=i;
			switch(farray % 4)
			{
			case 0:
				nc=nc+1;
				break;
			case 1:
				nr=nr-1;
				break;
			case 2:
				nc=nc-1;
				break;
			case 3:
				nr=nr+1;
				break;
			}
			
			fcnt++;
			
			if(fcnt == cnt)
			{
				farray++;
				fcnt=0;
				ffcnt++;
			}
			
			if(ffcnt == 2)
			{
				cnt++;
				ffcnt=0;
			}
		}
	
		int max = findmax(array,cent,r1,c1,r2,c2);
		for(int i=cent+r1;i<cent+r2+1;i++)
		{
			for(int j=cent+c1;j<cent+c2+1;j++)
			{
				int c=0;
				
				while(c<finddot(max)-finddot(array[i][j]))
				{
					System.out.print(" ");
					c++;
				}
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
