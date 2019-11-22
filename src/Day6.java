import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.google.co.in/webhp");
	d.manage().window().maximize();
	WebElement apps = d.findElement(By.xpath("//a[@class='gb_D gb_rc']"));
	apps.click();
	WebElement gmail = d.findElement(By.xpath("//a[text()='Gmail']"));
	gmail.click();
}
}
