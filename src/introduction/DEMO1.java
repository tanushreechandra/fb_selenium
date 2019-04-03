package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tanu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("85.tanushree@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mayank12345");
		driver.findElement(By.linkText("Forgot account?")).click();
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		
		//System.out.println(driver.getPageSource());
		
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		
		//driver.close();
	}

}
     