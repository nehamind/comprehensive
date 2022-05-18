package comprehensive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignment {

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
		searchBox.sendKeys("living");
		searchBox.submit();
		WebElement d1=driver.findElement(By.xpath("//*[@id='search']"));
				d1.click();
				WebElement search=driver.findElement(By.id("search"));
				search.sendKeys("Izmir Decadence Fabric Sofa");
				search.submit();
		WebElement d2=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/h2/span"));
		d2.click();
	}

}
