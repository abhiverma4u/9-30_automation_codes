package pkg1;
import java.util.Scanner;

public class prime 
{
	public void method1(int n)
	{
		int m, p=0;
		m=n/2;
		
		if(n==0||n==1)
		{  
			 System.out.println(n+" is not prime number");      
		}
		else
		{  
			  for(int i=2;i<=m;i++)
			  {      
			    if(n%i==0)
			    {      
			     System.out.println(n+" is not prime number");      
			     p=1;      
			     break;      
			    }      
			   }      
			   if(p==0)  
			   { 
				   System.out.println(n+" is prime number"); 
			   }  
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter any number: ");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		obj.close();
		
		prime obj1=new prime();
		obj1.method1(a);
	}
	
	
}
