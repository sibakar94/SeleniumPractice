package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	WebDriver driver;
	@Test
	public void invoke() {
		try {
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.guru99.com/handling-iframes-selenium.html");
			Assert.assertEquals("Handling iFrames in Selenium Webdriver: switchTo()",driver.getTitle());
			/*List<WebElement> frames=driver.findElements(By.tagName("iframe"));
			System.out.println(frames.size());
			driver.switchTo().frame(0);*/
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
