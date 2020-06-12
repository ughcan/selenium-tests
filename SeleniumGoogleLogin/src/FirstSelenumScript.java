import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenumScript {
	
	public static void main(String ...strings) {
		
		//setting friver properties
		System.setProperty("webdriver.chrome.driver", "c:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		
		
//		konvpalto420@gmail.com
//		pass - konVPalto_812

		driver.navigate().to("https://mail.google.com");
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//		#identifierId
		//enter email
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("konvpalto420@gmail.com");
		
		//click next button
		driver.findElement(By.cssSelector("#identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//enter passwordcamer
//		driver.findElement(By.cssSelector("#password")).sendKeys("konVPalto_812");
//		driver.findElement(By.name("password")).sendKeys("konVPalto_812");
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("konVPalto_812");
		
		
		//click next button
		driver.findElement(By.cssSelector("#passwordNext")).click();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//		driver.close();
//		driver.quit();
	}

}
