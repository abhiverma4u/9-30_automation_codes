package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.Select;

public class signup
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuldeep Yadav\\Downloads\\SAG\\New folder\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();                         //to maximize the window of chorome
		
			
		WebElement user=driver.findElement(By.id("u_0_2"));  //create new account
		user.click();  //perform action-click create new account
		
		Thread.sleep(3000);
		
		WebElement first=driver.findElement(By.name("firstname"));  //firstname
		first.sendKeys("Pandya");  //perform action-enter first name
		
		WebElement last=driver.findElement(By.name("lastname"));  //lastname
		last.sendKeys("Bhau");  //perform action-enter last name
		
		WebElement email1=driver.findElement(By.id("u_1_g"));  //email
		email1.sendKeys("pandyabhau06@gmail.com");  //perform action- enter email
		
		WebElement email2=driver.findElement(By.name("reg_email_confirmation__"));  //email
		email2.sendKeys("pandyabhau06@gmail.com");  //perform action- enter email confirmation
		
		WebElement pass=driver.findElement(By.id("password_step_input"));  //password
		pass.sendKeys("!@#$%^&*()");  //perform action-enter password
		
		Thread.sleep(3000);
		
		WebElement drop1=driver.findElement(By.cssSelector("select#day"));
		Select s1=new Select(drop1);
		s1.selectByIndex(5);
		
		
		WebElement drop2=driver.findElement(By.cssSelector("select#month"));
		Select s2=new Select(drop2);
		s2.selectByIndex(7);
		
		WebElement drop3=driver.findElement(By.cssSelector("select#year"));
		Select s3=new Select(drop3);
		s3.selectByIndex(21);
		
		WebElement gender=driver.findElement(By.cssSelector("input[value='2']"));  //click on signup
		gender.click();  //perform action-click on signup button
		
		WebElement signup=driver.findElement(By.cssSelector("button[name='websubmit']"));  //create new account
		signup.click();  //perform action-click signup button
	}
}
