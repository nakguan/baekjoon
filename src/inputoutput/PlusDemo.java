package inputoutput;

import java.util.Scanner;

public class PlusDemo {
	public static void main(String[] args){
		int A,B;
		Scanner sc = new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		
		System.out.println(A+B);
		sc.close();
	}
}
