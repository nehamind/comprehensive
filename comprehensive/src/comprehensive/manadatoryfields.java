package comprehensive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class manadatoryfields {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet309\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com");
		System.out.println("page title:"+driver.getTitle());
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("li[class='header__topBarIconList_profile-icon']"))).build().perform();
		a.click(driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']"))).build().perform();

		 
		  driver.findElement(By.cssSelector("input[data-gaaction='signup_email_click']")).click(); 

		  Thread.sleep(10000L);
		 	}
	
	

}
 