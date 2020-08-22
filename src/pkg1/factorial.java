package pkg1;

import java.util.Scanner;

public class factorial 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		obj.close();
		
		int m=1;
		for(int i=1;i<=num;i++)
		{
			m=m*i;
		}
		
		System.out.println("Factorial of "+num+ " is: "+m);
	}
}
