package pkg1;

public class Const1 
{
	public Const1()
	{
		this(1,2,3,4);
		System.out.println("This is default constructor");	
	}
		
	public Const1(int a)
	{
		this();
		System.out.println("This is 1 parametrized constructor");
	}
	
	public Const1(int a, int b)
	{
		this(1);
		System.out.println("This is 2 parametrized constructor");
	}
	
	public Const1(int a, int b, int c)
	{
		this(1,2);
		System.out.println("This is 3 parametrized constructor");
	}
	
	public Const1(int a, int b, int c, int d)
	{
		System.out.println("This is 4 parametrized constructor");
	}
	
	public static void main(String[] args) 
	{
			Const1 obj=new Const1(1,2,3);	
			System.out.println(obj);
	}	
}
