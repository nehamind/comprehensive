package comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comproj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet309\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://urbanladder.com");
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("nehamahana5353@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("neha@99");
		driver.findElement(By.xpath("//input[@class='button primary']")).click();
		Thread.sleep(5000);
		//verify for search bar
		WebElement searchBox=driver.findElement(By.id("search"));
		searchBox.sendKeys("study");
		searchBox.submit();
		WebElement d1=driver.findElement(By.xpath("//*[@id='search']"));
		d1.click();
		WebElement search=driver.findElement(By.id("search"));
		search.sendKeys("study chairs");
		search.submit();
		WebElement d2=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/a/img"));
		d2.click();		
	}

}
