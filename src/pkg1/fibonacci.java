package pkg1;

import java.util.Scanner;

public class fibonacci 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		obj.close();
		
		int n1=0, n2=1, n3;
		System.out.print("Fibonacci Series is: "+n1+" "+n2);
		
		for(int i=2;i<=num;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
