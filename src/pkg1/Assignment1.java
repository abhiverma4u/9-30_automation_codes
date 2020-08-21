package pkg1;

public class Assignment1 
{																			
      public int sum(int a1, int a2)
      {
    	int a3=a1+a2;
    	System.out.println("Sum of "+a1+"+"+a2+" is: "+a3);
    	return a3;
      }
      
      public int sub(int s1, int s2)
      {
    	  int s3=s1-s2;
    	  System.out.println("Subrtaction of "+s1+"-"+s2+" is: "+s3);
    	  return s3;
      }
      
      public int mul(int m1, int m2)
      {
    	int m3=m1*m2;
    	System.out.println("Multiplication of "+m1+"*"+m2+" is: "+m3);
    	return m3;
      }
      
      public void div(int d1, int d2)
      {
    	  int d3=d1/d2;
    	  System.out.println("Final result after divison is: "+d3);
      }
      
      public static void main(String[] args) 
      {
    	System.out.println("\nSolution of ((((10+2)+2)-2)*2/2) is: \n");
		Assignment1 test1=new Assignment1();                              
		int add=test1.sum(10, 2);
		int sum1=test1.sum(add, 2);
		int sub1=test1.sub(sum1, 2);
		int mul1=test1.mul(sub1,2);
		test1.div(mul1, 2);
		
		
		System.out.println("\n\nSolution of (((((10-2)+2)-2)*2)/2) is: \n");
							
		int sub=test1.sub(10, 2);
		int add1=test1.sum(sub,2);
		int sub2=test1.sub(add1,2);
		int mul2=test1.mul(sub2, 2);
		test1.div(mul2, 2);
	  }      
      
}
