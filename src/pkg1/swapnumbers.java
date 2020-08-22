package pkg1;

public class swapnumbers 
{

	public void m1()
	{
		int a=2; 
		int b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("New value of a is: "+a);
		System.out.println("New value of b is: "+b);
	}
	
	public static void main(String[] args) 
	{
		swapnumbers obj=new swapnumbers();
		obj.m1();
		
	}
}
