package Fb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window();
driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
WebElement Signup=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
Signup.click();
WebElement name=driver.findElement(By.xpath("//*[@name='firstname']"));
name.sendKeys("Naina");
WebElement lastname=driver.findElement(By.xpath("//*[@name='lastname']"));
lastname.sendKeys("kalia");
WebElement email=driver.findElement(By.xpath("//*[@name='reg_email__']"));
email.sendKeys("nainakalia13@gmail.com");
WebElement pwd=driver.findElement(By.xpath("//*[@data-type='password']"));
pwd.sendKeys("nainakalia13");
WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
Select ddday=new Select(day);
ddday.selectByValue("10");
day.click();
WebElement month=driver.findElement(By.xpath("//*[@name='birthday_month']"));
Select ddmonth=new Select(month);
ddmonth.selectByVisibleText("Nov");
 List<WebElement> list=driver.findElements(By.xpath("//*[@name='birthday_month']"));
 for(WebElement month1:list) {
 System.out.println(month1.getText());
 
 }
 String Gender="Female";
 String genderXpath="//label[text()='placeholder']";
 String newXpath=genderXpath.replace("placeholder", Gender);
 System.out.println("xpath is" +newXpath);
 WebElement genderElem=driver.findElement(By.xpath(newXpath));
 genderElem.click();
	}}