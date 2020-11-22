package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class junitndgeneric 
{

	public void dropbyval(String v, WebElement e)
	{
		Select s= new Select(e);
		s.selectByValue(v);
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		mainandgeneric gen=new mainandgeneric();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();                         //to maximize the window of chrome
		
			
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
		gen.dropbyval("13", drop1);
		
		
		WebElement drop2=driver.findElement(By.cssSelector("select#month"));
		gen.dropbyval("2", drop2);
		
		WebElement drop3=driver.findElement(By.cssSelector("select#year"));
		gen.dropbyval("1989", drop3);
		
		WebElement gender=driver.findElement(By.cssSelector("input[value='2']"));  //click on signup
		gender.click();  //perform action-click on signup button
		
		WebElement signup=driver.findElement(By.cssSelector("button[name='websubmit']"));  //create new account
		signup.click();  //perform action-click signup button
	}
}
