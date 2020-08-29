package pkg1;

import java.util.Scanner;
public class pyramid2 
{

	public static void main(String[] args) 
	{
	
		System.out.print("Enter the number of rows for pyramid: ");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		obj.close();
		
		for(int n=num;n>=1;n--)
		{
			for(int m=1;m<=n;m++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
