package using_string;

import java.util.Scanner;

public class Croatia_Alphabet {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = 0;
		
		for(int i=0; i<str.length();i++)
		{
			switch(str.charAt(i))
			{
			case 'c':
				if(i != str.length()-1)
				{
					if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-')
					{
						cnt++;
						i++;
					}
					else
						cnt++;
				}
				else
					cnt++;
				
				break;
			case 'd':
				if(i != str.length()-1)
				{
					if(str.charAt(i+1) == '-')
					{
						cnt++;
						i++;
					}
					else if(str.charAt(i+1) == 'z')
					{
						if((i+1) != str.length()-1 && str.charAt(i+2)=='=')
						{
							cnt++;
							i=i+2;
						}
						else
							cnt++;
					}
					else
						cnt++;
				}
				else
					cnt++;
				break;
			case 'l':
				if(i != str.length()-1)
				{
					if(str.charAt(i+1) == 'j')
					{
						cnt++;
						i++;
					}
					else
						cnt++;
				}
				else
					cnt++;
				
				break;
				
			case 'n':
				if(i != str.length()-1)
				{
					if(str.charAt(i+1) == 'j')
					{
						cnt++;
						i++;
					}
					else
						cnt++;
				}
				else
					cnt++;
				
				break;
				
			case 's':
				if(i != str.length()-1)
				{
					if(str.charAt(i+1) == '=')
					{
						cnt++;
						i++;
					}
					else
						cnt++;
				}
				else
					cnt++;
				
				break;
				
			case 'z':
				if(i != str.length()-1)
				{
					if(str.charAt(i+1) == '=')
					{
						cnt++;
						i++;
					}
					else
						cnt++;
				}
				else
					cnt++;
				
				break;
				
			default:
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
