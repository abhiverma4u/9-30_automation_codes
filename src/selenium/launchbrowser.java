package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
public class launchbrowser
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuldeep Yadav\\Downloads\\SAG\\New folder\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();                         //to maximize the window of chrome
	}
}
