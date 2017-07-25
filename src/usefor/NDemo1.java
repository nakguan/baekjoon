package usefor;

import java.util.Scanner;

public class NDemo1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = a ; i>=1 ; i--)
			System.out.println(i);
		
		sc.close();
		
	}
}
