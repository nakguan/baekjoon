package num_1000;

import java.util.Scanner;

public class Teret_1002 {
	static int fibonacci(int n, int[] check)
	{
		if(n==0){
			check[0]++;
			return 0;
		}else if(n==1){6
			check[1]++;
			return 1;
		} else{
			return fibonacci(n-1,check) + fibonacci(n-2,check);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		
		for(int i=0;i<n;i++)
			s[i] = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int[] check = new int[2];
			fibonacci(s[i],check);
			System.out.println(check[0]+" "+check[1]);
		}
		
		sc.close();
	}
}
