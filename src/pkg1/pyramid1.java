package pkg1;

import java.util.Scanner;

public class pyramid1
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number of rows for pyramid: ");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		obj.close();
		
		int n,m;
		for(n=1;n<=num;n++)
		{
			for(m=1;m<=n;m++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
		
		
}
