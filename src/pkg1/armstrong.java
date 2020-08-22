package pkg1;

import java.util.Scanner;

public class armstrong 
{
	public void method1(int n)
	{
		int input, sum=0;
		input=n;
		
		while(n>0)
		{
			int bal=n%10;
			sum=sum+bal*bal*bal;
			n=n/10;
		}
		
		if(input==sum)
		{
			System.out.println(input+" is armstrong number");
		}
		else
		{
			System.out.println(input+" is not armstrong number");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		obj.close();
		
		armstrong obj1=new armstrong();
		obj1.method1(a);
	}
}
