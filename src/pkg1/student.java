package pkg1;

public class student 
{
      int rollno;
      int age;
      
      public void student1()
      {
    	  System.out.println("\n\tWelcome all");
      }
      
      public void student2()
      {
    	  System.out.println("\tAutomation is easy");
      }

      public static void main(String[] args)
      {
		student deepak=new student();   //object creation
		
		deepak.student1();     //calling method1
		deepak.student2();     //calling method2
		
		deepak.rollno=2;      //assign value to rollno
		deepak.age=26;        //assign value to age
		
		System.out.println("\n\tRoll no. of Deepak is "+deepak.rollno);
		System.out.println("\tAge of Deepak is "+deepak.age);
	}
}
