package inputoutput;

//import java.io.*;
import java.util.Scanner;
public class JustPrint1 {

	/*public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String test;
		
		while((test = br.readLine()) != null)
			System.out.print(test);
		
		br.close();
	}*/
		   public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		       while(sc.hasNextLine()){
		              System.out.println(sc.nextLine());
		       }
		       sc.close();
		   }
}
