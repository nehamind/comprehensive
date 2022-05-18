package comprehensive;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet309\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.urbanladder.com");
				System.out.println("page title:"+driver.getTitle());
				Actions a= new Actions(driver);
				a.moveToElement(driver.findElement(By.cssSelector("li[class='header__topBarIconList_profile-icon']"))).build().perform();
				a.click(driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']"))).build().perform();

				  driver.findElement(By.id("spree_user_email")).sendKeys("nehamahana5353@gmail.com",Keys.TAB, "Neha@1234"); 
				  driver.findElement(By.cssSelector("input[data-gaaction='signup_email_click']")).click(); 
				  a.moveToElement(driver.findElement(By.cssSelector("li[class='header__topBarIconList_profile-icon']"))).build().perform();
				  driver.findElement(By.linkText("Profile")).click();
				  Thread.sleep(10000L);
				 	}
}