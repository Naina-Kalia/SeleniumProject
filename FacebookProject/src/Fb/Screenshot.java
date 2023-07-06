package Fb;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	TakesScreenshot tsobj= (TakesScreenshot)driver;
	File fileobj=tsobj.getScreenshotAs(OutputType.FILE);
File ScreenShotobj=new File("image.png");
FileUtils.copyFile(fileobj, ScreenShotobj);
	driver.close();	
	}

}
