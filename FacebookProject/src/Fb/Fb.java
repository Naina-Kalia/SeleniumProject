package Fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("nainakalia676@gmail.com");
		WebElement pwd=driver.findElement(By.name("pass"));
		pwd.sendKeys("nainakalia13");
		WebElement login=driver.findElement(By.name("login"));
		login.click();

	}

}
