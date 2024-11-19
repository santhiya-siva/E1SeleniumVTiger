package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartApplication {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		ele.sendKeys("iphone");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		ele.sendKeys("iphone");
		
		
	}

}
