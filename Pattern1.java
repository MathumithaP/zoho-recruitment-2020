
import java.util.Scanner;

public class Pattern1 {
	static void printpattern(String str,int n)
	{
		if(n%2!=0)
		{
		int k=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(i==0)
				{
					System.out.print(str.charAt(k));
				}
				else if(i<=n/2)
				{
					System.out.print(str.charAt(k+j));
				}
				else if(i>n/2)
				{
					if((k+j)<=n-1)
					{
					System.out.print(str.charAt(k+j));
					}
					else
					{
					System.out.print(str.charAt(j-(k+1)));
					}
				}
			}
			System.out.println("");
		}
		}
	}
public static void main(String arg[])
{
	String str;
	Scanner sc=new Scanner(System.in);
	str=sc.next();
	printpattern(str,str.length());
}
}
