import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariharesh\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/ServiceLogin/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
		WebElement uname = d.findElement(By.id("identifierId"));
		uname.sendKeys("revanth");
		WebElement btn = d.findElement(By.xpath("//span[text()='Next']"));
		btn.click();
		Thread.sleep(4000);
		WebElement pass = d.findElement(By.name("password"));
		pass.sendKeys("qwerty");
		WebElement btn1 = d.findElement(By.xpath("//span[text()='Next']"));
		btn1.click();
		d.quit();

	}

}
