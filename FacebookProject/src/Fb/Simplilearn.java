package Fb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplilearn {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.MILLISECONDS);
		
		System.out.println("the title is " +driver.getTitle());
	WebElement login=driver.findElement(By.linkText("Log in"));
	String location=login.getAttribute("href");
	System.out.println("the result is " +location);
login.click();
	WebElement username=driver.findElement(By.name("user_login"));
	username.sendKeys("abc@gmail.com");
	WebElement pwd=driver.findElement(By.name("user_pwd"));
	pwd.sendKeys("abc13");
	WebElement Login1=driver.findElement(By.name("btn_login"));
	Login1.click();
	
	List<WebElement> Alllinks=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links " +Alllinks.size());
	driver.close();

	
	}}